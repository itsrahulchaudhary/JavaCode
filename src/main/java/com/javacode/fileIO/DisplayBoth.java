package com.javacode.fileIO;

import java.io.File;

public class DisplayBoth {
	public static void main(String[] args) {
		int count = 0;
		File f = new File("C:\\Program Files\\Avast Software\\Avast");
		String[] s = f.list();
		for (String s1 : s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total no of directory-flie " + count);
	}
}
