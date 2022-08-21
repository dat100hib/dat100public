package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class SwitchEksempel {

	public final static int OPPRETTE_KONTO = 1;
	public final static int ENDRE_PASSORD = 2;
	public final static int SLETTE_KONTO = 3;
	public final static int LOGIN = 4;

	public static void main(String[] args) {

		String brukernavn = "dat100student";
		String passord = "hemli";

		String funksjonTxt = 
				"Velg funksjon\n 1 - opprette konto\n 2 - endre passord\n 3 - slette konto\n 4 - login";

		String valgTxt = showInputDialog(funksjonTxt);

		int valg = parseInt(valgTxt);

		switch (valg) {

		case 1:
			brukernavn = showInputDialog("Opprett bruker\nBrukernavn :");
			passord = showInputDialog("Passord :");
			break;
		case 2:
			passord = showInputDialog("Endre passord\nNåværende passord :");
			passord = showInputDialog("Nytt passord :");
			break;
		case 3:
			brukernavn = showInputDialog("Slette bruker\nBrukernavn :");
			passord = showInputDialog("Passord :");
			break;
		case 4:
			brukernavn = showInputDialog("Login\nBrukernavn :");
			passord = showInputDialog("Passord :");
			break;
		default:
			showMessageDialog(null, "Ingen funkskjon valgt");
		}
		
		System.out.println(brukernavn);
		System.out.println(passord);
		
	}

}
