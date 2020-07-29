package com.main.read;

import java.io.File;
import java.io.FilenameFilter;

public class listFilesWithNameFilterExample {

	public static void main(String[] args) {
		try {
			File directory = new File("E://path");

			FilenameFilter txtFileFilter = new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					if (name.startsWith("a")) {
						return true;
					} else {
						return false;
					}
				}
			};

			File[] files = directory.listFiles(txtFileFilter);

			for (File file : files) {
				System.out.println(file);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
