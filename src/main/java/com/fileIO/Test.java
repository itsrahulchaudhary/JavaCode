package com.fileIO;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File f = new File("abc20012021.txt");
		f.createNewFile();
		System.out.println(f.exists());
	}

}
