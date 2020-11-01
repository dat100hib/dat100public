package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class KlikkApp extends Application {

  private int antAv1 = 0, antAv2 = 0;
  private Button knapp1, knapp2, nullstill;
  private TextField tekst1, tekst2;
 
  public void start(Stage vindu) {
    FlowPane panel = new FlowPane();
    panel.setHgap(10);
    panel.setVgap(10);  
    Label ledetekst = 
       new Label("Klikk på en av de to knappene.");

    // Oppretter den første knappen
    knapp1 = new Button("Knapp 1");

    // Oppretter det første tekstfeltet
    tekst1 = new TextField();
    tekst1.setPrefColumnCount(10);

    // Oppretter den andre knappen
    knapp2 = new Button("Knapp 2");

    // Oppretter det andre tekstfeltet
    tekst2 = new TextField();
    tekst2.setPrefColumnCount(10);

    // Oppretter den tredje knappen
    nullstill = new Button("Nullstill");

    knapp1.setOnAction(e -> knapp1Klikk());
    knapp2.setOnAction(e -> knapp2Klikk());
    nullstill.setOnAction(e -> nullstill());

    panel.getChildren().addAll(knapp1,tekst1, 
            knapp2,tekst2,nullstill);

    Scene scene = new Scene(panel, 230, 120);
    vindu.setTitle("Knappeklikk");
    vindu.setScene(scene);
    vindu.show();
  }

  public void knapp1Klikk() {
    antAv1++;
    tekst1.setText("Antall klikk = " + antAv1);
  }

  public void knapp2Klikk() {
    antAv2++;
    tekst2.setText("Antall klikk = " + antAv2);
  }

  public void nullstill() {
    antAv1 = 0;
    antAv2 = 0;
    tekst1.setText("");
    tekst2.setText("");
  }

  public static void main(String[] args) {
    launch(args);
  }

}

