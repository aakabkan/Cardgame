package com.cardgame.cards;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardInfoService{
	
	@Autowired
    private CardInfoRepository cardInfoRepository;
 
    public List<CardInfo> list() {
        return cardInfoRepository.findAll();
    }

	public Optional<CardInfo> findById(CardType id) {
		return cardInfoRepository.findById(id);
	}

	public void save(CardInfo cardInfo) {
		cardInfoRepository.save(cardInfo);
	}

	public void delete(CardType id) {
		cardInfoRepository.deleteById(id);
	}
}
