package com.arp.sampleMethods;

import java.io.File;

public class BasicsMethods_1 {

	public static void main(String[] args) {

		File file = new File("E:/examples/data.txt");
		// checks if the file exists or not
		System.out.println(file.exists());

		// checks if the file is a Directory or not
		System.out.println(file.isDirectory());

		// checks if the file is a file or not
		System.out.println(file.isFile());

		// checks if the file can be read
		System.out.println(file.canRead());

		// checks if the file can be written
		System.out.println(file.canWrite());
		
		//checks if the file is an executable or not
		System.out.println(file.canExecute());

	}

}
