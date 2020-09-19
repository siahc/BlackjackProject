package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.BlackjackHand;
import com.skilldistillery.common.cards.Card;

public class Player {

	public BlackjackHand bjHand = new BlackjackHand();

	public void showHand() {
		System.out.println(bjHand);

	}

	public int getHandValue() {
		return bjHand.getHandValue();
	}

	public void takeCard(Card c) {
		bjHand.addCard(c);
	}
	public void clearHand() {
		bjHand.clear();
	}
	
}
