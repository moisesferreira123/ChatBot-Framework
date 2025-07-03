package br.com.TrabalhoEngSoftware.chatbot.specification;

import br.com.TrabalhoEngSoftware.chatbot.entity.DeckEntity;
import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.ListJoin;
import jakarta.persistence.criteria.Predicate;

public class DeckSpecificationBuilder extends SpecificationBuilder<DeckEntity> {
  private String title;
  private String topic;

  @SuppressWarnings("null")
  public DeckSpecificationBuilder(String title, String topic) {
    super();
    this.title = title;
    this.topic = topic;

    buildSpecification("filterByTitle", (root, query, criteriaBuilder)-> {
			Predicate titlePredicate = criteriaBuilder.conjunction();
			if(this.title != null && !this.title.isEmpty()) {
				titlePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("title")), "%" + this.title.toLowerCase() + "%");
			}
			return criteriaBuilder.and(titlePredicate);
		});

    buildSpecification("filterByTopic", (root, query, criteriaBuilder)-> {
			Predicate topicPredicate = criteriaBuilder.conjunction();
			if(this.topic != null && !this.topic.isEmpty() && !topic.equals("No filter")) {
				topicPredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("topic")), this.topic.toLowerCase());
			}
			return criteriaBuilder.and(topicPredicate);
		});

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

    buildSpecification("totalFlashcardsDesc", (root, query, criteriaBuilder) -> {
			ListJoin<DeckEntity, FlashcardEntity> flashcardJoin = root.joinList("flashcards", JoinType.LEFT);
			query.groupBy(root.get("id"));
			query.orderBy(criteriaBuilder.desc(criteriaBuilder.count(flashcardJoin)));
			return null;		
		});
  }
}
