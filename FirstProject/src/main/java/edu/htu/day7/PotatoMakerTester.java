package edu.htu.day7;

public class PotatoMakerTester {

	public static void main(String[] args) {
		System.out.println("PotatoMaker *********************");
//		PotatoMaker potatoMaker = new PotatoMaker(1,1.5);
//		potatoMaker.prepare();
		
		PotatoMaker.test();
//		System.out.println("EgyptPotatoMaker*********************");
//		EgyptPotatoMaker egyptPotatoMaker = new EgyptPotatoMaker(3,3.5);
//		egyptPotatoMaker.prepare();
		
		System.out.println("IraqPotatoMaker*********************");
		IraqPotaoMaker iraqPotaoMaker= new IraqPotaoMaker();
		iraqPotaoMaker.prepare();
		
	}
}
