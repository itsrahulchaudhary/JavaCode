package com.fileIO;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *   WAP to perform file merge operation where merging should be done line by line alternatively.
 * 
 */
public class FileMerger2 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("fileMerger2.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while((null != line1) || (null != line2)) {
			if(null != line1) {
				pw.println(line1);
				line1 = br1.readLine();
			}
			if(null != line2) {
				pw.println(line2);
				line2 = br2.readLine();
			}
			
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();

	}

}
