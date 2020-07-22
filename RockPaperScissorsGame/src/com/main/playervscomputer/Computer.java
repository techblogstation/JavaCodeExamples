package com.main.playervscomputer;

import java.util.Random;

public class Computer extends Player {

	private String value;

	public String getValue() {

		return value;
	}

	public void setValue() {
		Random random = new Random();

		int num = random.nextInt(3) + 1;

		if (num == 1)
			value = "R";
		else if (num == 2)
			value = "P";
		else
			value = "S";
	}

}
