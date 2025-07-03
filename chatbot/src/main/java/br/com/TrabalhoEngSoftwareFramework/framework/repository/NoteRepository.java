package br.com.TrabalhoEngSoftwareFramework.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;

public interface NoteRepository extends JpaRepository<NoteEntity, Long>, JpaSpecificationExecutor<NoteEntity>{
  void deleteByUserEntityId(Long userId);
}
