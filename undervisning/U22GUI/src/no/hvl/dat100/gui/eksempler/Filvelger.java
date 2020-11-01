package no.hvl.dat100.gui.eksempler;

import java.io.File;
import static java.lang.System.out;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Filvelger extends Application {

  private Button åpneKnapp;

  @Override
  public void start(Stage vindu) {
    åpneKnapp = new Button();
    åpneKnapp.setText("Åpne fil...");
    åpneKnapp.setOnAction(e -> lesFil());
    FlowPane panel = new FlowPane();
    panel.getChildren().add(åpneKnapp);
    Scene scene = new Scene(panel);
    vindu.setTitle("Filvelger");
    vindu.setScene(scene);
    vindu.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

  public void lesFil() {
    FileChooser filvelger = new FileChooser();
    File fil = filvelger.showOpenDialog(null);
    if ( fil != null )
      out.println("Valgt fil: " + fil.getAbsolutePath()); 
    else
      out.println("Du angret deg!");
  }

}

