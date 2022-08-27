package no.hvl.dat100;

public class EksemplerDoWhile {

	public static void main(String[] args) {

		// a)
		
		int i = 0;
		int x = 32812;

		do {
			
			x = x / 10;
			i++;
			System.out.println("x = " + x);
			
		} while (x != 0);

		System.out.println("x = " + x);
		System.out.println("i = " + i);

	}

}
