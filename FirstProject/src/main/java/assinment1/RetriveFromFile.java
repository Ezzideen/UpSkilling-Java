package assinment1;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RetriveFromFile {

	public static void main(String[] args) throws IOException {

		String cases = JOptionPane.showInputDialog(
				"To insert into file enter   \'1\': \nTo retrive from file enter\'2\': \nTo show the data enter  \'3\':");
		File file1 = new File(
				"C:\\Users\\abuod\\Desktop\\HUT_program\\Technical_skills\\UpSkilling-Java\\UpSkilling-Java\\FirstProject\\src\\main\\java\\assinment1\\data.txt");

		switch (cases) {
		case "1":

			file1 = createFile(
					"C:\\Users\\abuod\\Desktop\\HUT_program\\Technical_skills\\UpSkilling-Java\\UpSkilling-Java\\FirstProject\\src\\main\\java\\assinment1\\data.txt");
			break;
		case "2":

			String id = JOptionPane.showInputDialog("please enter the ID of user you want to retrieve data for");
			printInfo(file1, id);
			break;
		case "3":

			readFromFile(file1);
			break;
		}

	}

	public static File createFile(String path) throws IOException {

		String users = JOptionPane.showInputDialog("pease enter the number of user you want to add to the database");
		int count = Integer.parseInt(users);
		File file1 = new File(path);
		file1.createNewFile();

		while (count >= 1) {
			// while loop that call the WriteOnFile method 4 times
			// one to fill ID :
			// take 2 arguments:1)the file to write in 2)the ID as random number.

			writeOnFile(file1, Integer.toString((int) Math.round(1000 * (Math.random()))));
			// the second to fill the customer name
			String name = JOptionPane.showInputDialog("please enter the name for user #" + count + " : ");
			writeOnFile(file1, name);
			// third and forth : one for insert the age and another one to start anew line
			String age = JOptionPane.showInputDialog("please enter the age for user #" + count-- + " : ");
			writeOnFile(file1, age);
			writeOnFile(file1, "\n");
		}
		return file1;

	}

	public static void writeOnFile(File file1, String text) throws IOException {
		FileWriter writer = new FileWriter(file1, true);
		writer.write(text);
		Pattern letter = Pattern.compile("[a-zA-z]");
		Matcher hasLetter = letter.matcher(text);
		if (text == "\n")
			writer.close();
		else if (text.length() < 8 && hasLetter.find()) {
			writer.write("\t\t");
			writer.close();
		} else {
			writer.write("\t");
			writer.close();
		}
	}

	public static void readFromFile(File file1) throws FileNotFoundException, IOException {

		FileReader reader = new FileReader(file1);
		int i;
		String file = "";
		while ((i = reader.read()) != -1) {
			file = file + ((char) i);
		}
		reader.close();
		System.out.println(file);
	}

	public static void printInfo(File file1, String id) throws IOException {

		File f = new File(
				"C:\\Users\\abuod\\Desktop\\HUT_program\\Technical_skills\\UpSkilling-Java\\UpSkilling-Java\\FirstProject\\src\\main\\java\\assinment1\\data.txt");
		FileReader fr = new FileReader(f); // Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
		String s = null;
		Pattern letter = Pattern.compile(id);

		while ((s = br.readLine()) != null) // Reading the content line by line
		{
			Matcher hasLetter = letter.matcher(s);
			if (hasLetter.find())
				System.out.println(s);

		}
		fr.close();
	}
}
