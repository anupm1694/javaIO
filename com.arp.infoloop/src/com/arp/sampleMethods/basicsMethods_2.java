package com.arp.sampleMethods;

import java.io.File;
import java.io.IOException;

public class basicsMethods_2 {

	public static void main(String[] args) {

		File file = new File("E:/examples/sight.txt");

		// checking to see if the file already exists or not
		System.out.println(file.exists());

		try {
			// creates a new file named as sight.txt
			file.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
