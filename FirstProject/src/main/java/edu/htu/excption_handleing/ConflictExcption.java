package edu.htu.excption_handleing;

public class ConflictExcption extends Exception{

	@Override
	public String getMessage() {
		return "ConflictExcption";
	}
}
