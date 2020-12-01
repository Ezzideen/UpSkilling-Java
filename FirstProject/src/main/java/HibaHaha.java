package artiid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FilesSystem {

	public static void main(String[] args) throws IOException {

		FilesSystem filesystem = new FilesSystem();
		String choice = JOptionPane.showInputDialog("Enter\n #1 to enter information\n #2 to search\n #3 to modify ");
		int choiice = Integer.parseInt(choice);
		if (choiice == 1) {
			// create and write in the file
			File createdFile = createFile(
					"C:/Users/moham/eclipse-workspace-skilling/artiid/src/main/java/artiid/file1.txt");
			filesystem.writeOnFile(createdFile);

			// read
			System.out.println("");
			System.out.println("File content:");
			filesystem.readFile();
		} else if (choiice == 2) {
			// searching on a file
			String key = JOptionPane.showInputDialog(null,
					"Please enter to search accroding to\n #0 to ID\n #1 to Name\n #2 to Salary\n #3 to Department\n");
			int keyy = Integer.parseInt(key);
			if (keyy == 0) {
				String s1 = JOptionPane.showInputDialog(null, "Enter the ID to find more information");
				filesystem.searchID(s1);
			} else if (keyy == 1) {
				String s2 = JOptionPane.showInputDialog(null, "Enter the Name to find more information");
				filesystem.searchName(s2);
			} else if (keyy == 2) {
				String s3 = JOptionPane.showInputDialog(null, "Enter the Salary to find more information");
				filesystem.searchSalary(s3);
			} else if (keyy == 3) {
				String s4 = JOptionPane.showInputDialog(null, "Enter the Department to find more information");
				filesystem.searchDepartment(s4);
			}

		} else if (choiice == 3) {
			// modify
			String key = JOptionPane.showInputDialog(null, "Please enter ID to modify it's information:");
			int keyy = Integer.parseInt(key);
			String choice1 = JOptionPane.showInputDialog(null,
					"Please enter to modify to modify\n #1 Name\n #2 Salary\n #3 Department\n");
			int choiice1 = Integer.parseInt(choice1);
			if (choiice1 == 1) {
				String olds2 = JOptionPane.showInputDialog(null, "Enter the old Name want to modify");
				String s2 = JOptionPane.showInputDialog(null, "Enter the new Name to modify");
				filesystem.modifyName(keyy, olds2, s2);
			} else if (choiice1 == 2) {
				String olds3 = JOptionPane.showInputDialog(null, "Enter the old Salary want to modify");
				String s3 = JOptionPane.showInputDialog(null, "Enter the new Salary to modify");
				filesystem.modifySalary(keyy, olds3, s3);
			} else if (choiice1 == 3) {
				String olds4 = JOptionPane.showInputDialog(null, "Enter the old Department want to modify");
				String s4 = JOptionPane.showInputDialog(null, "Enter the new Department to modify");
				filesystem.modifyDepartment(keyy, olds4, s4);
			} else {
				JOptionPane.showMessageDialog(null, "Please choose 1 or 2 or 3");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please choose 1 or 2 or 3");
		}
	}

	public static File createFile(String filePath) throws IOException { // create the file
		File file = new File(filePath);
		if (file.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("file alarady existing");
		}
		return file;
	}

	public void writeOnFile(File file) throws IOException { // write on a file
		String id = JOptionPane.showInputDialog("Please enter the ID ");
		String name = JOptionPane.showInputDialog("Please enter the name ");
		String salary = JOptionPane.showInputDialog("Please enter the salary ");
		String department = JOptionPane.showInputDialog("Please enter the department ");

		FileWriter writer = new FileWriter(file, true);
		writer.write(id + "," + name + "," + salary + "," + department);
		writer.write("\n");
		writer.close();
	}

	public void readFile() throws FileNotFoundException {// read the file content
		Scanner fileScanner = new Scanner(
				new FileReader("C:/Users/moham/eclipse-workspace-skilling/artiid/src/main/java/artiid/file1.txt"));
		fileScanner.useDelimiter(",");
		while (fileScanner.hasNextLine()) {
			String fileName = fileScanner.nextLine();
			String[] data = fileName.split(",");
			String ID = data[0];
			System.out.println("ID: " + ID);
			String name = data[1];
			System.out.println("Name: " + name);
			String salary = data[2];
			System.out.println("Salary: " + salary);
			String department = data[3];
			System.out.println("Department: " + department);
			System.out.println("");

		}
		fileScanner.close();
	}

	public void searchInFile(String name, int index) throws IOException {

		FileReader reader = new FileReader(
				"C:/Users/moham/eclipse-workspace-skilling/artiid/src/main/java/artiid/file1.txt");
		BufferedReader br = new BufferedReader(reader);
		String s;
		while ((s = br.readLine()) != null) {
			String[] choices = s.split(",", 4);
			if (choices[index].equals(name)) {
				System.out.println(s);
			}
		}
		reader.close();
	}

	public void searchID(String id) throws IOException {
		searchInFile(id, 0);
	}

	public void searchName(String name) throws IOException {
		searchInFile(name, 1);
	}

	public void searchSalary(String salary) throws IOException {
		searchInFile(salary, 2);
	}

	public void searchDepartment(String department) throws IOException {
		searchInFile(department, 3);
	}

	@SuppressWarnings("null")
	public void modifyFile(int key, int index, String oldString, String newString) throws IOException {

		File fileToBeModified = new File("C:/Users/moham/eclipse-workspace-skilling/artiid/src/main/java/artiid/file1.txt");
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));

			String line = reader.readLine();

			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();

				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);
			writer = new FileWriter(fileToBeModified);

			writer.write(newContent);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void modifyName(int key, String oldName, String newName) throws IOException {
		JOptionPane.showMessageDialog(null, "DONE, Modified the Name");
		modifyFile(key, 1, oldName, newName);
	}

	public void modifySalary(int key, String oldSalary, String newSalary) throws IOException {
		JOptionPane.showMessageDialog(null, "DONE, Modified the Salary");
		modifyFile(key, 2, oldSalary, newSalary);
	}

	public void modifyDepartment(int key, String oldDepartment, String newDepartment) throws IOException {
		JOptionPane.showMessageDialog(null, "DONE, Modified the Department");
		modifyFile(key, 3, oldDepartment, newDepartment);
	}
}