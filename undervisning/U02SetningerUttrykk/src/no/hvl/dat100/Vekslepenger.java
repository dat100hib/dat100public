package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Vekslepenger {

	public static void main(String[] args) {
		
		// input fra pris og beløp
		String prisTxt = showInputDialog("Pris: ");
		String belopTxt = showInputDialog("Beløp: ");

		// konvertere tekststrenger til tall
		double pris = parseDouble(prisTxt);
		double belop = parseDouble(belopTxt);
		
		// beregne antall 10 og enkroner
		double diff = belop - pris;
		
		int tiere = (int)(diff / 10);
		
		int enere = (int)(diff % 10);
		
		// skrive ut antall
		System.out.println(tiere + " 10 kroner");
		System.out.println(enere + "  1 kroner");
	}
}
