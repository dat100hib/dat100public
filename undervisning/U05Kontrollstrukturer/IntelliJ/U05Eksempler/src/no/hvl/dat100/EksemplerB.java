package no.hvl.dat100;

public class EksemplerB {

	public static void main(String[] args) {

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
