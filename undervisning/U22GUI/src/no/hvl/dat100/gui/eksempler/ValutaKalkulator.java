package no.hvl.dat100.gui.eksempler;

import static java.lang.Double.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ValutaKalkulator extends Application {

  private String[] valutakode = {"EUR", "USD", "GBP"};
  private double[] valutakurs = { 9.70,  7.95, 11.05};
  private Button beregn;
  private TextField inn, ut;
  private ComboBox liste;

  @Override
  public void start(Stage vindu) {
    FlowPane panel = new FlowPane();
    panel.setHgap(10);

    inn = new TextField();
    inn.setPrefColumnCount(6);

    liste = new ComboBox();
    liste.getItems().addAll(valutakode);

    liste.setValue("EUR");
    beregn = new Button("=");
    ut = new TextField();
    ut.setPrefColumnCount(6);

    panel.getChildren().add(inn);
    panel.getChildren().add(liste);
    panel.getChildren().add(beregn);
    panel.getChildren().add(ut);
    panel.getChildren().add(new Label("NKR"));

    inn.setOnAction(e -> regnOm());
    liste.setOnAction(e -> regnOm());
    beregn.setOnAction(e -> regnOm());

    ut.setEditable(false);

    Scene scene = new Scene(panel, 700, 100);
    vindu.setTitle("Valutakalkulator");
    vindu.setScene(scene);
    vindu.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

  public void regnOm() {
    try {
      double innbeløp = parseDouble(inn.getText());
      int valutaNr = liste.getSelectionModel()
                          .getSelectedIndex(); 
      double dagskurs = valutakurs[valutaNr];
      double utbeløp = innbeløp * dagskurs;
      ut.setText("" + Math.round(utbeløp) + ".00");
    }
    catch (Exception e) {
      ut.setText("Feil i beløp!");
    }
  }

}

