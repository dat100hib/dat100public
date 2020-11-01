package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PacMan0 extends Application {

  public void start(Stage vindu) { 
    Pane rot = new Pane();
    Scene scene = new Scene(rot, 800, 300);
    vindu.setScene(scene);
    vindu.setTitle("PacMan Enkel Demo");
 
    Arc pacman = new Arc(100, 200, 50, 50, 30, 300);
    pacman.setStroke(Color.BLACK);
    pacman.setFill(Color.YELLOW);
    pacman.setType(ArcType.ROUND);
    rot.getChildren().add(pacman);
 
    Font font = new Font("Arial", 44);
    Text tekst = new Text(300, 80, "PacMan");
    tekst.setStroke(Color.YELLOW);
    tekst.setFill(Color.RED);
    tekst.setFont(font);
    rot.getChildren().add(tekst); 

    vindu.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
