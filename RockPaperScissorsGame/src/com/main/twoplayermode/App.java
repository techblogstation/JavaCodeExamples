package com.main.twoplayermode;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String value = "";

		Player player1 = new Player();
		Player player2 = new Player();

		player1.setId(1);
		player1.setName("Player 1");
		
		player2.setId(2);
		player2.setName("Player 2");
		
		System.out.println("** R stands for Rock, P stands for Paper, S stands for Scissors **\n");
		
		System.out.println("Hi " + player1.getName() + " , Please enter any one of the values - R, P, S");
		
		value = scan.next();
		
		while (!"R".equalsIgnoreCase(value) && !"P".equalsIgnoreCase(value) && !"S".equalsIgnoreCase(value)) {
			System.out.println("You have entered Invalid value, Enter any one of R, P, S ");
			value = scan.next();
		}
		
		player1.setValue(value);

		
		System.out.println("Hi " + player2.getName() + " , Please enter any one of the values - R, P, S\n");
		
		value = scan.next();
		
		while (!"R".equalsIgnoreCase(value) && !"P".equalsIgnoreCase(value) && !"S".equalsIgnoreCase(value)) {
			System.out.println("You have entered Invalid value, Enter any one of R, P, S ");
			value = scan.next();
		}
		
		player2.setValue(value);

		if (player1.getValue().equalsIgnoreCase(player2.getValue())) {
			System.out.println("Game is Draw");
		} else {
			Player winner = new Game().play(player1, player2);

			System.out.println("The Winner is - " + winner.getName());
		}
		
		scan.close();
	}

}
