package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent; 

/*
 * Et grafikkprogram der brukeren kan opprette (små, rød) firkanter ved å 
 * klikke i vinduet. Firkantene kan deretter trekkes rundt på skjermen.
 */
public class FlyttbareFirkanter extends Application {
    
  private Pane lerret;
     
  public void start(Stage vindu) {
    lerret = new Pane();
    lerret.setOnMouseClicked(e -> lagFirkant(e));
    Scene scene = new Scene(lerret, 600, 600);
    vindu.setTitle("Flyttbare firkanter");
    vindu.setScene(scene);
    vindu.show();
  }

  public void lagFirkant(MouseEvent e1) {
    Rectangle firkant = new Rectangle(
              e1.getX(), e1.getY(), 20, 20);
    firkant.setFill(Color.RED);
    lerret.getChildren().add(firkant);
    firkant.setOnMouseDragged(e2 -> flytt(e2));

    // Rettelse: Hindrer at det blir laget en "ekstra" firkant
    // ved at hver trekk-og-slipp operasjon gir en klikk-hendelse
    // på lerretet når museknappen slippes opp.
    firkant.setOnMouseClicked(e3 -> hindreNyFirkant(e3));
  }
    
  public void flytt(MouseEvent e) {
    Rectangle firkant = (Rectangle) e.getSource();
    firkant.setX(e.getX());
    firkant.setY(e.getY());
  }

  public void hindreNyFirkant(MouseEvent e) {
    // Både lerretet og hver firkant lytter på museklikk.
    // Klikk i en firkant vil først bli fanget opp av firkanten
    // (altså denne metoden). Kallet på consume sørger for
    // at det stopper her, altså at vi unngår et nytt kall på
    // lagFirkant.
    e.consume();

    // Det er flere måter å få til dette på. Les mer f.eks. her: 
    // docs.oracle.com/javafx/2/events/processing.htm
  }

  public static void main(String[] args) {
    launch(args);
  }
}

