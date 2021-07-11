package com.javacode.fileIO;

import java.util.LinkedList;
import java.util.List;

public class Note {

	public static void main(String[] args) {

		List<String> note = new LinkedList<String>();
		note.add("1- DisplayFile.java");
		note.add("2- DisplayDirectory.java");
		note.add("3- DisplayBoth.java");
		note.add("4- FileWriter1.java");
		note.add("5- FileReader1.java");
		note.add("6- BufferWriter1.java");
		note.add("7- BufferReader1.java");
		note.add("8- PrintWriter1.java");
		note.add("9- FileMerger.java");
		note.add("10- FileMerger2.java");
		note.add("11- FileExtractor.java");
		note.add("12- DublicateEliminator.java");
		System.err.println("----------------------------------");
		for (String str : note) {
			System.out.println(str);
		}
		System.err.println("----------------------------------");

	}

}
