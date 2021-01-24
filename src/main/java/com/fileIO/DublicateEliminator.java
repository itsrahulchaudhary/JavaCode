package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DublicateEliminator {
	
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("dublicateEliminator.txt");
		BufferedReader br = new BufferedReader(new FileReader("deleteDublicate.txt"));
		String line = br.readLine();
		while(null != line) 
		{
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("dublicateEliminator.txt"));
			String target = br2.readLine();
			while(null != target)
			{
				if(line.equals(target))
				{
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if(available == false)
			{
				pw.println(line);
				pw.flush();
			}
			line=br.readLine();
		}
		br.close();
		pw.close();
		
	}

}
