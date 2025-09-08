package no.hvl.dat100.eksempel;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;

public class InnleseTall {

	private static Scanner input;
	
	public static void main(String[] args) {
			 
		input = new Scanner(System.in);
		
		// TODO - START
		
		int antall = lesInteger("Antall tall som skal leses inn: ");
	    
	    double[] tall = new double[antall];
	    
	    for (int i = 0;i<tall.length; i++) {
	    	
	    	double verdi = lesDouble("Tall " + i + ": ");
	    	
	    	tall[i] = verdi;
	    	
	    }
	   
	    System.out.print("[ ");
		
		for (int i = 0;i<tall.length;i++) {
			System.out.print(tall[i] + " ");
		}
		
		System.out.println("]");
	    
	    // TODO - END
	    
	    input.close();
	    
	}

	
	private static double lesDouble(String message) {
		
		System.out.print(message);
		
		String tallTxt = input.nextLine();
	    
	    double tall = parseDouble(tallTxt);
	    
	    return tall;
	    
	}
	
	private static int lesInteger(String message) {
		
		System.out.print(message);
		
		String tallTxt = input.nextLine();
		    
	    int tall = parseInt(tallTxt);
	    
	    return tall;
	}
}
