package no.hvl.dat100;

import easygraphics.*;

public class HodeHatt extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Mann med hatt");

		// Tegner hodet ved aa fylle en gul sirkel
		setColor(255, 255, 0);
		fillCircle(100, 160, 60);

		// Tegner hatten ved aa fylle to svarte rektangler
		setColor(0, 0, 0);
		fillRectangle(20, 100, 160, 25);
		fillRectangle(50, 25, 100, 75);
	}

}
