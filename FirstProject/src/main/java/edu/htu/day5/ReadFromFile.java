package edu.htu.day5;

import java.io.File;
import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {

		File file = new File("D:/source/UpSkilling-Java/Files/test.txt");
		FileReader reader = new FileReader(file);
		int i;
		String readFromFile = "" ;
		while ((i = reader.read()) != -1)
			readFromFile = readFromFile + ((char) i);
		reader.close();
		
		System.out.println(readFromFile);

	}
}
