package com.cardgame.cards;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CARDS_IN_PILE", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID")
})
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
    @Column(name = "CARD_ID", unique = false, nullable = false)
    private CardType cardId;

    @Column(name = "TAKEN", unique = false, columnDefinition = "boolean default false")
    private boolean taken;

    public Card() {
		super();
    }
    
	public Card(int id, CardType cardId, boolean taken) {
		super();
		this.id = id;
		this.cardId = cardId;
		this.taken = taken;
	}

    public Card(CardType cardId) {
		super();
		this.cardId = cardId;
	}

	public long getId() {
		return id;
	}

	public void setCardId(CardType cardId) {
		this.cardId = cardId;
	}

	public CardType getCardId() {
		return cardId;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
}
