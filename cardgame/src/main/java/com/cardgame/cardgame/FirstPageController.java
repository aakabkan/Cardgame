package com.cardgame.cardgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstPageController {
	@Autowired
	private GameSetup gameSetup;

    @RequestMapping(value="/cardgame", method = RequestMethod.GET)
    public String showStartPage(ModelMap model){
        return "welcome";
    }

    @RequestMapping(value="/cardgame", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam(value="name",required=false) String name, @RequestParam(value="password",required=false) String password, @RequestParam(value="repassword",required=false) String repassword, @RequestParam(value="nPlayers",required=false) String nPlayers){
   		gameSetup.createGame(model,nPlayers);
        return "board";
    }

}
