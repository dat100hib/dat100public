package no.hvl.dat100.gui.innlogging;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginBtnHandler implements EventHandler<ActionEvent> {

	private TextField brukernavn;
	private PasswordField passord;
	private Label response;

	public LoginBtnHandler(TextField brukernavn, PasswordField passord, Label response) {

		this.brukernavn = brukernavn;
		this.passord = passord;
		this.response = response;

	}

	@Override
	public void handle(ActionEvent actionEvent) {

		if (brukernavn.getText().equals("dat100") && passord.getText().equals("001tad")) {
			response.setText("Logged in!");
		} else {
			response.setText("Login failed");
		}
		
		brukernavn.clear();
		passord.clear();
	}

}
