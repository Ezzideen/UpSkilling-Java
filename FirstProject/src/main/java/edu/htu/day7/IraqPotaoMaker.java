package edu.htu.day7;

public class IraqPotaoMaker implements PotatoMaker {

	@Override
	public void slice() {
		System.out.println("Iraq sliceing....");
	}

	@Override
	public void clean() {
		System.out.println("Iraq cleaning....");
	}

	@Override
	public void fry() {
		System.out.println("Iraq frying....");
	}

	@Override
	public void present() {
		System.out.println("Iraq presenting....");
	}

	@Override
	public void prepare() {
		clean();
		slice();
		fry();
		present();
	}

}
