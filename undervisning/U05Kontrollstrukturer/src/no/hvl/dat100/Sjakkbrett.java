package no.hvl.dat100;

import easygraphics.*;

public class Sjakkbrett extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}

	public void run() {

		final int L = 20;
		final int N = 12;
		final int startX = 50;
		final int startY = 50;

		makeWindow("Sjakk");

		int x = startX;
		int y = startY;
		
		setColor(0, 0, 0);
		
		boolean fyll;

		for (int i = 1; i <= N; i++) {

			fyll = (i % 2 != 0);
			
			for (int j = 1; j <= N; j++) {

				if (fyll) {
					fillRectangle(x, y, L, L);
				} else {
					drawRectangle(x, y, L, L);
				}

				x = x + L;

				fyll = (!fyll);
			}

			x = startX;
			y = y + L;
		}
	}
}
