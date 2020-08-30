package no.hvl.dat100;

public class Parametre {

	public static void main(String[] args) {
	
		skrivStjerner(2);
		skrivStjerner(4);
		skrivStjerner(8);

	}

	private static void skrivStjerner(int antall) {
		
		for (int i = 1; i <= antall; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
