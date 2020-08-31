package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class Husrekke extends EasyGraphics {

	  public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    makeWindow("Husrekke");
	    
	    tegnTrekant(20,200,60,40);
	   
	    tegnHus(20,200,60,40);
	    
	    tegnHusrekke(5, 20, 200, 60, 40, 10);
	  }

	  private void tegnHusrekke(int antallHus,
	                            int startX, int startY,
	                            int bredde, int høyde, int avstand) {
	    for (int husNr=1; husNr<=antallHus; husNr++) {
	      tegnHus(startX, startY, bredde, høyde);
	      startX = startX + bredde + avstand;
	    }
	  }

	  private void tegnHus(int x, int y,
	                       int bredde, int høyde ) {
	    int veggTopp = y - høyde/2;
	    drawRectangle(x, veggTopp, bredde, høyde/2);
	    tegnTrekant(x, veggTopp, bredde, høyde/2);
	  }

	  private void tegnTrekant(int x, int y,
	                           int bredde, int høyde) {
	    drawLine(x, y, x+bredde, y);
	    drawLine(x+bredde, y, x + bredde/2, y-høyde);
	    drawLine(x + bredde/2, y-høyde, x, y);
	  }

	}