package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {

		// deklarering av en tabell
		// datatype[] tabellnavn
		int[] itab; 
		
		// opprette tabell - implisitt initialisering (standardverdi)
		// datatype[] tabellnavn = new datatype[lengde]
		char[] ctab = new char[4]; 
		
		// opprette tabell - eksplitt initialisering
		// datatype[] tabellnavn = {v1,v2,....,vn}
		boolean[] btab = {true,false,true,false,false,true};
				
		// avlese en posisjon i tabell
	    // datatype variabel = tabellnavn[posisjon]
		char c = ctab[1];
		
		// endre innholdet på en posisjon
		// tabellnavn[posisjon] = verdi
		btab[1] = false;
		
		// gjennomløp med for-løkke 
		for (int i = 0; i<btab.length;i++) {
			System.out.print(btab[i]);
		}
		
		System.out.println();
		
		// gjennomløp utvidet for-løkke
		for (boolean b : btab) {
			System.out.print(b);
		}
		
		System.out.println();
		
		// gjennomløp med while-løkke - typisk ifm. søking i tabell
		boolean funnet = false;
		int i = 0;
		while (i<btab.length && !funnet) {
			if (btab[i]) {
				funnet = true;
			}
			i++;
		}
		
		System.out.println("funnet: " + funnet);
		
	}
}
