package no.hvl.dat100;

import easygraphics.*;

public class Sjakkbrett extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}

	public void run() {

		final int L = 20;
		final int N = 10;
		final int startX = 20;
		final int startY = 20;

		makeWindow("Sjakk");

		int x = startX;
		int y = startY;
		boolean fyll = true;

		setColor(0, 0, 0);

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= N; j++) {

				if (fyll) {
					fillRectangle(x, y, L, L);
				} else {
					drawRectangle(x, y, L, L);
				}

				x = x + L;

				fyll = (!fyll);
			}

			fyll = (!fyll);

			x = startX;
			y = y + L;
		}
	}
}
