package edu.htu.day4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condition {

	public static void main(String[] args) {
//		String grade = null;
//		String number = JOptionPane.showInputDialog(null, "Enter mark");
//		int x = Integer.parseInt(number);
//		if (x <= 100 && x >= 0) {
//			if (x >= 90) {
//				grade = "Excellent";
//			} else if (x >= 80) {
//				grade = "very good";
//			} else if (x >= 70) {
//				grade = "good";
//			} else if (x >= 60) {
//				grade = "accepted";
//			} else {
//				grade = "failed";
//			}
//		} else {
//			grade = "Incorrect number";
//		}
//		JOptionPane.showMessageDialog(null, grade);

		System.out.print("Enter your Grade:");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		int y = Integer.parseInt(next);
		

		switch (y) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("not on the case");
		}

	}

}