package edu.htu.day6;

public class Circle {

	private double radios;
	public final double bi = 3.14;

	private boolean allaowToCalaculate;

	public Circle() {

	}
	
	public Circle(double radios) {
		setRadios(radios);
	}

	public boolean isAllaowToCalaculate() {
		return allaowToCalaculate;
	}

	public void setAllaowToCalaculate(boolean allaowToCalaculate) {
		this.allaowToCalaculate = allaowToCalaculate;
	}

	public double getRadios() {
		return radios;
	}

	public void setRadios(double radios) {
		if (radios > 0) {
			setAllaowToCalaculate(true);
			this.radios = radios;
		} else {
			setAllaowToCalaculate(false);
		}
	}

	public void area() {
		if(isAllaowToCalaculate()) {
			System.out.println(bi * getRadios() * getRadios());
		}
	}

	public void round() {
		if(isAllaowToCalaculate()) {
			System.out.println(2 * bi * getRadios());
		}
	}
	

}
