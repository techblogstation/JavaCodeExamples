package com.main.playervscomputer;

public class Game {

	private Player winner;

	public Player play(Player player1, Player player2) {

		String val1 = player1.getValue();
		String val2 = player2.getValue();

		if (val1.equalsIgnoreCase("R")) {
			winner = val2.equalsIgnoreCase("S") ? player1 : player2;
		} else if (val1.equalsIgnoreCase("P")) {
			winner = val2.equalsIgnoreCase("R") ? player1 : player2;
		} else {
			winner = val2.equalsIgnoreCase("P") ? player1 : player2;
		}
		return winner;

	}

}
