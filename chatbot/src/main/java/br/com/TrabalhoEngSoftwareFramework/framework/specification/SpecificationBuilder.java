package br.com.TrabalhoEngSoftwareFramework.framework.specification;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.domain.Specification;

import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;

public abstract class SpecificationBuilder<T> {
  protected Specification<T> desiredSpecification;
  protected Map<String, Specification<T>> allSpecifications;
  
  public SpecificationBuilder() {
    this.desiredSpecification = Specification.where(null);
    this.allSpecifications = new HashMap<>();
    registerAllSpecifications();
  }

  public void addDesiredSpecification(String specificationName) {
    this.desiredSpecification = this.desiredSpecification.and(allSpecifications.get(specificationName));
  } 

  protected void buildSpecification(String specificationName, Specification<T> spec) {
    if(spec != null) allSpecifications.put(specificationName, spec);
    else throw new InvalidObjectDataException("It is necessary to place a Specification<T> not null to build the specification");
  }

  /**
  * Implementação obrigatória do cliente, onde ele terá que adicionar todas as especificações para poder usá-las depois 
  * com a finalidade de construir a especificação desejada através do método addSpecification. Exemplo de adição de método:
  * 
  * buildSpecification("createdAtAsc", (root, query, criteriaBuilder) -> {
  *   query.orderBy(criteriaBuilder.asc(root.get("createdAt")));
  *   return criteriaBuilder.conjunction();
  * });
  */
  protected abstract void registerAllSpecifications();

  public Specification<T> build(Long parentId, String parentEntity) {
    if(parentId != null  && parentEntity != null) {
      return this.desiredSpecification.and((root, query, criteriaBuilder) -> 
        criteriaBuilder.equal(root.get(parentEntity).get("id"), parentId)
      );
    }
    return this.desiredSpecification;
  }
}
