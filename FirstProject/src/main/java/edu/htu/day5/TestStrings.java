package edu.htu.day5;

public class TestStrings {

	public static void main(String[] args) {
		String s = "Mohammad";
		String s2 = " Abu-Jajeh";
//		String s3 = s + s2;
//		System.out.println(s3);
		String s3 = s.concat(s2).concat(" ").concat("Hi");
		System.out.println(s3);

		System.out.println(s3.length());
		System.out.println(s3.charAt(1));
//		String s4 = s3.replace("a", "@");
//		System.out.println(s4);

		System.out.println(s3.substring(0, 7));
		System.out.println(s3.substring(9));

		for (int i = 0; s3.length() > i; i++) {
			System.out.println(s3.charAt(i));
		}
		System.out.println("*****************************************");
		String[] split = s3.split("a");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("*****************************************");
		String[] split2 = s3.split("a", 3);
	
		
		System.out.println("------------------------------------------");
		for (String s6 : split2) {
			System.out.println(s6);
		}
		System.out.println("------------------------------------------");
		
		
		
		for (int i = 0; i < split2.length; i++) {
			System.out.println(split2[i]);
		}
		
		String s5 = "   hi    ";
		System.out.println(s5.length());
		String trim = s5.trim();
		System.out.println(trim.length());
		
		String upperCase = s3.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);

		
		
	}
}
