package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Login {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");

		System.out.println(brukernavn);
		System.out.println(passord);
	
	}

}
