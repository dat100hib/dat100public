package no.hvl.dat100;

public class ParameterListe {

	public static void main(String[] args) {

		skrivTegn('#', 10);
		skrivTegn('*', 20);

		/*
		 * skrivTegn(10,'#'); skrivTegn("dat100",20);
		 * 
		 */
	}

	private static void skrivTegn(char t, int antall) {

		for (int i = 1; i <= antall; i++) {
			System.out.print(t);
		}
		System.out.println();
	}

}
