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

		System.out.println("Welome to the Casino! Would you like to play a game? Please  " + "select 'y' or 'n'. ");
		String selection = input.nextLine();

		switch (selection) {
		case "y": {
			app.launch();
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		dealer.shuffleDeck();
		
		
			break;
		}
		case "n": {
			app.exit();
			break;
		}
		default: {
			System.out.println("Invalid entry. Please sect'y' or 'n'. ");
			break;
		}
	}
		
		
}

	private void launch() {
		// TODO Auto-generated method stub
		load();
		menu();

	}

	private void exit() {
		System.out.println("Goodbye");
	}

}
