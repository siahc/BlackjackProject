package com.skilldistillery.common.cards;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		return 0;
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
