package edu.htu.day3;

import javax.swing.JOptionPane;

public class InputData {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name:");
		String sAge = JOptionPane.showInputDialog("Please enter your age:");
		
		int age = Integer.parseInt(sAge);
		int newAge =  age - 15;
		System.out.println(name);
		System.out.println(newAge);
		
		JOptionPane.showMessageDialog(null, "Your name is : "+ name + " Your age is : "+age);
		
		
	}
}
