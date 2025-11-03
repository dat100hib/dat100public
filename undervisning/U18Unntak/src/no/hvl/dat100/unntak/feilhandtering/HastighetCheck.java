package no.hvl.dat100.unntak.feilhandtering;

import javax.swing.JOptionPane;

public class HastighetCheck {

	private static boolean erTall(String str) {
		return str.matches("\\d+");
	}
	
	public static void main(String[] args) {

		boolean ok = true;
		int km = 0, tm = 0;
	
		String kmstr = JOptionPane.showInputDialog("Avstand i kilometer");

		if (erTall(kmstr)) {
			km = Integer.parseInt(kmstr); 
		} else {
			ok = false;
			System.out.println("Feil: Kilometer ikke et tall");
		}
		
		if (ok) { 
			String tmstr = JOptionPane.showInputDialog("Tid i timer");

			if (erTall(tmstr)) {
				tm = Integer.parseInt(tmstr); 

				if (tm != 0) { 
					int hastighet = km / tm;
					System.out.println("Hastighet: " + hastighet + " km/t"); 
				}
				else {
					System.out.println("Feil: tid kan ikke være 0");
				}
			}
			else {
				System.out.println("Feil: tid i timer ikke et tall");
			}
		}
	}
}
