package br.com.TrabalhoEngSoftwareFramework.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserDetails findByEmail(String email); 
}
