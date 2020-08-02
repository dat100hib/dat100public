package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		
		makeWindow("Vindu", 800, 800);
		
		String tekst = "Vanlig skrifttype: 12";
		drawString(tekst, 10, 20);

		setFont("Arial", 24);
		tekst = "Samme skrifttype, litt større: 24";
		drawString(tekst, 10, 60);

		setFont("Times New Roman", 18);
		tekst = "En annen skrifttype: Times New Roman, 18";
		drawString(tekst, 10, 100);

		
		// her skrives koden for easy graphics programmet
	}
}
