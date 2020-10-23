package no.hvl.dagt100.abstrakte;

public class Rektangel extends Figur{
	private int hogde;
	private int bredde;
	
	@Override
	public double areal() {
		return hogde * bredde;
	}

}
