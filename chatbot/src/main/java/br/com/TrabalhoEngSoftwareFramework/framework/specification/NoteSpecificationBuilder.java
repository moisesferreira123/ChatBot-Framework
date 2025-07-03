package br.com.TrabalhoEngSoftwareFramework.framework.specification;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
import jakarta.persistence.criteria.Predicate;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class NoteSpecificationBuilder extends SpecificationBuilder<NoteEntity> {
  private String title;
	
  @SuppressWarnings("null")
	public NoteSpecificationBuilder(String title) {
    super();
    this.title = title;

    buildSpecification("filterByTitle", (root, query, criteriaBuilder)-> {
			Predicate titlePredicate = criteriaBuilder.conjunction();
			if(this.title != null && !this.title.isEmpty()) {
				titlePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("title")), "%" + this.title.toLowerCase() + "%");
			}
			return criteriaBuilder.and(titlePredicate);
		});

    buildSpecification("createdAtDesc", (root, query, criteriaBuilder) -> {
			query.orderBy(criteriaBuilder.desc(root.get("createdAt")));
			return null;
		});

    buildSpecification("createdAtAsc", (root, query, criteriaBuilder) -> {
			query.orderBy(criteriaBuilder.asc(root.get("createdAt")));
			return null;
		});

    buildSpecification("updatedAtDesc", (root, query, criteriaBuilder) -> {
			query.orderBy(criteriaBuilder.desc(root.get("updatedAt")));
			return null;
		});
		
    buildSpecification("updatedAtAsc", (root, query, criteriaBuilder) -> {
			query.orderBy(criteriaBuilder.asc(root.get("updatedAt")));
			return null;
		});
  }
}
