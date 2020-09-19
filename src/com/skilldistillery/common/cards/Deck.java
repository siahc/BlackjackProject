package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = createDeck();
	}
	
	public void resetDeck() {
		cards = createDeck();
	}
	
	public List<Card> createDeck(){
		List<Card> deck = new ArrayList<>(52);
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				deck.add(new Card(r,s));
			}
		}
		return deck;
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card dealCard() {
		return cards.remove(0);
	}
	// This is to show the shuffled deck in menu
	public void show() {
		for (int i = 0; i < cards.size(); i++) {
			System.out.println(cards.get(i));
		}
		
	}
	
	// User Story #2
	// ... You should be able to print out a shuffled deck to the terminal.
	// This is not called in our blackjack program (nobody should be peeking into the deck, either dealer or player)
	// but it is possible to print a deck when debugging.
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}
}
