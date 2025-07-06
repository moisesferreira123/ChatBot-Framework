package br.com.TrabalhoEngSoftwareFramework.framework.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public abstract class FlashcardDTO {
	
	protected LocalDateTime createdAt;
	protected LocalDateTime lastReviewedAt;
	protected String flashcardType;
	
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

	public String getFlashcardType() {
		return flashcardType;
	}

	public void setFlashcardType(String flashcardType) {
		this.flashcardType = flashcardType;
	}
}
