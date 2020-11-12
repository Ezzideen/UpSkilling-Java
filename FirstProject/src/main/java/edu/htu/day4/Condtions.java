package edu.htu.day4;

public class Condtions {

	public static void main(String[] args) {
		drowShape(10, 15);
	}
	
	
	public static void drowShape(int row,int colums) {
		for(int i = 0; i<row ;i++) {
			for (int j = 0; j < colums; j++) {
				if(i%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}
			}
			System.out.println("");
		}
		
	}
}