package no.hvl.dat100.feileksempler;

public class IterasjonWhile {

	static public void main (String[] args) {
		
		char[] tab = { 'd','a','t','1','0','0'};
		
		// skriv alle tegn i tabellen ut et på en linje hver
		
		int i = 0;
		
		while (i<tab.length) {
			System.out.println(tab[i] + " ");
		}
		
	}
}
