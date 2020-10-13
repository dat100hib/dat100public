package no.hvl.dat100.varelager;

import java.io.File;
import java.util.Scanner;


/*
 * Lese data frå fil inn i eit varelager. Sjå filformat.
 * Ukjent antall lihjer på filen.
 * 
 * Metode for å søke etter vare der navnet inneholder en gitt streng
 */
public class Varelager {

	public static void main(String[] args) throws Exception {
		final int MAX_ANT = 100;
		Vare[] vareliste = new Vare[MAX_ANT];

		String filnavn = "varedata.txt";
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);

		// Fjernar overkrift, kan evt sjekke om filen ikkje er tom
		String linje = leser.nextLine();

		int antVarer = 0;
		while (antVarer < MAX_ANT && leser.hasNextLine()) {
			// les linje fa filen
			linje = leser.nextLine();

			// Del opp linja
			String[] vareTab = linje.split(";");

			// lag vareobjekt og legg inn i tabell
			int nr = Integer.parseInt(vareTab[0]);
			String navn = vareTab[1];
			double pris = Double.parseDouble(vareTab[2]);
			int antall = Integer.parseInt(vareTab[3]);

			vareliste[antVarer] = new Vare(nr, navn, pris, antall);
			antVarer++;
		}

		leser.close();

		for (int i = 0; i < antVarer; i++) {
			System.out.println(vareliste[i].toString());
		}

		String sokeStreng = "tt";
		for (int i = 0; i < antVarer; i++) {
			if (vareliste[i].getNavn().contains(sokeStreng)) {
				System.out.println(vareliste[i]);
			}
		}

	}
}
