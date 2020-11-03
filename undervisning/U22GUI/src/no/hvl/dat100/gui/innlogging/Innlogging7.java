package no.hvl.dat100.gui.innlogging;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Innlogging7 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private static TextField brukernavn;
	private static PasswordField passord;
	private static Label responselabel;
	private static Button loginbutton, clearbutton;

	public void start(Stage stage) {

		// main panel for login
		GridPane panel = new GridPane();
		panel.setHgap(10);
		panel.setVgap(10);
		panel.setPadding(new Insets(10, 10, 10, 10));

		VBox vbox = new VBox();

		MenuBar menulinje = new MenuBar();
		Menu infomenu = new Menu("Info");
		MenuItem about = new MenuItem("About");
		MenuItem exit = new MenuItem("Exit");

		about.setOnAction(e -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("About");
			alert.setHeaderText("Version 1.0");
			alert.setContentText("LoginApp");

			alert.showAndWait();
		});

		exit.setOnAction(e -> {
			Platform.exit();
		});

		infomenu.getItems().addAll(about, exit);
		menulinje.getMenus().add(infomenu);

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

		loginbutton = new Button("Login");
		clearbutton = new Button("Clear");

		buttonbox.getChildren().add(loginbutton);
		buttonbox.getChildren().add(clearbutton);

		loginbutton.setOnAction(e -> BtnHandler(e));
		clearbutton.setOnAction(e -> BtnHandler(e));

		// setup the panel
		panel.add(brukerlabel, 0, 0);
		panel.add(brukernavn, 1, 0);

		panel.add(passordlabel, 0, 1);
		panel.add(passord, 1, 1);

		panel.add(responselabel, 0, 2);
		panel.add(buttonbox, 1, 2);

		vbox.getChildren().addAll(menulinje, panel);

		// setup scene and stage
		Scene scene = new Scene(vbox, 500, 150);
		stage.setScene(scene);
		stage.setTitle("Innlogging");
		stage.show();
	}

	public void BtnHandler(ActionEvent e) {

		if (e.getSource() == loginbutton) {

			if (brukernavn.getText().equals("dat100") && passord.getText().equals("001tad")) {
				responselabel.setText("Logged in!");
			} else {
				responselabel.setText("Login failed");
			}
		} else if (e.getSource() == clearbutton) {
			responselabel.setText("");
		}

		brukernavn.clear();
		passord.clear();
	}
}