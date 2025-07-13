package br.com.TrabalhoEngSoftwareFramework.framework.handler;

import org.springframework.data.jpa.domain.Specification;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;

public interface FlashcardTypeSearchHandler<E extends FlashcardEntity> {
  String supportsType(); // Retorna o  tipo de flashcard que este handler consegue processar
  
  /**
   * Cria uma Predicate para a busca por palavra-chave, específica para este tipo de Flashcard.
   *
   * @param root A Root<FlashcardEntity> para a consulta atual.
   * @param criteriaBuilder O CriteriaBuilder.
   * @param lowerCaseWordPattern O padrão de palavra a ser buscado (já em minúsculas e com wildcards).
   * @return Uma Predicate que representa a condição de busca para este tipo, ou null se nenhuma condição se aplicar.
   */
  Specification<E> getWordSearchSpecification(String word);
}
