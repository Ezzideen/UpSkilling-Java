package edu.htu.day4;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Please enter your grade");
		Scanner in = new Scanner(System.in);
		int mark = in.nextInt();
		switch ((int) mark / 10) {
		case 9:
			System.out.println("Excellent");
			break;
		case 8: {
			System.out.println("Very Good");
			break;
		}
		case 7: {
			System.out.println("Good");
			break;
		}
		case 6: {
			System.out.println("Accepted");
			break;
		}
		default: {
			System.out.println("Weak");
		}

		}
	}
}
