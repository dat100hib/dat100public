package no.hvl.dagt100.abstrakte;

public class TestFigur {

	public static void main(String[] args) {
		Rektangel r = new Rektangel();
		Figur f = r;
		System.out.println(f.areal());

	}

}
