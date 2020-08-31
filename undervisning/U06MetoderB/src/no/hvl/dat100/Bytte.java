package no.hvl.dat100;

public class Bytte {

	public static void main(String[] args) {
		
		int tall1 = 10;
		int tall2 = 20;

		System.out.println("tall1 = " + tall1 + " tall2 = " + tall2);
		
		bytte(tall1,tall2);
		
		System.out.println("tall1 = " + tall1 + " tall2 = " + tall2);
	}

	private static void bytte(int x, int y) {
		
		System.out.println("x = " + x + " y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x + " y = " + y);
	}
}
