package edu.htu.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileTask {

	public  File f;



	public  File creation(String path) throws IOException {
		File file = new File(path);
		file.createNewFile();
		return file;
	}// CreationFile

	public  void writeOnFile() throws IOException {

		String text = "";
		String s1 = JOptionPane.showInputDialog("Enter Employee ID : ").concat(",");
		String s2 = JOptionPane.showInputDialog("Enter Employee Name : ").concat(",");
		String s3 = JOptionPane.showInputDialog("Enter Employee Department : ");
		String s4 = JOptionPane.showInputDialog("Enter Employee Salary : ").concat(",");
		text = s1.concat(s2).concat(s4).concat(s3);
		FileWriter writer = new FileWriter(f, true);
		writer.append(text);
		writer.append('\n');
		writer.close();
		
		JOptionPane.showMessageDialog(null, "Employee add successfully");
	}// WriteOnFile

	public  void readFromFile() throws IOException {

		FileReader reader = new FileReader(f);

		String text = "";
		int i;
		while ((i = reader.read()) != -1) {
			text = text + ((char) i);
		} // while

		System.out.print(text);
		reader.close();

	}// ReadFromFile

	public  void find(String name, int index) throws IOException {

		FileReader reader = new FileReader(f);
		BufferedReader bf = new BufferedReader(reader);
		String s;
		while ((s = bf.readLine()) != null) {
			String[] spilt = s.split(",", 4);
			if (spilt[index].equals(name)) {
				System.out.println(s);
			}

		} // while
		reader.close();

	}// Find

	public  void findId(String id) throws IOException {

		find(id, 0);

	}// FindId

	public  void findName(String name) throws IOException {

		find(name, 1);

	}// FindName

	public  void findSalary(String salary) throws IOException {

		find(salary, 2);

	}// FindSalary

	public  void findDepartment(String department) throws IOException {

		find(department, 3);

	}// FindDepartment

	public  void deleteFile() throws IOException {

		FileWriter writer = new FileWriter(f);
		writer.write("");
		writer.close();

	}

	public  void replaceName( String now, String id) throws IOException {

		replace( now, id, 1);

	}// ReplaceName

	public  void replaceSalary( String s2, String id) throws IOException {

		replace( s2, id, 2);

	}// ReplaceId

	public  void replaceDepartment( String dep2, String id) throws IOException {

		replace(dep2, id, 3);

	}// ReplaceId

	private  void replace(String n2, String id, int index) throws FileNotFoundException, IOException {

		String text = "";
		FileReader reader = new FileReader(f);
		BufferedReader bf = new BufferedReader(reader);
		String s;
		while ((s = bf.readLine()) != null) {
			String[] spilt = s.split(",", 4);

			if (spilt[0].equals(id) ) {
				text = text.concat(s.replace(spilt[index], n2)).concat("\n");
			} else {
				text = text.concat(s).concat("\n");
			} // else

		} // while
		reader.close();
		deleteFile();

		FileWriter writer = new FileWriter(f, true);
		writer.append(text);
		writer.append('\n');
		writer.close();
		
		JOptionPane.showMessageDialog(null, "Save changes successfully");
	}

}
