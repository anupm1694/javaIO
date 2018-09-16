package com.arp.sampleMethods;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicsMethods_5 {

	public static void main(String[] args) throws Exception {

		File file = new File("E:/Examples/data.txt");

		Path path = file.toPath();

		System.out.println(path.toAbsolutePath());

		Path path1 = new File("E:/Examples/sight.txt").toPath();

		// Compares two paths(path and path1) it returns true if both the paths points to the same file
		System.out.println(Files.isSameFile(path, path1));

		// resolve() and relativize()
		// Relativizing two paths consists in creating a relative path from one to the other

		// Case 1: Resolving given two relative paths

		Path root = Paths.get("E:/examples");// relative path
		Path child = Paths.get("data.txt");// relative path
		Path resolved = root.resolve(child);// output will be concatenated to the root
		System.out.println(resolved);// output:- E:/examples/data.txt

		// Case 2: if the child path is absolute path then

		Path root1 = Paths.get("examples");
		Path child1 = Paths.get("E:/examples/data.txt");
		Path resolved1 = root1.resolve(child1);// the resolved will be the child path only
		System.out.println(resolved1);// Output:-E:/examples/data.txt

		// One more interesting method that is resolveSibling
		Path root2 = Paths.get("E:/examples/data.txt");
		Path sibling = Paths.get("sight.txt");// this method removes the child from parent and add the sibling
		Path resolvedsibling = root2.resolveSibling(sibling);
		System.out.println(resolvedsibling);// output:- E:\examples\sight.txt

		// relativizing is about finding a path from a source to a target
		// Then the result is the relative path of the child in the directory

		Path dir = Paths.get("E:/example");
		Path relate = Paths.get("E:/examples/sight.txt");
		Path relative = dir.relativize(relate);// this method removes the root and replace it with ..
		System.out.println(relative);// output:- ..\examples\sight.txt

	}

}