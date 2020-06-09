package com.cardgame.cards;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService{
	
	@Autowired
    private CardRepository cardRepository;
 
    public List<Card> list() {
        return cardRepository.findAll();
    }

	public Optional<Card> findById(int id) {
		return cardRepository.findById(id);
	}

	public void save(Card card) {
		cardRepository.save(card);
	}

	public void delete(int id) {
		cardRepository.deleteById(id);
	}
}
