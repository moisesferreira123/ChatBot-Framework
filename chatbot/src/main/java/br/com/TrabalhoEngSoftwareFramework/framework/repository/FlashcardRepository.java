package br.com.TrabalhoEngSoftwareFramework.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;

public interface FlashcardRepository extends JpaRepository<FlashcardEntity, Long>, JpaSpecificationExecutor<FlashcardEntity>{
  
}
