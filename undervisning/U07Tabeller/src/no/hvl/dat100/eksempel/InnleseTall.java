package no.hvl.dat100.eksempel;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

public class InnleseTall {

	public static void main(String[] args) {
			 
		// TODO - START
		
	    int antall = lesInteger("Hvor mange tall skal leses inn?");
	    
	    double[] tall = new double[antall];
	    
	    for (int i = 0;i<tall.length; i++) {
	    	
	    	double verdi = lesDouble("Tall: " + i);
	    	
	    	tall[i] = verdi;
	    	
	    }
	   
	    skrivUt(tall);
	    
	    // TODO - END
	    
	}
	
	private static double lesDouble(String message) {
		
		String tallTxt = showInputDialog(message);
	    
	    double tall = parseDouble(tallTxt);
	    
	    return tall;
	    
	}
	
	private static int lesInteger(String message) {
		
		String tallTxt = showInputDialog(message);
	    
	    int tall = parseInt(tallTxt);
	    
	    return tall;
	    
	}
	
	// TODO - START
	
	private static void skrivUt(double[] tab) {
		
		
		System.out.print("[ ");
		
		for (int i = 0;i<tab.length;i++) {
			System.out.print(tab[i] + " ");
		}
		
		System.out.println("]");
		
	}

	// TODO - END
}
