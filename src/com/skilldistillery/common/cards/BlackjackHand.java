package com.skilldistillery.common.cards;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		int val = 0;
		for (int i = 0; i < cards.size(); i++) {
			Card c = cards.get(i);
			val += c.getValue();
		}
		return val;
	}
	
	public boolean isBlackjack() {
		if (getHandValue() == 21 ) {
			return true;
		} return false;
	}
	public boolean isBust() {
		if (getHandValue() > 21 ) {
			return true;
		} return false;
	}
	
	

}
