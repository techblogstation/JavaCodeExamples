package com.main.create;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createDirectoriesExample {

	public static void main(String[] args) {
		try {
			 Path path = Files.createDirectories(Paths.get("E://path/dir_createdirectories"));
			 System.out.println(path);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
