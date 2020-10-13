package no.hvl.dat100.kontakter;

import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class SkrivKontakterFilThrows {

	public SkrivKontakterFilThrows() {
		// TODO Auto-generated constructor stub
	}

	static String mappe = System.getProperty("user.dir") +"/src/no/hvl/dat100/kontakter/";
	
	private static final String FILNAVN = "kontakter.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
			
		Kontakt k1 = new Kontakt("Lars",55943623);
		Kontakt k2 = new Kontakt("Sven-Olai",55323223);
	
		Kontakt[] kontakter = new Kontakt[2];
		
		kontakter[0] = k1;
		kontakter[1] = k2;
		
		PrintWriter writer = new PrintWriter(mappe + FILNAVN);
			
		writer.println(kontakter.length);
		
		for (Kontakt k : kontakter) {
			writer.println(k.getNavn());
			writer.println(k.getNummer());
		}
		
		writer.close();
	}
}
