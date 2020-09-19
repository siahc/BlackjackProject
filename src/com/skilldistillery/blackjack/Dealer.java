package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Deck;

public class Dealer extends Player{
	
	private Deck deck = new Deck();

	public void shuffleDeck() {
		deck.shuffle();
	}
	
	public void resetDeck() {
		deck.resetDeck();
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void showUpCard() {
		System.out.println("Dealer's up card is: " + bjHand.getCards().get(0));
	}

}
