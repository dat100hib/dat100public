package no.hvl.dat100.eksempel;

import java.util.Scanner;

public class InnleseTall {

	private static Scanner input;
	
	public static void main(String[] args) {
			 
		input = new Scanner(System.in);

		int antall = lesInteger("Antall tall som skal leses inn:");

		double[] tall; // deklarere tabell variabel

		tall = new double[antall]; // oppretter tabell

		for (int i = 0; i<tall.length; i++) {

			double t = lesDouble("Tall " + i);

			tall[i] = t;
		}

		System.out.print("[");

		for (int i = 0; i<tall.length; i++) {

			System.out.print(tall[i] + " ");
		}

		System.out.println(" ]");


	    input.close();
	    
	}

	private static double lesDouble(String message) {
		
		System.out.print(message);

	    double tall = input.nextDouble();
	    
	    return tall;
	    
	}
	
	private static int lesInteger(String message) {
		
		System.out.print(message);
		
		int tall = input.nextInt();

	    return tall;
	}
}
