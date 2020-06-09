package com.cardgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan

public class CardgameApplication{
   
	public static void main(String[] args) {
		SpringApplication.run(CardgameApplication.class, args);
	}

}
