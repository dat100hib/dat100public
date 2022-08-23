package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class SwitchEksempel {

	public static void main(String[] args) {

		String brukernavn = null;
		String passord = null;

		String funksjonTxt = 
				"Velg funksjon\n a) - opprette konto\n b) - endre passord\n c) - slette konto\n d) - login";

		String valgTxt = showInputDialog(funksjonTxt);

		switch (valgTxt) {

		case "a":
			brukernavn = showInputDialog("Opprett bruker\nBrukernavn :");
			passord = showInputDialog("Passord :");
			break;
		case "b":
			passord = showInputDialog("Endre passord\nNåværende passord :");
			passord = showInputDialog("Nytt passord :");
			break;
		case "c":
			brukernavn = showInputDialog("Slette bruker\nBrukernavn :");
			passord = showInputDialog("Passord :");
			break;
		case "d:":
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
