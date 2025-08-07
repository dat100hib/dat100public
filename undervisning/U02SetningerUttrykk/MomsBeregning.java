package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class MomsBeregning {

	public static void main(String[] args) {
		
		// input av belop
		String belopTxt = showInputDialog("Beløp: ");
		
		double belop = parseDouble(belopTxt);
		
		// beregne moms + totalpris
		double moms = belop * 0.25;
		double totalpris = belop + moms;
		
		// skrive ut i dialog vindue
		String utTxt = 
				"Beløp:" + belop + "\nMoms: " + moms + "\nTotal: " + totalpris;
				
		showMessageDialog(null,utTxt);
	}
}
