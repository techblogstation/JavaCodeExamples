package com.main.write;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class writeFileExample {

	public static void getFileObject(File dir) throws IOException {
		FilenameFilter txtFileFilter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.equals("a.txt")) {
					return true;
				} else {
					return false;
				}
			}
		};

		File[] files = dir.listFiles(txtFileFilter);

		for (File file : files) {
			write(file);
		}
	}

	public static void write(File file) throws IOException {
		FileWriter writer = new FileWriter(file);
		writer.write("Hello World!");
		writer.close();
	}

	public static void main(String[] args) {

		try {
			File file = new File("E://path");
			getFileObject(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
