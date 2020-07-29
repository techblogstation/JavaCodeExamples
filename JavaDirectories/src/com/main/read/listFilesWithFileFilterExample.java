package com.main.read;

import java.io.File;
import java.io.FileFilter;

public class listFilesWithFileFilterExample {

	public static void main(String[] args) {
		try {
			File directory = new File("E://path");

			FileFilter txtFileFilter = new FileFilter() {

				@Override
				public boolean accept(File dir) {
					if(dir.isDirectory()) {
						return true;
					}else {
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
