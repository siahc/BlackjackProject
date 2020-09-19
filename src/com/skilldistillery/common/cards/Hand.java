package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public abstract class Hand {
	
	protected List<Card> cards = new ArrayList<Card>();

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public Hand() {
		
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		cards.clear();
	}
	
	public abstract int getHandValue();

	// prints out info (list) from hand
	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
	
	

}
