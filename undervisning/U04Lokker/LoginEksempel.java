package no.hvl.dat100;

import java.util.Scanner;

public class LoginEksempel {

	public static void main(String[] args) {

		String brukernavn = "lars";
		String passord = "hemli";

		Scanner input = new Scanner(System.in);

		String funksjonTxt = "Velg funksjon\n a) - opprette konto\n b) - endre passord\n c) - slette konto\n d) - login";

		System.out.println(funksjonTxt);
		System.out.print(">");

		String valgTxt = input.nextLine();

		switch (valgTxt) {

		case "a":
			System.out.print("Opprett konto\nBrukernavn:");
			brukernavn = input.nextLine();
			System.out.print("Passord:");
			passord = input.nextLine();
			break;
		case "b":
			System.out.print("Endre passord\nGammelt passord:");
			passord = input.nextLine();
			System.out.print("Nytt passord:");
			passord = input.nextLine();
			break;
		case "c":
			System.out.print("Slette bruker\nBrukernavn:");
			brukernavn = input.nextLine();
			System.out.print("Passord:");
			passord = input.nextLine();
			break;
		case "d":
			System.out.print("Login\nBrukernavn:");
			brukernavn = input.nextLine();
			
			boolean loggedinn = false;
			int forsok = 0;
					
			do {
				
				forsok++;
				System.out.print("Passord:");
				String inpassord = input.nextLine();
				
				if (inpassord.equals(passord)) {
					loggedinn = true;
				}
			
			} while ((!loggedinn) && (forsok < 3));
			
			if (loggedinn ) {
				System.out.println("Du er nå logged inn");
			} else {
				System.out.println("Ikke flere forsøk");
			}
			
			break;
		default:
			System.out.println("Ingen funksjon valgt");
		}

		System.out.println(brukernavn);
		System.out.println(passord);

		input.close();
	}
}
