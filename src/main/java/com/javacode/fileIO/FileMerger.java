package com.javacode.fileIO;

import java.io.BufferedReader;
 
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *   WAP to merge a data from two file into a third file
 * 
 */
public class FileMerger {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("fileMerger.txt");
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while(line != null) {
			pw.println(line);
			line=br.readLine();
		}
		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while(line != null) {
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		
	}

}
