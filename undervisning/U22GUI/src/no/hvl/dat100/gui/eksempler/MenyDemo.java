package no.hvl.dat100.gui.eksempler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenyDemo extends Application {

  private TextArea tekstOmråde;
  private MenuBar menylinje = new MenuBar();
  private Menu filmeny = new Menu("Fil");
  private MenuItem ny = new MenuItem("Ny");
  private MenuItem avslutt = new MenuItem("Avslutt");

  @Override
  public void start(Stage vindu) {
    BorderPane panel = new BorderPane();
    tekstOmråde = new TextArea();
    panel.setCenter(tekstOmråde);
    filmeny.getItems().addAll(ny, avslutt);
    menylinje.getMenus().addAll(filmeny);
    ny.setOnAction(e -> opprettNy());
    avslutt.setOnAction(e -> avslutt());
    panel.setTop(menylinje);
    Scene scene = new Scene(panel, 400, 400);
    vindu.setTitle("MenyDemo");
    vindu.setScene(scene);
    vindu.show();
  }

  public void opprettNy() {
    tekstOmråde.appendText("Menyvalg Ny virker ikke...\n");
  }

  public void avslutt() {
    tekstOmråde.appendText("Menyvalg Avslutt virker ikke...\n");
  }

  public static void main(String[] args) {
    launch(args);
  }
}


