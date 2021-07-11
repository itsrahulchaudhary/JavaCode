package com.javacode.fileIO;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class BufferReader1 {
	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("bufferWriter.txt");
		BufferedReader br = new BufferedReader(fw);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
