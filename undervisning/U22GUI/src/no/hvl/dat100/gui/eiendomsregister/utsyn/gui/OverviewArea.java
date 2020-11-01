package no.hvl.dat100.gui.eiendomsregister.utsyn.gui;

import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll;
import no.hvl.dat100.gui.eiendomsregister.modell.Eiendom;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class OverviewArea {

	private Kontroll kontroll;
	private ListView<String> elist;
    private EditArea earea;
	
	public OverviewArea(HBox hbox, Kontroll kontroll) {

		this.kontroll = kontroll;

		elist = new ListView<String>();

		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10, 0, 0, 10));

		elist.setPrefHeight(500);

		elist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				if (newValue != null) { // selection changed also triggered on
										// clear
					Scanner sc = new Scanner(newValue);
					int gns = sc.nextInt();
					int bns = sc.nextInt();

					sc.close();

					System.out.println(gns + " " + bns);
					
					Eiendom eiendom = kontroll.finnEiendom(gns, bns);
					earea.setFields(eiendom);
				}
				
				
				

			}
		});

		vbox.getChildren().addAll(elist);
		hbox.getChildren().add(vbox);
	}

	public void setEArea(EditArea earea) {
		this.earea = earea;
	}
	
	public void update() {

		elist.getItems().clear();

		Collection<Eiendom> eiendommer = kontroll.getEiendommer();

		if (eiendommer != null) {

			Iterator<Eiendom> eit = eiendommer.iterator();
			System.out.println("update: " + eiendommer.size());

			while (eit.hasNext()) {
				Eiendom e = eit.next();
				int gns = e.getGns();
				int bns = e.getBns();
				elist.getItems().add(gns + " " + bns);
			}
		}

	}
}
