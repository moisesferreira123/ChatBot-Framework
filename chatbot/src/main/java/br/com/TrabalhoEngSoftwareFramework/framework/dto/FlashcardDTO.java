package br.com.TrabalhoEngSoftwareFramework.framework.dto;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    // Será colocado pelo cliente
})
public abstract class FlashcardDTO {
	
	protected LocalDateTime createdAt;
	protected LocalDateTime lastReviewedAt;
	protected String type;
	
	public FlashcardDTO(FlashcardEntity flashcard) {
		BeanUtils.copyProperties(flashcard, this);
	}
	
	public FlashcardDTO() {
		
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getLastReviewedAt() {
		return lastReviewedAt;
	}

	public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
		this.lastReviewedAt = lastReviewedAt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
