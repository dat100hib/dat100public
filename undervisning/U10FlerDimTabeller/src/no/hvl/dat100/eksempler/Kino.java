package no.hvl.dat100.eksempler;

import easygraphics.EasyGraphics;

public class Kino extends EasyGraphics {

	final int ANT_SALER = 2;
	final int ANT_FILMER = 3;
	final int ANT_REKKER = 15;
	final int ANT_SETER = 20;
	
	// 2-dimensjoner - 15 rader med 20 seter;
	boolean[][] forestilling = new boolean[ANT_REKKER][ANT_SETER]; // 
			
	// 3-dimensjoner - 3 forestillinger 
	boolean[][][] forestillinger = new boolean[ANT_FILMER][ANT_REKKER][ANT_SETER]; 
			
	// 4-dimensjoner - 2 saler
	boolean[][][][] saler = new boolean[ANT_SALER][ANT_FILMER][ANT_REKKER][ANT_SETER]; 

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
		
		System.out.println("Angi sal i tekstvinduet...");
		int salnr = Integer.parseInt(getText("sal"));
		
		System.out.println("Angi film i tekstvinduet...");
		int filmnr = Integer.parseInt(getText("film"));

		boolean[][] forestilling = saler[salnr][filmnr];
		
		visReservasjoner(forestilling);
		
		System.out.println("Angi rad i tekstvinduet...");
		int radnr = Integer.parseInt(getText("rad"));
		
		System.out.println("Angi sete i tekstvinduet...");
		int setenr = Integer.parseInt(getText("sete"));
	
		forestilling[radnr][setenr] = true;
		
		visReservasjoner(forestilling);
	}

}
