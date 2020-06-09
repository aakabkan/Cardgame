package com.cardgame.cardgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.cardgame.cards.CardInfoService;

@Controller
@SessionAttributes({"name", "description1", "description2", "description3", "description4","score"})
public class GameController { 
    @Autowired
    CardInfoService cardInfoService;

    @Autowired
	private GameSetup gameSetup;

    @Autowired
	private GameService gameService;

    @RequestMapping(value = "/board", method=RequestMethod.GET)
    public String playRound(@RequestParam(value = "cardNumber")int cardNumber, ModelMap model) {
        return gameService.updateBoard(model, cardNumber);
    }
      
	@RequestMapping(value="/board", method = RequestMethod.POST)
    public String showBoard(ModelMap model, @RequestParam(value="nPlayers",required=false) String nPlayers){
    		gameSetup.createGame(model, nPlayers);
        	return "board";
    }
}
