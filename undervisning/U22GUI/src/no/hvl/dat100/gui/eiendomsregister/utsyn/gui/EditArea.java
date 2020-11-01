package no.hvl.dat100.gui.eiendomsregister.utsyn.gui;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Separator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll;
import no.hvl.dat100.gui.eiendomsregister.modell.Eiendom;
import no.hvl.dat100.gui.eiendomsregister.modell.Eier;
import no.hvl.dat100.gui.eiendomsregister.modell.KontaktAdresse;
import no.hvl.dat100.gui.eiendomsregister.modell.NeringsEiendom;
import no.hvl.dat100.gui.eiendomsregister.modell.UtleieEiendom;



public class EditArea {

	private Kontroll kontroll = null;

	// edit fields
	TextField gnsfield, bnsfield;
	TextField navnfield, fodselsnrfield;
	TextField veinrfield, veinavnfield;
	TextField byfield, postfield;
	TextField landfield;
	TextField leiefield, fodnrfield, orgnrfield;

	public static int FIELDS = 12;
	private TextField[] fields;

	private RadioButton utleiebtn, neringsbtn;

	private OverviewArea oarea;

	public EditArea(HBox hbox, Kontroll kontroll, OverviewArea oarea) {

		this.kontroll = kontroll;
		this.oarea = oarea;

		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10, 0, 0, 10));

		fields = new TextField[FIELDS];

		GridPane eiendomgp = new GridPane();
		eiendomgp.setPadding(new Insets(10, 10, 10, 10));
		eiendomgp.setHgap(10);
		eiendomgp.setVgap(10);

		Label gnslabel = new Label("gns");
		Label bnslabel = new Label("bns");

		gnsfield = new TextField();
		bnsfield = new TextField();
		bnsfield.setPrefWidth(50);
		gnsfield.setPrefWidth(50);

		HBox gnsbnshbox = new HBox();
		gnsbnshbox.setSpacing(5);

		gnsbnshbox.getChildren().addAll(gnsfield, bnslabel, bnsfield);

		eiendomgp.add(gnslabel, 0, 0);
		eiendomgp.add(gnsbnshbox, 1, 0);

		Separator separator1 = new Separator();

		navnfield = new TextField();
		Label navnlabel = new Label("Navn");

		eiendomgp.add(navnlabel, 0, 1);
		eiendomgp.add(navnfield, 1, 1);

		fodselsnrfield = new TextField();
		Label fodselnrlabel = new Label("Fødnr");
		eiendomgp.add(fodselnrlabel, 0, 2);
		eiendomgp.add(fodselsnrfield, 1, 2);

		Separator separator2 = new Separator();

		veinrfield = new TextField();
		Label veinrlabel = new Label("Nr");
		veinrfield.setPrefWidth(100);

		veinavnfield = new TextField();
		Label veinavnlabel = new Label("Vei");

		HBox veihbox = new HBox(veinavnfield, veinrfield, veinrlabel);
		veihbox.setSpacing(5);

		eiendomgp.add(veinavnlabel, 0, 3);
		eiendomgp.add(veihbox, 1, 3);

		byfield = new TextField();
		Label bylabel = new Label("By");

		postfield = new TextField();
		Label postlabel = new Label("Postnr");
		postfield.setPrefWidth(100);

		HBox byhbox = new HBox(byfield, postfield, postlabel);
		byhbox.setSpacing(5);

		eiendomgp.add(bylabel, 0, 4);
		eiendomgp.add(byhbox, 1, 4);

		landfield = new TextField();
		Label landlabel = new Label("Land");

		eiendomgp.add(landlabel, 0, 5);
		eiendomgp.add(landfield, 1, 5);

		Separator separator3 = new Separator();

		utleiebtn = new RadioButton("Utleieeiendom");
		neringsbtn = new RadioButton("Næringseiendom");

		ToggleGroup radioGroup = new ToggleGroup();

		utleiebtn.setToggleGroup(radioGroup);
		neringsbtn.setToggleGroup(radioGroup);
		utleiebtn.setPadding(new Insets(10, 10, 10, 10));
		neringsbtn.setPadding(new Insets(10, 10, 10, 10));

		HBox typehbox = new HBox(utleiebtn, neringsbtn);

		GridPane typepane = new GridPane();

		leiefield = new TextField();
		Label leielabel = new Label("Leie");

		fodnrfield = new TextField();
		Label fodnrlabel = new Label("Fødnr");

		orgnrfield = new TextField();
		Label orgnrlabel = new Label("Orgnr");

		typepane.add(leielabel, 0, 0);
		typepane.add(leiefield, 1, 0);
		typepane.add(fodnrlabel, 0, 1);
		typepane.add(fodnrfield, 1, 1);
		typepane.add(orgnrlabel, 0, 2);
		typepane.add(orgnrfield, 1, 2);
		typepane.setPadding(new Insets(10, 10, 10, 10));
		typepane.setHgap(10);
		typepane.setVgap(10);

		fields[0] = gnsfield;
		fields[1] = bnsfield;
		fields[2] = navnfield;
		fields[3] = fodselsnrfield;
		fields[4] = veinrfield;
		fields[5] = veinavnfield;
		fields[6] = byfield;
		fields[7] = postfield;
		fields[8] = landfield;
		fields[9] = leiefield;
		fields[10] = fodnrfield;
		fields[11] = orgnrfield;

		HBox buttonhbox = new HBox();
		buttonhbox.setSpacing(10);
		buttonhbox.setPadding(new Insets(10, 10, 10, 10));

		Button newbutton = new Button("New");
		newbutton.setOnAction(e -> {
			System.out.println("New");

			clearFields();
			setEditable(true);
		});

		Button editbutton = new Button("Edit");
		editbutton.setOnAction(e -> {
			System.out.println("Edit");

			setEditable(true);
		});

		Button updatebutton = new Button("Update");
		updatebutton.setOnAction(e -> {

			System.out.println("Update");
			readFields();
			setEditable(false);
			oarea.update();
		});

		Button refreshbtn = new Button("Refresh");
		refreshbtn.setOnAction(e -> {
			System.out.println("Refresh");

			oarea.update();

		});

		buttonhbox.getChildren().addAll(newbutton, editbutton, updatebutton, refreshbtn);

		vbox.getChildren().addAll(separator1, eiendomgp, separator2, typehbox, typepane, separator3, buttonhbox);

		hbox.getChildren().addAll(vbox);

	}

	public void clearFields() {

		for (TextField field : fields) {
			field.clear();
		}

		utleiebtn.setSelected(false);
		neringsbtn.setSelected(true);

	}

	public void readFields() {

		int gns = Integer.parseInt(gnsfield.getText());
		int bns = Integer.parseInt(bnsfield.getText());

		kontroll.slettEiendom(gns, bns); // slett i tilfelle finnnes allerede

		String navn = navnfield.getText();
		int fodnr = Integer.parseInt(fodselsnrfield.getText());

		int veinr = Integer.parseInt(veinrfield.getText());
		String vei = veinavnfield.getText();
		String by = byfield.getText();
		int postnr = Integer.parseInt(postfield.getText());
		String land = landfield.getText();

		KontaktAdresse ka = new KontaktAdresse(vei, veinr, postnr, by, land);

		if (utleiebtn.isSelected()) {
			int leie = Integer.parseInt(leiefield.getText());
			int leierfodnr = Integer.parseInt(fodnrfield.getText());
			kontroll.nyUtleieEiendom(gns, bns, leierfodnr, leie);

		} else {
			int orgnr = Integer.parseInt(orgnrfield.getText());
			kontroll.nyNeringsEiendom(gns, bns, orgnr);
		}

		kontroll.nyEier(navn, fodnr, ka, gns, bns);
	}

	public void setEditable(boolean editable) {

		for (TextField field : fields) {
			field.setEditable(editable);
		}

	}

	public void setFields(Eiendom eiendom) {

		gnsfield.setText(Integer.toString(eiendom.getGns()));
		bnsfield.setText(Integer.toString(eiendom.getBns()));

		ArrayList<Eier> eiere = eiendom.getEiere();

		// TODO: for nå vises bare den første eier
		Eier eier = eiere.get(0);

		navnfield.setText(eier.getNavn());
		fodselsnrfield.setText(Integer.toString(eier.getFodselsnummer()));

		KontaktAdresse adresse = eier.getAdresse();

		veinrfield.setText(Integer.toString(adresse.getNummer()));
		veinavnfield.setText(adresse.getVei());

		byfield.setText(adresse.getBy());
		postfield.setText(Integer.toString(adresse.getPostnummer()));
		landfield.setText(adresse.getLand());

		if (eiendom instanceof NeringsEiendom) {
			NeringsEiendom ne = (NeringsEiendom) eiendom;
			orgnrfield.setText(Integer.toString(ne.getOrgnr()));

			leiefield.clear();
			fodnrfield.clear();

			utleiebtn.setSelected(false);
			neringsbtn.setSelected(true);

		} else {
			UtleieEiendom ut = (UtleieEiendom) eiendom;

			leiefield.setText(Integer.toString(ut.getLeie()));
			fodnrfield.setText(Integer.toString(ut.getLeier()));
			orgnrfield.clear();

			utleiebtn.setSelected(true);
			neringsbtn.setSelected(false);
		}

		setEditable(false);
	}
}
