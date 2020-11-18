package edu.htu.day7;

public class IraqPotaoMaker extends PotatoMaker  {

	public IraqPotaoMaker(int potato, double oil) {
		super(potato, oil);
	}

	@Override
	protected void slice() {
		System.out.println("Iraq sliceing....");
	}

	@Override
	protected void clean() {
		System.out.println("Iraq cleaning....");		
	}

	@Override
	protected void fry() {
		System.out.println("Iraq frying....");		
	}

	@Override
	protected void present() {
		System.out.println("Iraq presenting....");		
	}
	
	
}
