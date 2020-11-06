package no.hvl.dat100.gui.innlogging;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Innlogging1 extends Application {


	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {

		GridPane panel = new GridPane();
		panel.setHgap(10);

		Label etikett = new Label("Brukernavn:");
		TextField brukernavn = new TextField();
		
		Label etikettPassord = new Label("Passord:");
		TextField passordFelt = new TextField();
		
		brukernavn.setPrefColumnCount(25);

		panel.add(etikett,0,0);
		panel.add(brukernavn,1,0);
		panel.add(etikettPassord, 0, 1);
		panel.add(passordFelt, 1, 1);

		Scene scene = new Scene(panel, 500, 70);
		stage.setScene(scene);
		stage.setTitle("Innlogging");
		stage.show();

	}

}