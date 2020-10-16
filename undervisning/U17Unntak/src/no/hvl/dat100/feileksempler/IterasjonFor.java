package no.hvl.dat100.feileksempler;

public class IterasjonFor {

	static public void main (String[] args) {
		
		char[] tab = { 'd','a','t','1','0','0'};
		
		// skriv ut alle tegn i tabellen med mellemrom
		
		for (int i = 0; i<=tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}
}
