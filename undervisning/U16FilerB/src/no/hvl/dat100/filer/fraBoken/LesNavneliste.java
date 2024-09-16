package no.hvl.dat100.filer.fraBoken;

import java.io.File;
import java.util.Scanner;

public class LesNavneliste {
	
	 public static void main(String[] args) throws Exception {
		    // Åpner filen for lesing
		    String filnavn = "navn2.txt";
		    Scanner scanner = new Scanner(new File(filnavn));

		    // Skriv hvert linje ut
		    while (scanner.hasNext()) {
		    	System.out.println(scanner.nextLine());
		    }
		  
		    scanner.close();      // Lukker filen
	 }

}
