package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
	public static void main(String[] args) {
		/*
		 * Antall tall: 10 
		 * Sum: 63
		 */
		
		System.out.println("Les inn tall. Avslutt med 0");
		int tall;
		int sum = 0;
		int antall = 0;
		do {
			tall = Integer.parseInt(showInputDialog("Tall? "));
			if (tall != 0) {
				sum += tall; // sum = sum + tall;
				antall++;
			}
		} while (tall != 0);
		
		System.out.println("Antall tall: " + antall);
		System.out.println("Sum: " + sum);
	}
}
