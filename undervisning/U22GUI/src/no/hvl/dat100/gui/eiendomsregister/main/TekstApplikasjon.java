package no.hvl.dat100.gui.eiendomsregister.main;

import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll;
import no.hvl.dat100.gui.eiendomsregister.modell.EiendomsRegister;
import no.hvl.dat100.gui.eiendomsregister.utsyn.tekst.TekstUtsyn;

public class TekstApplikasjon {

	public static void main(String[] args) {
			
		if (args.length > 0) {
			
			String kommune = args[0];
			
			EiendomsRegister register = new EiendomsRegister(kommune);

			Kontroll kontroll = new Kontroll(register);

			TekstUtsyn utsyn = new TekstUtsyn(kontroll);

			utsyn.start();
			
		} else {
			System.out.println("Applikasjonen kunne ikke starte");
		}
	}
}
