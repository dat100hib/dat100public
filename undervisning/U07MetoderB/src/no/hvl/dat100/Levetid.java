package no.hvl.dat100;

public class Levetid {

	public static void main(String[] args) {
		
		bytte(10,20);
		
		bytte(16,42);

	}

	private static void bytte(int x, int y) {
		
		System.out.println("x = " + x + " y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x + " y = " + y);
	}
}
