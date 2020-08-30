package no.hvl.dat100;

public class ToMetoder {

	public static void main(String[] args) {

		skrivStjerner();

		System.out.println("-");

		skrivStjerner();	
	}

	private static void skrivStjerner() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
