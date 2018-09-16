package com.arp.sampleMethods;

import java.io.File;

public class BasicsMethods_4 {
 
	public static void main(String[] args) throws Exception {

		File file = new File("E:/Examples/data.txt");

		file.createNewFile();

		// gets the name of the file
		System.out.println(file.getName());

		// gets the parent or root of the file
		System.out.println(file.getParentFile());

		// gets the absolute pat h of the file The absolute path of a file is
		// this path if the File is absolute, and resolved in an OS dependent
		// way if not
		System.out.println(file.getAbsolutePath());

		// gets the path of the file
		System.out.println(file.getPath());

		// gets the canonical path of the file The canonical path is unique for
		// a given file,computed in an OS dependent way
		System.out.println(file.getCanonicalPath());

	}
}
