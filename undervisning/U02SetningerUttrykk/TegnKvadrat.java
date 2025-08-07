package no.hvl.dat100;

import static java.lang.Integer.*;
import easygraphics.*;

public class TegnKvadrat extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
	  
    makeWindow("TegnKvadrat");

    // Leser startverdier for posisjon og størrelse
    int x = parseInt( getText("X: ") );
    int y = parseInt( getText("Y: ") );
    int h = parseInt( getText("Høyde: ") );

    // Det store kvadratet
    drawRectangle(x, y, h, h);

    // Det lille kvadratet
    int nyH = h/2;
    int nyX = x + nyH/2;
    int nyY = y + nyH/2;
    fillRectangle(nyX, nyY, nyH, nyH);
  }

}
