package no.hvl.dat100.oppramstyper;

public class TestDag {
	public static void main(String[] args) {
		// Skrive ut alle verdier
		for (Dag d : Dag.values()) {
			System.out.println(d);
		}

		// Deklarasjon og initiering
		Dag d1 = Dag.ONSDAG;

		// Vise ordinal
		System.out.println(d1.ordinal());

		// Bruke av switch
		String svar = "Vanleg vekedag";
		switch (d1) {
		case LORDAG:
			svar = "Lørdagsrute";
			break;
		case SONDAG:
			svar = "Søndagsrute";
			break;
		}
	}
}
