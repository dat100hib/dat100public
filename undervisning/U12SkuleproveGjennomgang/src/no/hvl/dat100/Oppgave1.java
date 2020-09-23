package no.hvl.dat100;

public class Oppgave1 {

	public static void main(String[] args) {
		/*
		 * a) Anta a er en heltalsvariabel som har fått verdi. Skriv Java-kode som
		 * skriver ut om verdien er mindre enn 0, lik 0 eller større enn 0.
		 */

		int a = 7;

		// Svar
		if (a < 0) {
			System.out.println(a + " er mindre enn 0");
		} else if (a == 0) {
			System.out.println(a + " er lik 0");
		} else {
			System.out.println(a + " er større enn 0");
		}

		/*
		 * b) heiltalsgrenser 5 og 8. Heiltalsvariabel a. x er utenforfor intervallet x
		 * er innenfor intervallet
		 */

		if (a >= 5 && a <= 8) {
			System.out.println(a + " er innenfor intervallet");
		} else {
			System.out.println(a + " er utenfor intervallet");
		}

		// alt
		if (a < 5 || a > 8) {
			System.out.println(a + " er utenfor intervallet");
		} else {
			System.out.println(a + " er innenfor intervallet");
		}

		/*
		 * c heiltalvariabel tall switch 0 - 4 -> null - fire ulovlig verdi
		 */

		int tall = 13;
		String svar = "";

		switch (tall) {
		case 0:
			svar = "null";
			break;
		case 1:
			svar = "en";
			break;
		case 2:
			svar = "to";
			break;
		case 3:
			svar = "tre";
			break;
		case 4:
			svar = "fire";
			break;
		default:
			svar = "Ulovlig verdi";
		}
		System.out.println(svar);
	}

}
