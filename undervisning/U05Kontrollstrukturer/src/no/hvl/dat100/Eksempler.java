package no.hvl.dat100;

public class Eksempler {

	public static void main(String[] args) {

		// a)
		
		int n = 3;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("X");
			}
			System.out.println();
		}

		// b)
		
		int m = 5;

		for (int i = 0; i < m; i++) {

			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}

			for (int j = i; j < m; j = j + 2) {
				System.out.print("#");
			}
			
			System.out.println();
		}

	}

}
