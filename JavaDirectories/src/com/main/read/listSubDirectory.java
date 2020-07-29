package com.main.read;

import java.io.File;

public class listSubDirectory {

	private static void listFiles(String path) {
		
		File folder = new File(path);

		File[] files = folder.listFiles();

		for (File file : files) {
			if (file.isFile()) {
				System.out.println(file.getName());
			} else if (file.isDirectory()) {
				System.out.println(file.getName());
				listFiles(file.getAbsolutePath());
			}
		}
	}

	public static void main(String[] args) {

		listFiles("E://path");

	}

}
