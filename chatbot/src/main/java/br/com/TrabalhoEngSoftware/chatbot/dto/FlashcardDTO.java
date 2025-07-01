package br.com.TrabalhoEngSoftware.chatbot.dto;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import br.com.TrabalhoEngSoftware.chatbot.entity.DeckEntity;
import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;
import br.com.TrabalhoEngSoftware.chatbot.enums.FlashcardType;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = StandardFlashcardDTO.class, name = "STANDARD"),
    @JsonSubTypes.Type(value = MultipleChoiceFlashcardDTO.class, name = "MULTIPLE_CHOICE"),
		@JsonSubTypes.Type(value = MultipleAnswersFlashcardDTO.class, name = "MULTIPLE_ANSWERS"),
		@JsonSubTypes.Type(value = TrueFalseFlashcardDTO.class, name = "TRUE_FALSE"),
		@JsonSubTypes.Type(value = DiscursiveFlashcardDTO.class, name = "DISCURSIVE")
})
public abstract class FlashcardDTO {
	
	protected Long id;
	protected LocalDateTime createdAt;
	protected LocalDateTime lastReviewedAt;
	protected LocalDateTime nextReview;
	protected int repetition;
	protected double easeFactor;
	protected int interval;
	protected DeckEntity deckEntity;
	protected boolean supportsSpacedRepetition;
	protected FlashcardType type;
	
	public FlashcardDTO(FlashcardEntity flashcard) {
		BeanUtils.copyProperties(flashcard, this);
	}
	
	public FlashcardDTO() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public void setLastReviewedAt(LocalDateTime lastReviewAt) {
		this.lastReviewedAt = lastReviewAt;
	}
	
	public LocalDateTime getNextReview() {
		return nextReview;
	}
	
	public void setNextReview(LocalDateTime nextReview) {
		this.nextReview = nextReview;
	}
	
	public int getRepetition() {
		return repetition;
	}
	
	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}
	
	public double getEaseFactor() {
		return easeFactor;
	}
	
	public void setEaseFactor(double easeFactor) {
		this.easeFactor = easeFactor;
	}
	
	public int getInterval() {
		return interval;
	}
	
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	public DeckEntity getDeckEntity() {
		return deckEntity;
	}
	
	public void setDeckEntity(DeckEntity deckEntity) {
		this.deckEntity = deckEntity;
	}

	public boolean isSupportsSpacedRepetition() {
		return supportsSpacedRepetition;
	}

	public void setSupportsSpacedRepetition(boolean supportsSpacedRepetition) {
		this.supportsSpacedRepetition = supportsSpacedRepetition;
	}

	public FlashcardType getType() {
		return type;
	}

	public void setType(FlashcardType type) {
		this.type = type;
	}	
}
