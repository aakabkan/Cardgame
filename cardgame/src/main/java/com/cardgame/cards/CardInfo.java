package com.cardgame.cards;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CARD_INFOS", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID")
})
public class CardInfo {
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private CardType id;
	
    @Column(name = "DESCRIPTION", unique = false, nullable = false)
    private String description;

    @Column(name = "SCORE", unique = false, nullable = true)
    private int score;

    public CardInfo() {
		super();
	}

	public CardInfo(CardType id, String description, int score) {
		super();
		this.id = id;
		this.description = description;
		this.score = score;
	}

	public void setId(CardType id) {
		this.id = id;
	}

	public CardType getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", description=" + description + "]";
	}	
}
