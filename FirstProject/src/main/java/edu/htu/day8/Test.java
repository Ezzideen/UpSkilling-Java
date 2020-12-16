package edu.htu.day8;

import edu.htu.day7.C;

public class Test {

	public static void main(String[] args) {

		Persone p1 = new Persone(10,"ali");
		Persone p2 = new Persone(5,"Mohammad");
//		p1.eat();
		
		String s = "Ali";
		String s2 = new String("Ali");
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(p1);
		
		Persone p3 = null;
		
		if(p1.equals(p3)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("end...");
		
		
		String s1 = "ali";
		
//		String s2 = new String("ali");
		if(s1 == s2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		

	}
}
