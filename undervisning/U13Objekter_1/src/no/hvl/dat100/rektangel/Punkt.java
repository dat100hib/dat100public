package no.hvl.dat100.rektangel;

public class Punkt {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int nyX) {
		x = nyX;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int nyY) {
		y = nyY;
	}
	
	public Punkt() {
		x = 0;
		y = 0;
	}
	
	public Punkt(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public void skrivUt() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
