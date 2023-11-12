package javaBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
	
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Dell\\Downloads\\code6.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line= br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		br.close();
	}

}
