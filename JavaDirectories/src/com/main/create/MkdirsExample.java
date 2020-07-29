package com.main.create;

import java.io.File;

public class MkdirsExample {

	public static void main(String[] args) {

		try {

			boolean fileCreated2 = new File("E://path/directory_mkdirs").mkdirs();
			System.out.println(fileCreated2);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
