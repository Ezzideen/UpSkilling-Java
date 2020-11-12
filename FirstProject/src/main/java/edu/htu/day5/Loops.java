package edu.htu.day5;

public class Loops {

	public static void main(String[] args) {
		upHalfTriangle(5);
		System.out.println("");
		downHalfTriangle(5);
		System.out.println("");
		drawStarTriangle(1, 5);
		System.out.println("");
		drawStarTriangle(0, 5);
		System.out.println("");
		upTriangle(10);
		System.out.println("");
		downTriangle(10);

	}

	private static void downHalfTriangle(int n) {
		for (int i = n; i >= 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void upHalfTriangle(int n) {
		for (int i = 0; i <= n; i++) {
			internalLoop(i);
			System.out.println();
		}
	}

	private static void drawStars(int i) {
		for (int j = 0; j < 6 - i; j++) {
			System.out.print(" ");
		}
		internalLoop(i);
		System.out.println();
	}

	private static void drawStarTriangle(int n, int x) {
		if (n == 1) {
			for (int i = 1; i <= x; i++) {
				drawStars(i);

			}
		} else {
			for (int i = x; i >= 1; i--) {
				drawStars(i);

			}

		}
	}

	private static void downTriangle(int n) {
		int x = 1;
		for (int i = n - 1; i > 0; i -= 2) {

			for (int j = 1; j < x; j++) {

				System.out.print(" ");
			}
			x++;
			internalLoop(i);
			System.out.println();
		}
	}

	private static void upTriangle(int n) {
		int x = n / 2;
		for (int i = 1; i < n; i += 2) {

			for (int j = 1; j < x; j++) {

				System.out.print(" ");
			}
			x--;
			internalLoop(i);
			System.out.println();
		}
	}

	public static void internalLoop(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
	}
	
	

}