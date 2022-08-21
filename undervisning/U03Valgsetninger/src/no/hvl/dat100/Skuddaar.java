package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Skuddaar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aar = parseInt(showInputDialog("År :"));
		int mnd = parseInt(showInputDialog("Måned :"));

		int antDager = 31;

		if (mnd == 4 || mnd == 6 || mnd == 9 || mnd == 11) {
			antDager = 30;
		} else {
			
			if (mnd == 2) {
				antDager = 28;

				boolean skuddaar = (aar % 4 == 0 && aar % 100 != 0) || (aar % 400 == 0);

				if (skuddaar) {
					antDager = 29;
				}
			}
		}

		System.out.println(mnd + "-"+aar + ":" + antDager);
	}

}
