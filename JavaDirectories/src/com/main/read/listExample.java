package com.main.read;

import java.io.File;

public class listExample {

	public static void main(String[] args) {
		try {
			File directory = new File("E://path");

			String[] fileNames = directory.list();

			for (String name : fileNames) {
				System.out.println(name);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
