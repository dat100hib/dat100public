package no.hvl.dat100.gui.innlogging;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Innlogging1 extends Application {


	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {

		FlowPane panel = new FlowPane();
		panel.setHgap(10);

		Label etikett = new Label("Brukernavn:");
		TextField brukernavn = new TextField();
		brukernavn.setPrefColumnCount(25);

		panel.getChildren().add(etikett);
		panel.getChildren().add(brukernavn);

		Scene scene = new Scene(panel, 500, 70);
		stage.setScene(scene);
		stage.setTitle("Innlogging");
		stage.show();

	}

}