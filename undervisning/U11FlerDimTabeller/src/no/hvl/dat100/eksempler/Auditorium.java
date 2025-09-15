package no.hvl.dat100.eksempler;

public class Auditorium {

	public static void main(String[] args) {

		boolean[][] audp;

		int ANTALL = 8;
		int RADER = 6;

		boolean[][] d111 = new boolean[RADER][ANTALL];

		boolean[][] aud = 
			{ 
			  { false, false, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};

		// avlese en verdi
		boolean plass12 = aud[1][2];
		System.out.println(plass12);

		boolean plass21 = aud[2][1];
		System.out.println(plass21);

		// sette en verdi
		System.out.println(aud[0][1]);
		aud[0][1] = true;
		System.out.println(aud[0][1]);

		// ta ut en rad
		boolean[] rad0 = aud[2];

		// skrive ut en rad
		for (int p = 0; p < rad0.length; p++) {

			boolean plass = rad0[p];
			
			if (plass) {
				System.out.print("X");
			} else {
				System.out.print("O");
			}
		}

		System.out.println();

		System.out.println("version 1");

		for (int r = 0; r < aud.length; r++) {

			boolean[] rad = aud[r];

			for (int p = 0; p < rad.length; p++) {

				boolean plass = rad[p];

				if (plass) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}

			}

			System.out.println();
		}
	
		System.out.println("version 2");

		for (int r = 0; r < aud.length; r++) {

			for (int p = 0; p < aud[r].length; p++) {

				if (aud[r][p]) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}

			}

			System.out.println();
		}

		System.out.println("version 3");

		for (boolean[] rad : aud) {

			for (boolean plass : rad) {

				if (plass) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}

			}

			System.out.println();
		}
		
		int r = 0;
		boolean funnet = false;
		
		while (r < aud.length && !funnet) {
			
			int p = 0;
			while (p<aud[r].length && !funnet) {
				
				if (!(aud[r][p])) {
					funnet = true;
				}
				
				p++;
			}
			
			r++;
		}

		System.out.println(funnet);
	}

}
