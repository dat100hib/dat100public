package no.hvl.dat100.eksempler;

import easygraphics.EasyGraphics;

public class Kino extends EasyGraphics {

	final int ANT_SALER = 4;
	final int ANT_FORESTILLINGER = 3;
	final int ANT_REKKER = 15;
	final int ANT_SETER = 20;
				
	// 4-dimensjoner - saler - forestillinger
	boolean[][][][] saler = new boolean[ANT_SALER][ANT_FORESTILLINGER][ANT_REKKER][ANT_SETER]; 

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		makeWindow("KINO RESERVASJON", 800,400);
		
		int i = 5; 	
		do {
			
			reserver(); 
			i--;
			
		} while (i>0);
		
	}

	int RADIUS = 10;
	int MARGIN = 50;

	public void visReservasjoner(boolean[][] forestilling) {

		for (int rekkenr = 0; rekkenr<ANT_REKKER; rekkenr++) {
			
			for (int setenr = 0; setenr<ANT_SETER; setenr++) {
				
				if (forestilling[rekkenr][setenr]) {
					setColor(255,0,0); // rød
				} else {
					setColor(0,255,0); // grøn
				}	
			
			
			fillCircle(MARGIN + setenr * 2 * RADIUS,MARGIN + rekkenr * 2* RADIUS,RADIUS);
			
			}
		}	
	}

	public void reserver() {
		
		int salnr = Integer.parseInt(getText("Sal"));
		
		int filmnr = Integer.parseInt(getText("Forestilling"));

		boolean[][] forestilling = saler[salnr][filmnr];
		
		visReservasjoner(forestilling);
		
		int radnr = Integer.parseInt(getText("Rad for reservasjon"));
		
		int setenr = Integer.parseInt(getText("Sete for reservasjon"));
	
		forestilling[radnr][setenr] = true;
		
		visReservasjoner(forestilling);
	}

}
