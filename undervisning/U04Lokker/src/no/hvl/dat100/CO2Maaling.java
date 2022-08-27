package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import easygraphics.*;

public class CO2Maaling extends EasyGraphics {
	
	private static int ANTALL = 10;
	
	public static void main(String[] args) {
	    launch(args);
	  }

	  public void run()  {
		  
	    makeWindow("CO-2 nivå indikator");

	    for (int i = 1; i<=ANTALL; i++) {
	    	
	    	int co2 = parseInt( getText("PPM: [" + i + "]" ));
			
	 	    if (co2 < 500) {
	 	    	setColor(0, 255, 0); // green
	 	    } else {
	 	    	setColor(255,0,0); // red
	 	    }
	 	    
	 	    fillCircle(100, 160, 60);
	 	    
	 	   
	    }
	  }

}
