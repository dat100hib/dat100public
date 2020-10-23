package no.hvl.dat100;

public class SelgerTest {

	public static void main(String[] args) {
		
		Selger s = new Selger(1, "Ole", "Olsen", 400000, 10000);
		System.out.println(s.toString());

		s.setEtternavn("Hansen");
		System.out.println(s.toString());
		
		Ansatt a = new Selger(2, "Lise", "Hansen", 500000, 50000);
		System.out.println(a.toString());
		System.out.println(a.getLønn());
		
		tabellTest();
		
		// I forelesing 23. oktober
		
		Funksjonar f = new Funksjonar(1, "Ole", "Olsen", 400000, "HMS");
		System.out.println(f.toString());
		
		s = new Selger(2, "Kari", "Olsen", 400000, 10000);
		System.out.println(s.toString());
		
		a = null;
		
		
		 a = s;
		 System.out.println(a.toString());
		 a = f;
		 System.out.println(a.toString());
		 
		 Ansatt[] aTab = new Ansatt[2];
		 aTab[0] = f;
		 aTab[1] = s;
		 
		 System.out.println("Tabell");
		 for (Ansatt e : aTab) {
			 System.out.println(e.toString());
		 }
		 

	}

		private static void tabellTest() {

		// Fyller en tabell med (pekere til) både
		// Ansatt-objekt og Selger-objekt
		Ansatt[] tab = new Ansatt[3];
		tab[0] = new Ansatt(7, "Per", "Li", 300000);
		tab[1] = new Selger(8, "Kari", "Mo", 200000, 1000);
		tab[2] = new Selger(9, "Jens", "Mo", 200000, 2000);

		// Summerer lønn til alle ansatte
		double sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i].getLønn(); // Vil ta med bonus for selgere
			System.out.println(tab[i].toString());
		}

		System.out.println("Sum: " + sum); // Viser Sum: 703000
		
	}
}
