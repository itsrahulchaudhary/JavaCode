package com.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		/*
		 * File f = new File("zzzz.txt"); f.createNewFile();
		 * System.out.println(f.exists());
		 */
		FileWriter fw = new FileWriter("fileIONote.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(114);
		bw.write("ahul\nChadhary");
		bw.newLine();
		char ch[] = { 'a', 'b', 'c' };
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}
