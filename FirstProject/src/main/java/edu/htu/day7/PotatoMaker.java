package edu.htu.day7;

public interface PotatoMaker {

	public static final String NAME = "";
	
	public static void test() {
		
	}
	
	void clean();

	void slice();

	void fry();

	void present();

	default void prepare() {
		clean();
		slice();
		fry();
		present();
	}
}
