package br.com.TrabalhoEngSoftwareFramework.framework.specification;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.domain.Specification;

import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;

public abstract class SpecificationBuilder<T> {
  protected Specification<T> specification;
  protected Map<String, Specification<T>> specifications;
  
  public SpecificationBuilder() {
    this.specification = Specification.where(null);
    this.specifications = new HashMap<>();
  }

  public void addSpecification(String specificationName) {
    this.specification = this.specification.and(specifications.get(specificationName));
  } 

  protected void buildSpecification(String specificationName, Specification<T> spec) {
    if(spec != null) specifications.put(specificationName, spec);
    else throw new InvalidObjectDataException("It is necessary to place a Specification<T> not null to build the specification");
  }

  public Specification<T> build(Long parentId, String parentEntity) {
    if(parentId != null  && parentEntity != null) {
      return this.specification.and((root, query, criteriaBuilder) -> 
        criteriaBuilder.equal(root.get(parentEntity).get("id"), parentId)
      );
    }
    return this.specification;
  }
}
