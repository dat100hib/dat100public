package no.hvl.dat100.gui.innlogging;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Innlogging5 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private static TextField brukernavn;
	private static PasswordField passord;
	private static Label responselabel;
	
	public void start(Stage stage) {

		// main panel for login
		GridPane panel = new GridPane();
		panel.setHgap(10);
		panel.setVgap(10);
		panel.setPadding(new Insets(10, 10, 10, 10));

		// input fields
		Label brukerlabel = new Label("Brukernavn:");
		brukernavn = new TextField();
		brukernavn.setPrefColumnCount(25);

		Label passordlabel = new Label("Passord:");
		passord = new PasswordField();
		passord.setPrefColumnCount(25);

		// response label
		responselabel = new Label("");

		// horizontal box for the two buttons
		HBox buttonbox = new HBox();
		buttonbox.setSpacing(5);

		Button loginbutton = new Button("Login");
		Button clearbutton = new Button("Clear");

		buttonbox.getChildren().add(loginbutton);
		buttonbox.getChildren().add(clearbutton);

		loginbutton.setOnAction(e -> loginHandler());
		clearbutton.setOnAction(e -> clearHandler());

		// setup the panel
		panel.add(brukerlabel, 0, 0);
		panel.add(brukernavn, 1, 0);

		panel.add(passordlabel, 0, 1);
		panel.add(passord, 1, 1);

		panel.add(responselabel, 0, 2);
		panel.add(buttonbox, 1, 2);

		// setup scene and stage
		Scene scene = new Scene(panel, 500, 120);
		stage.setScene(scene);
		stage.setTitle("Innlogging");
		stage.show();
	}

	public void loginHandler() {
		
		if (brukernavn.getText().equals("dat100") && passord.getText().equals("001tad")) {
			responselabel.setText("Logged in!");
		} else {
			responselabel.setText("Login failed");
		}

		brukernavn.clear();
		passord.clear();
	}

	public void clearHandler() {
		
		brukernavn.clear();
		passord.clear();
		responselabel.setText("");
	}

}