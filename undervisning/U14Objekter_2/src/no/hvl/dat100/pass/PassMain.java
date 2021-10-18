package no.hvl.dat100.pass;

public class PassMain {


	// Metode for � telje antall som er over i viss h�gde
	
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
		
		Pass olepass = new Pass("Ole Olsen", "06079112340", Status.GYLDIG, 1.84);
		Pass olinepass = new Pass("Oline Olsen", "06079112341", Status.GYLDIG, 1.94);
		
		System.out.println(olepass.toString());
		
		olepass.setHogde(1.75);
		
		System.out.println(olepass.toString());
		
		System.out.println(olinepass.toString());
	}
}

