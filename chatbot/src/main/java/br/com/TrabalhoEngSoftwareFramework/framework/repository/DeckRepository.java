package br.com.TrabalhoEngSoftwareFramework.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;

public interface DeckRepository extends JpaRepository<DeckEntity, Long>, JpaSpecificationExecutor<DeckEntity>{
  void deleteByUserEntityId(Long userId);
}
