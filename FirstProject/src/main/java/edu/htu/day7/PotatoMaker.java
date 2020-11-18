package edu.htu.day7;

public abstract class PotatoMaker {

	private int potaot;
	private double oli;
	
	public PotatoMaker(int potato,double oil) {
		setPotaot(potato);
		setOli(oil);
	}

	public int getPotaot() {
		return potaot;
	}

	public void setPotaot(int potaot) {
		this.potaot = potaot;
	}

	public double getOli() {
		return oli;
	}

	public void setOli(double oli) {
		this.oli = oli;
	}


	protected abstract void clean();

	protected abstract void slice();

	protected abstract void fry();

	protected abstract void present();
	
	public final void prepare() {
		clean();
		slice();
		fry();
		present();
	}
}
