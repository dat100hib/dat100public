package no.hvl.dat100.gui.eiendomsregister.utsyn.gui;

import javafx.stage.Stage;
import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class GUIUtsyn {

	private static String CSSFILE = "Dark.css";
	private Kontroll kontroll;
		
	public GUIUtsyn(Kontroll kontroll) {
		this.kontroll = kontroll;
	}
			
	public void start(Stage stage) {
		
		stage.setTitle("Eiendomsregister App");
		
		// hbox for holding the overview and the edit area
		HBox hbox = new HBox();
		
		// setup the overview and editing area
		OverviewArea oarea = new OverviewArea(hbox,kontroll);
		EditArea earea = new EditArea(hbox,kontroll,oarea);
		
		oarea.setEArea(earea);
		
		// setup the menus
		Menus menus = new Menus(kontroll,stage,oarea,earea);
		MenuBar menuBar = menus.getMenuBar();

		// create the scene
		VBox vbox = new VBox(menuBar, hbox); 
		
		Scene scene = new Scene(vbox, 700, 600);
		stage.setScene(scene);
		
		// styling the look-and-feel of the UI
		scene.getStylesheets().add(getClass().getResource(CSSFILE).toExternalForm());
		
		// show the scene
		stage.show();

	}
}