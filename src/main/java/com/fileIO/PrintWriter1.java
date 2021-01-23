package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("printWriter.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(114);
		pw.println(100);
		pw.println(true);
		pw.println("R");
		pw.flush();
		pw.close();
		
	}
}
