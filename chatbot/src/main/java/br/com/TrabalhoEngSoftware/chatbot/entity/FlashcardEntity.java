package br.com.TrabalhoEngSoftware.chatbot.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import br.com.TrabalhoEngSoftware.chatbot.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftware.chatbot.enums.FlashcardType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_flashcard")
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class FlashcardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@CreatedDate
	@Column(nullable = false, updatable = false)
	protected LocalDateTime createdAt;
	
	@Column
	protected LocalDateTime lastReviewedAt;
	
	@Column
	protected LocalDateTime nextReview;
	
	// Quantidade de vezes que o card foi revisado com sucesso (sequencialmente).
	// Inicia em zero.
	@Column(nullable = false)
	protected int repetition;
	
	// Grau de facilidade do flashcard.
	// Começa com 2.5 e muda conforme o desempenho do usuário
	@Column(nullable = false)
	protected double easeFactor;
	
	//Quantidade de dias até a próxima revisão.
	//Começa em 1 e cresce conforme o algoritmo.
	// interval *= easeFactor;
	@Column(nullable = false)
	protected int interval;

	@Column(nullable = false)
	protected boolean supportsSpacedRepetition;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	protected FlashcardType type;
	
	@ManyToOne
	@JoinColumn(name="deck_id")
	protected DeckEntity deckEntity;
	
	public FlashcardEntity(FlashcardDTO flashcard) {
		BeanUtils.copyProperties(flashcard, this);
	}
	
	public FlashcardEntity() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlashcardEntity other = (FlashcardEntity) obj;
		return Objects.equals(id, other.id);
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

	public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
		this.lastReviewedAt = lastReviewedAt;
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
