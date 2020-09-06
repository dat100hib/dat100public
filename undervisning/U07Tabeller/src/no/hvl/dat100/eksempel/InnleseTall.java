package no.hvl.dat100.eksempel;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class InnleseTall {

	public static void main(String[] args) {
		
		String antallTxt = showInputDialog("Hvor mange tall skal leses inn?");
	    
	    int antall = parseInt(antallTxt);
	    
	    int[] tall = new int[antall];
	    
	    for (int i = 0;i<tall.length; i++) {
	    	
	    	int verdi = parseInt(showInputDialog("Tall: " + i));
	    	
	    	tall[i] = verdi;
	    	
	    }
	   
	    skrivUt(tall);
	}
	
	private static void skrivUt(int[] tab) {
		
		System.out.print("[ ");
		for (int i = 0;i<tab.length;i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println("]");
		
	}

}
