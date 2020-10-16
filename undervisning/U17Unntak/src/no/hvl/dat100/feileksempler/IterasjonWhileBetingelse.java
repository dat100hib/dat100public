package no.hvl.dat100.feileksempler;

public class IterasjonWhileBetingelse {

	static public void main (String[] args) {
		
		boolean[] tab = { false,false,true,false,false,false};
		
		// telle antall false
		int count = 0;
		
		int i = 0;
		while (i<tab.length) {
			
			if (tab[i]) {
				count++;
			}
			
			i++;
		}
		
	    System.out.println(count);
	}

}
