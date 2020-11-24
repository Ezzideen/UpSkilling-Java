package edu.htu.task2;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileTask file=new FileTask();
		file.f = file.creation("C:\\Users\\user\\Desktop\\2021\\Java\\Task.txt");

		Object[] options = { "Add New Employee", "Edit", "Search", "Read File" };
		int n = JOptionPane.showOptionDialog(null, "Please select what you want to do ", "Welcome ",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[3]);
		// Add
		if (n == 0) {
			file.writeOnFile();
		} else if (n == 1) {
			Object[] options2 = { "Edit Name", "Edit Salary", "Edit Department" };
			int n2 = JOptionPane.showOptionDialog(null, "Select what you want to edit?", "Edit",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[2]);

			if (n2 == 0) {
				String s3 = JOptionPane.showInputDialog("Enter employee ID ");
				String s2 = JOptionPane.showInputDialog("Enter new employee name :");

				file.replaceName(s2, s3);
			} else if (n2 == 1) {
				String s3 = JOptionPane.showInputDialog("Enter employee ID ");
				String s2 = JOptionPane.showInputDialog("Enter new employee salary :");
				file.replaceSalary(s2, s3);
			} else {
				String s3 = JOptionPane.showInputDialog("Enter employee ID ");
				String s2 = JOptionPane.showInputDialog("Enter new employee department :");

				file.replaceDepartment(s2, s3);
			} // else
		} else if (n == 2) {
			Object[] options3 = { "ID", " Name", " Salary", " Department" };
			int n3 = JOptionPane.showOptionDialog(null, "Select what you want to search?", "Search",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[3]);

			if (n3 == 0) {
				String s1 = JOptionPane.showInputDialog("Enter the employee ID that you want to find it :");
				file.findId(s1);
			} else if (n3 == 1) {
				String s1 = JOptionPane.showInputDialog("Enter the employee name that you want to find it :");

				file.findName(s1);
			} else if (n3 == 2) {
				String s1 = JOptionPane.showInputDialog("Enter the employee salary that you want to find it :");

				file.findSalary(s1);
			} else {
				String s1 = JOptionPane.showInputDialog("Enter the employee department that you want to find it :");

				file.findDepartment(s1);
			} // else

		} else {
			file.readFromFile();
		}

	}

}
