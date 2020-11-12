package edu.htu.day4;

import javax.swing.JOptionPane;

public class Conditions {
	public static void main(String[] args) {
		int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade:"));

		if(grade > 100 || grade < 0) {
			
		
		}else if (grade >= 90) {
			System.out.println("Excellent");
			JOptionPane.showMessageDialog(null, "Excellent");
		} else if (grade >= 80) {
			System.out.println("Very good");
			JOptionPane.showMessageDialog(null, "Very good");
		} else if (grade >= 70) {
			System.out.println("Good");
			JOptionPane.showMessageDialog(null, "Good");
		} else if (grade >= 60) {
			System.out.println("Accepted");
			JOptionPane.showMessageDialog(null, "Accepted");
		} else {
			System.out.println("Failed");
			JOptionPane.showMessageDialog(null, "Failed");
		}
	}
}