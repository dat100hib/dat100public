package no.hvl.dat100;

import easygraphics.*;

public class BiljardKugle extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}

	public void run() {
		
		final int ANT_ITER = 5000;
		final int BREDDE = 800;
		final int HOYDE = 600;
		
		int r = 10;
		int x = 10, y = 10;
		int dx = 2, dy = 3;
		
		makeWindow("Biljard", BREDDE, HOYDE);
		
		setColor(255,0,0);
		
		int id = fillCircle(x,y,r);
		
		// TODO - START
		
		for (int i = 1; i<=ANT_ITER; i++) {
			
			if ( (x+dx-r <= 0) || (x+dx+r >=BREDDE) ) {
				dx = - dx;
			}
			
			if ( (y+dy-r <= 0) || (y+dy+r >= HOYDE) ) {
				dy = -dy;
			}
			
			x = x + dx;
			y = y + dy;
			
			moveCircle(id,x,y);
			
			pause(10);
			
		}
		
		// TODO END
	}

}
