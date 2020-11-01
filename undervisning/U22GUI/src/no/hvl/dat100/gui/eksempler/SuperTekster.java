package no.hvl.dat100.gui.eksempler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SuperTekster extends Application {

  private TextField filnavn;
  private Button åpne, lagre;
  private TextArea skriveområde;
  private Label melding;

  @Override
  public void start(Stage vindu) {

    Label filetikett = new Label("Fil:");
    filnavn = new TextField();
    filnavn.setPrefColumnCount(10);
    åpne = new Button("Åpne");
    lagre = new Button("Lagre");

    skriveområde = new TextArea();
    skriveområde.setWrapText(true);

    Font font = new Font("Courier New", 12);
    skriveområde.setFont(font);

    Label status = new Label("Status:");
    melding = new Label("");

    åpne.setOnAction(e -> lesFraFil());
    lagre.setOnAction(e -> skrivTilFil());

    FlowPane topp = new FlowPane();
    topp.setHgap(10);
    topp.getChildren().addAll(filetikett, filnavn, åpne, lagre);
    BorderPane panel = new BorderPane();
    panel.setTop(topp);
    panel.setCenter(skriveområde);
    FlowPane bunn = new FlowPane();
    bunn.setHgap(10);
    bunn.getChildren().addAll(status, melding);
    panel.setBottom(bunn);
        
    Scene scene = new Scene(panel, 400, 400);
    vindu.setTitle("SuperTekster");
    vindu.setScene(scene);
    vindu.show();
  }

  public void lesFraFil() {
    String statusmelding = "";
    try {
      String fil = filnavn.getText();
      FileReader innlink = new FileReader(fil);
      BufferedReader leser = new BufferedReader(innlink);
      String innTekst = "";
      String linje = leser.readLine();
      while (linje != null) {
        innTekst += linje + "\n";
        linje = leser.readLine();
      }
      leser.close();
      statusmelding = "Filen er åpnet ok";
      skriveområde.setText(innTekst);
    }
    catch (Exception e) {
      statusmelding = "Problem med filen!";
    }
    melding.setText(statusmelding);
  }

  public void skrivTilFil() {
    String statusmelding = "";
    try {
      String fil = filnavn.getText();
      PrintWriter skriver = new PrintWriter(fil);
      skriver.println(skriveområde.getText());
      skriver.close();
      statusmelding = "Teksten er lagret ok";
    }
    catch (Exception e) {
      statusmelding = "Problem med filen!";
    }
    melding.setText(statusmelding);
  }

  public static void main(String[] args) {
    launch(args);
  }

}
