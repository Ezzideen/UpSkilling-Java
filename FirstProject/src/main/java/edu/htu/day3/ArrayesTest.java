package edu.htu.day3;

public class ArrayesTest {

	public static void main(String[] args) {
		int[] a1 = new int[5];
		int[] a2 = { 5, 6, 8, 2, 1 };

		int x = a2[3];
		System.out.println(x);

		a1[0] = 9;
		a1[1] = 4;
		a1[2] = 7;
		a1[3] = 1;
		a1[4] = 6;

		System.out.println(a1[2]);

		System.out.println(a2.length);
	}
}
