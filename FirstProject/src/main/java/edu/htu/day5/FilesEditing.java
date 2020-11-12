package edu.htu.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesEditing {

	public static void main(String[] args) throws Exception {

		File createdFile = createFile("D:/source/UpSkilling-Java/Files/newFile2.txt");
		writeOnFile(createdFile, "Hi2");
		readFromFile(createdFile);

	}

	public static File createFile(String filePath) throws IOException {
		File file = new File(filePath);
		if (file.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("file alarady existing");
		}
		return file;
	}
	
	
	public static void writeOnFile(File file,String text) throws IOException {
		FileWriter writer = new FileWriter(file);
		writer.write(text);
		writer.close();
	}

	public static void readFromFile(File file) throws FileNotFoundException, IOException {

		FileReader reader = new FileReader(file);
		int i;
		String readFromFile = "";
		while ((i = reader.read()) != -1) {
			readFromFile = readFromFile + ((char) i);
		}
		reader.close();

		System.out.println(readFromFile);
	}
}
