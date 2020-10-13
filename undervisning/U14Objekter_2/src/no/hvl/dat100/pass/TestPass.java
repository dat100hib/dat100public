package no.hvl.dat100.pass;

public class TestPass {

	// Metode for å telje antall som er over i viss høgde
	
	public static int antallOver(Pass[] tab, double grense) {
		int antal = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getHogde() > grense) {
				antal++;
			}
		}
		return antal;
	}
	public static void main(String[] args) {
		Pass p = new Pass("Ole", "123", 1.80);
//		System.out.println(p.toString());
//		System.out.println(p);
		
		Pass[] passTab = new Pass[4];
		passTab[0] = new Pass("Kari", "234", 1.70);
		passTab[1] = p;
		passTab[2] = new Pass("Marianne", "235", 1.75);
		passTab[3] = new Pass("Per", "134", 1.72);
		
		for (int i = 0; i < passTab.length; i++) {
			System.out.println(passTab[i].toString());
		}
		
		double grense = 1.50;
		int antal = antallOver(passTab, grense);
		
		System.out.println("Antal over " + grense + ": " + antal);
	}

}
