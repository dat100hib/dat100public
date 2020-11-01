package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Histogram extends Application {

  @Override
  public void start(Stage vindu) {     

    int x = 50;             // Nedre, venstre hjørne
    int y = 400;            // av den første søylen
    int bredde = 50;        // Bredden på søylene
    int luft = bredde / 2;  // Luft mellom søylene
    int faktor = 30;        // Fra mm til piksler

    Pane lerret = new Pane();
    Font font = new Font("Arial", 24);

    int[] nedbør = {5, 11, 3, 7, 2};
    String[] dager = {"man", "tir", "ons", "tor", "fre"};

    for (int i = 0; i < dager.length; i++) {
      int høyde = nedbør[i] * faktor;
      Rectangle søyle = new Rectangle(x, y-høyde, 
                                      bredde, høyde);
      søyle.setFill(Color.GRAY);
      Text dag = new Text(x+bredde/3, y+luft, dager[i]);
      Text verdi = new Text(x+bredde/3, y-høyde-luft,
                            ""+nedbør[i]);
      lerret.getChildren().addAll(søyle, dag, verdi);
      x += bredde + luft;
    }

    Scene scene = new Scene(lerret, 450, 450);
    vindu.setScene(scene);
    vindu.setTitle("Histogram");
    vindu.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
