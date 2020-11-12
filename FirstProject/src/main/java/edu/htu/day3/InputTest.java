package edu.htu.day3;

import java.time.temporal.ValueRange;
import java.util.function.DoublePredicate;

import javax.swing.JOptionPane;

public class InputTest {

	public static void main(String[] args) {
	
    	String name=JOptionPane.showInputDialog("please insert your name :");
	    String sAge=JOptionPane.showInputDialog("please insert your age :");
    	int age= Integer.parseInt(sAge);
    	age-=10;
	    System.out.println(age);
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "your name is : "+name+ " your age is : "+age);
	String sss = "10.56";
	double s= Double.parseDouble(sss);
	System.out.println(s);
	
	}
}
