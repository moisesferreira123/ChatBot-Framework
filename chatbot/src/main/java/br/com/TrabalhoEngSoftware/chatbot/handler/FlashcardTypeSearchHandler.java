package br.com.TrabalhoEngSoftware.chatbot.handler;

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public interface FlashcardTypeSearchHandler {
  String supportsType(); // Retorna o  tipo de flashcard que este handler consegue processar
  
  /**
   * Cria uma Predicate para a busca por palavra-chave, específica para este tipo de Flashcard.
   *
   * @param root A Root<FlashcardEntity> para a consulta atual.
   * @param criteriaBuilder O CriteriaBuilder.
   * @param lowerCaseWordPattern O padrão de palavra a ser buscado (já em minúsculas e com wildcards).
   * @return Uma Predicate que representa a condição de busca para este tipo, ou null se nenhuma condição se aplicar.
   */
  Predicate getWordSearchPredicate(Root<FlashcardEntity> root, CriteriaBuilder criteriaBuilder, String word);
}
