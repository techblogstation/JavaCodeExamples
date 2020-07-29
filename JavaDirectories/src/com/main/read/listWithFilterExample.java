package com.main.read;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.DirectoryStream.Filter;

public class listWithFilterExample {

	public static void main(String[] args) {
		try {
			File directory = new File("E://path");

			FilenameFilter txtFileFilter = new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					if (name.endsWith(".txt")) {
						return true;
					} else {
						return false;
					}
				}
			};

			String[] files = directory.list(txtFileFilter);

			for (String file : files) {
				System.out.println(file);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
