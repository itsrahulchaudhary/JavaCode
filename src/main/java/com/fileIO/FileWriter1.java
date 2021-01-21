package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("rahul.txt", true);
		fw.write(114);
		fw.write("ahul\nChadhary");
		fw.write('\n');
		char ch[] = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();

	}

}
