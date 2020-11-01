package no.hvl.dat100.gui.eiendomsregister.main;

import javafx.application.Application;
import javafx.stage.Stage;
import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll;
import no.hvl.dat100.gui.eiendomsregister.utsyn.gui.GUIUtsyn;

public class GUIApplikasjon extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
				
		Kontroll kontroll = new Kontroll();
		
		GUIUtsyn utsyn = new GUIUtsyn(kontroll);
		
		utsyn.start(stage);

	}
}
