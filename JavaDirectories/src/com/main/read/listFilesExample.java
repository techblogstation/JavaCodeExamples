package com.main.read;

import java.io.File;

public class listFilesExample {

	public static void main(String[] args) {
		try {
			File directory = new File("E://path");

			File[] files = directory.listFiles();

			for (File file : files) {
				System.out.println(file);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
