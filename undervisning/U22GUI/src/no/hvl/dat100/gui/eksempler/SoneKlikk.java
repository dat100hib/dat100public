package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SoneKlikk extends Application {

  private int antall = 0;
  private Button knapp;
  private TextField tekstfelt;

  @Override
  public void start(Stage vindu) throws Exception {
    BorderPane panel = new BorderPane();
    knapp = new Button("Klikk her!");
    knapp.setOnAction(e -> behandleKlikk(e));
    panel.setTop(knapp);
    tekstfelt = new TextField();
    tekstfelt.setPrefColumnCount(10);
    panel.setBottom(tekstfelt);
    Scene scene = new Scene(panel, 300, 100);

    vindu.setTitle("SoneKlikk");
    vindu.setScene(scene);
    vindu.show();
  }

  public void behandleKlikk(ActionEvent event) {
    antall++;
    tekstfelt.setText("Antall klikk = " + antall);
  }

  public static void main(String[] args) {
    launch(args);
  }

}

