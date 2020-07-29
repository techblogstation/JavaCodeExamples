package com.main.create;

import java.io.File;

public class MkdirExample {

	public static void main(String[] args) {

		try {
			boolean fileCreated = new File("E://path/directory_mkdir").mkdir();
			System.out.println(fileCreated);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
