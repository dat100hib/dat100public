package no.hvl.dat100.gui.eksempler;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LaaneKalkulator extends Application {

  private TextField lånebeløp, årligRente, terminbeløp;
  private Label årInfo;
  private Slider antallÅr; // Skyveknappen

  private double rente = 2.5;
  private double beløp = 2500000.00;
  private double år = 20;

  private double mnd = år * 12; 
  private double mdnRente = Math.pow((1+rente/100), (1.0/12)) - 1;

  @Override
  public void start(Stage vindu) {
    final int LUFT = 10;
    GridPane panel = new GridPane();
    panel.setPadding(new Insets(LUFT, LUFT, LUFT, LUFT));
    panel.setHgap(LUFT);
    panel.setVgap(LUFT);

    Label lånEtikett = new Label("Lånebeløp:");
    lånebeløp = new TextField();
    lånebeløp.setPrefColumnCount(10);
    lånebeløp.setText(visBeløp(beløp));
    lånebeløp.setOnAction(e -> regnUt());

    Label renteEtikett = new Label("Årlig rente:");
    årligRente = new TextField();
    årligRente.setPrefColumnCount(10);
    årligRente.setText(Double.toString(rente));
    årligRente.setOnAction(e -> regnUt());

    Label terminEtikett = new Label("Månedlig terminbeløp:");
    terminbeløp = new TextField();
    terminbeløp.setPrefColumnCount(10);
    terminbeløp.setText(visBeløp(annuitetTermin(beløp, mdnRente, mnd)));
    terminbeløp.setEditable(false);

    årInfo = new Label("Antall år: " + (int) år);

    antallÅr = new Slider(0, 40, år);
    antallÅr.setOrientation(Orientation.HORIZONTAL);
    antallÅr.setShowTickLabels(true);
    antallÅr.setShowTickMarks(true);
    antallÅr.setBlockIncrement(10);
    antallÅr.setMajorTickUnit(5);
    antallÅr.setMinorTickCount(1);
    antallÅr.setSnapToTicks(true);
    antallÅr.valueProperty().addListener(e -> regnUt());

    panel.add(lånEtikett, 0, 0);
    panel.add(lånebeløp, 1, 0);
    panel.add(renteEtikett, 0, 1);
    panel.add(årligRente, 1, 1);
    panel.add(årInfo, 0, 2);
    panel.add(antallÅr, 0, 3, 2, 1);
    panel.add(terminEtikett, 0, 4);
    panel.add(terminbeløp, 1, 4);

    Scene scene = new Scene(panel);
    vindu.setTitle("Lånekalkulator");
    vindu.setScene(scene);
    vindu.show();
  }

  private void regnUt() {        
    double renteNy = Double.parseDouble(årligRente.getText());
    double beløpNy = hentBeløp(lånebeløp.getText());
    double årNy = antallÅr.getValue();

    if (renteNy != rente || beløp != beløpNy || Math.abs(år - årNy) > 1) {
      rente = renteNy/100.0;
      beløp = beløpNy;
      år = Math.round(årNy);
      mnd = år * 12;
      mdnRente = Math.pow((1+rente), (1.0/12)) - 1;
      double prMnd = annuitetTermin(beløp, mdnRente, mnd);

      årInfo.setText("Antall år: " + (int) år);
      terminbeløp.setText(visBeløp(prMnd));
    }
  }

  private double annuitetTermin(double beløp, 
                                double rente, 
                                double antall) {
    return beløp*rente/(1 - Math.pow(1+rente,-antall));
  }

  private String visBeløp(double beløp) {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return nf.format(beløp);
  }

  private double hentBeløp(String str) {
    double beløp = 0.0;
    try {
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      return nf.parse(str).doubleValue();
    }
    catch (ParseException e) {
      System.out.println("Ugyldig beløp.");
    }
    return beløp;
  }

  public static void main(String[] args) {
    launch(args);
  }

}
