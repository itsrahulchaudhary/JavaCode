package com.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("bufferWriter.txt");
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
