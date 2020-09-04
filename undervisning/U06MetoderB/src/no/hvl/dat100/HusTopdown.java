package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class HusTopdown extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Husrekke");

		// tegnHusRekke(5,20,200,60,40,10);
		
		tegnTrekant(20,200,60,40);
	}

	public void tegnHusRekke(
			int antallHus,
			int startX, int startY,
			int bredde, int hoyde, int avstand) {
		
		for (int husNr = 1; husNr <= antallHus; husNr++) {
		
			tegnHus(startX,startY,bredde,hoyde);
			startX = startX + bredde + avstand;
		}
	}
	
	public void tegnHus(int x, int y, int bredde, int hoyde) {
		
		int veggTopp = y - hoyde / 2;
		
		drawRectangle(x,veggTopp,bredde,hoyde/2);
		tegnTrekant(x,veggTopp,bredde,hoyde/2);
	}
	
	public void tegnTrekant(int x, int y, int bredde, int hoyde) {
		
		drawLine(x,y,x+bredde,y);
		drawLine(x+bredde,y,x+bredde/2,y-hoyde);
		drawLine(x+bredde/2,y-hoyde,x,y);
		
	}
}
