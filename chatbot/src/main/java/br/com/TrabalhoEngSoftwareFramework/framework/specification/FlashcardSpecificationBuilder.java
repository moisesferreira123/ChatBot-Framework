package br.com.TrabalhoEngSoftwareFramework.framework.specification; 

import java.util.Map;

import org.springframework.data.jpa.domain.Specification;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeSearchHandler;
import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeSearchRegistry;
import jakarta.persistence.criteria.Expression;

public abstract class FlashcardSpecificationBuilder extends SpecificationBuilder<FlashcardEntity> {
  
    private final FlashcardTypeSearchRegistry searchRegistry; // Injeta o registry
    
    @SuppressWarnings("null")
    public FlashcardSpecificationBuilder(FlashcardTypeSearchRegistry searchRegistry) {
        super(); 
        this.searchRegistry = searchRegistry;

        // ====================================================================
        // ESPECIFICAÇÕES PADRÕES/FRAMEWORK-LEVEL REGISTRADAS AQUI
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

        Map<String, FlashcardTypeSearchHandler<? extends FlashcardEntity>> allHandlesType = searchRegistry.getHandlers();
        Specification<FlashcardEntity> combinedSpec = Specification.where(null);

        for (Map.Entry<String, FlashcardTypeSearchHandler<? extends FlashcardEntity>> entry : allHandlesType.entrySet()) {
            String type = entry.getKey();
            FlashcardTypeSearchHandler<? extends FlashcardEntity> handler = entry.getValue();
    
            // Filtro por tipo específico
            Specification<FlashcardEntity> specType = (r, q, cb) -> cb.equal(r.get("flashcardType"), type);
    
            // Filtro adicional do handler
            @SuppressWarnings("unchecked")
            Specification<FlashcardEntity> handlerSpec = (Specification<FlashcardEntity>) handler.getWordSearchSpecification(word);
    
            // Combina: (tipo == X) AND (filtro handler de X)
            Specification<FlashcardEntity> spec = specType.and(handlerSpec);
    
            // Acumula com OR: tipo A OU tipo B OU tipo C ...
            combinedSpec = combinedSpec.or(spec);
        }
        
        super.desiredSpecification = super.desiredSpecification.and(combinedSpec);
        
        return this; 
    }
}