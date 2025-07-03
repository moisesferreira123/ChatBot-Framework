package br.com.TrabalhoEngSoftware.chatbot.specification; 

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;
import br.com.TrabalhoEngSoftware.chatbot.exception.InvalidObjectDataException;
import br.com.TrabalhoEngSoftware.chatbot.handler.FlashcardTypeSearchHandler; // Nova importação
import br.com.TrabalhoEngSoftware.chatbot.handler.FlashcardTypeSearchRegistry; // Nova importação
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.criteria.Expression;
import java.util.Optional;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FlashcardSpecificationBuilder extends SpecificationBuilder<FlashcardEntity> {
  
    private final FlashcardTypeSearchRegistry searchRegistry; // Injeta o registry
    
    @SuppressWarnings("null")
    public FlashcardSpecificationBuilder(FlashcardTypeSearchRegistry searchRegistry) {
        super(); 
        this.searchRegistry = searchRegistry;

        // ====================================================================
        // ORDENAÇÕES PADRÃO/FRAMEWORK-LEVEL REGISTRADAS AQUI
        // ====================================================================
        buildSpecification("createdAtAsc", (root, query, criteriaBuilder) -> {
          query.orderBy(criteriaBuilder.asc(root.get("createdAt")));
          return criteriaBuilder.conjunction();
        });

        buildSpecification("createdAtDesc", (root, query, criteriaBuilder) -> {
          query.orderBy(criteriaBuilder.desc(root.get("createdAt")));
          return criteriaBuilder.conjunction();
        });

        buildSpecification("lastReviewedAtAsc", (root, query, criteriaBuilder) -> {
	        Expression<Object> nullsLast = criteriaBuilder.selectCase()
	            .when(criteriaBuilder.isNull(root.get("lastReviewedAt")), 1)
	            .otherwise(0);

	        query.orderBy(
	            criteriaBuilder.asc(nullsLast),
	            criteriaBuilder.desc(root.get("lastReviewedAt"))
	        );
	        return null;
	      });
        
        buildSpecification("lastReviewedAtDesc", (root, query, criteriaBuilder) -> {
          query.orderBy(criteriaBuilder.asc(root.get("lastReviewedAt")));
          return null;
        });
    }

    /**
     * Adiciona um filtro de palavra-chave, delegando a lógica específica do tipo para o registro de handlers.
     *
     * @param word A palavra-chave a ser pesquisada.
     * @return O próprio builder para encadeamento.
     */
    public FlashcardSpecificationBuilder addWordFilter(String word) {
        if (word == null || word.trim().isEmpty()) {
            return this;
        }

        String lowerCaseWordPattern = "%" + word.toLowerCase() + "%";

        super.specification = super.specification.and(
            (root, query, criteriaBuilder) -> {
                String flashcardType = (root.get("type").as(String.class)).toString(); 
                
                // Use o registry para encontrar o handler apropriado
                Optional<FlashcardTypeSearchHandler> handlerOptional = this.searchRegistry.getHandler(flashcardType);

                if (handlerOptional.isPresent()) {
                  FlashcardTypeSearchHandler handler = handlerOptional.get();
                  // Delega para o handler específico para obter a predicate
                  return handler.getWordSearchPredicate(root, criteriaBuilder, lowerCaseWordPattern);
                } else {
                  // Nenhum handler específico encontrado para este tipo, exclua da busca por palavra-chave
                  throw new InvalidObjectDataException("Aviso: Nenhum FlashcardTypeSearchHandler encontrado para o tipo: " + flashcardType + ". Flashcards deste tipo serão excluídos da busca por palavra-chave."); 
                }
            }
        );
        return this; 
    }
}