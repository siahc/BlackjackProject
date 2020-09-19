package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Deck;

public class Dealer extends Player{
	
	public Deck deck = new Deck();
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void showUpCard() {
		System.out.println("Dealer's up card is a: " + bjHand.getCards().get(0));
	}
	public void shuffleDeck() {
		deck.shuffle();
	}
	

}
