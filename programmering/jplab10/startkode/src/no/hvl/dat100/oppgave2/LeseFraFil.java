package no.hvl.dat100.oppgave2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab11/oppgave1/";

	static public void main(String[] args) throws FileNotFoundException {

		String filnavn;

		filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

		File file = new File(MAPPE_STR + filnavn);
		Scanner reader = new Scanner(file);

		int linenumber = 1;

		// les innhold i filen linje for linje
		String line;

		while (reader.hasNextLine()) {
			line = reader.nextLine();
			System.out.println(linenumber + " " + line);
			linenumber++;
		}

		reader.close();

		// JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes
		// ikke. \n" + e.getMessage());
	}
}
