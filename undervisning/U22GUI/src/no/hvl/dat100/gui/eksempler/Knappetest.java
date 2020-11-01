package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField; 
import javafx.event.ActionEvent;

public class Knappetest extends Application {

  private int antall = 0;
  private Button knapp;  
  private TextField tekstfelt;  

  public void start(Stage vindu) { 
    FlowPane panel = new FlowPane();
    panel.setHgap(10);
    knapp = new Button("Klikk her!");
    knapp.setOnAction(e -> behandleKlikk(e));
    tekstfelt = new TextField(); 
    tekstfelt.setPrefColumnCount(15);
    panel.getChildren().addAll(knapp, tekstfelt); 
    Scene scene = new Scene(panel);
    vindu.setTitle("Knappetrykking");
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
