package com.skilldistillery.blackjack;

import java.util.Scanner;

public class CasinoApp {

	private static Scanner input = new Scanner(System.in);
	Player p = new Player();
	Dealer d = new Dealer();

	public CasinoApp() {
	}

	public static void main(String[] args) {
		CasinoApp app = new CasinoApp();
		app.launch();
	}

	private void launch() {
		System.out.println("Welome to the Casino!");

		while (true) {
			System.out.println();
			System.out.println("Would you like to play a game? Please  " + "select 'y' or 'n'. ");
			String selection = input.nextLine();

			switch (selection) {
			case "y": {
				play();
				break;
			}
			case "n": {
				exit();
				return;
			}
			default: {
				System.out.println("Invalid entry. Please sect'y' or 'n'. ");
				break;
			}
			}
		}
	}

	private void play() {
		d.clearHand();
		p.clearHand();
		
		d.resetDeck();
		d.shuffleDeck();
		
		p.takeCard(d.dealCard());
		d.takeCard(d.dealCard());
		p.takeCard(d.dealCard());
		d.takeCard(d.dealCard());

		d.showUpCard();

		// player's turn
		System.out.println();
		System.out.println("Player's turn:");
		boolean done = false;
		boolean blackjack = false;
		while (!done) {
			printPlayer();
			if (p.getHandValue() == 21) {
				System.out.println("Blackjack!");
				blackjack = true;
				done = true;
				continue;
			}
			if (p.isBust()) {
				System.out.println("Bust! Dealer wins. ");
				printDealer();
				return;
			}

			System.out.println("Press 1 to hit or 2 to stay:");
			int option = input.nextInt();
			input.nextLine();
			switch (option) {
			case 1: {
				p.takeCard(d.dealCard());
				break;
			}
			case 2: {
				done = true;
				break;
			}
			}
		}

		// dealer's turn
		System.out.println();
		System.out.println("Dealer's turn:");
		while (!blackjack && d.getHandValue() < 17) {
			printDealer();
			d.takeCard(d.dealCard());
		}

		System.out.println();
		if (d.isBust()) {
			System.out.println("Dealer busted. You WIN!!!!!");
		} else if (p.getHandValue() > d.getHandValue()) {
			System.out.println("You Win!!!!");
		} else if (p.getHandValue() == d.getHandValue()) {
			System.out.println("PUSH!!!!");
		} else {
			System.out.println("Sorry, you lost");
		}

		// end game
		printPlayer();
		printDealer();
	}

	public void printPlayer() {
		System.out.printf("Player(%d): ", p.getHandValue());
		p.showHand();
	}

	public void printDealer() {
		System.out.printf("Dealer(%d): ", d.getHandValue());
		d.showHand();
	}

	private void exit() {
		System.out.println("Goodbye");
	}

}
