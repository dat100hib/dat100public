package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import easygraphics.*;

public class TestingEksempel extends EasyGraphics {

	public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
		  
	    makeWindow("CO-2 nivå indikator");

	    int co2 = parseInt( getText("PPM: ") );
	  
	    if (co2 < 500) {
	    	setColor(0, 255, 0); // green
	    } else {
	    	setColor(255,0,0); // red
	    }
	    
	    fillCircle(100, 160, 60);
	    
	  }
}
