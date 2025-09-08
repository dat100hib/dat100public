package no.hvl.dat100;

public class Parametre {

	public static void main(String[] args) {
		
		double[] obs = {1.2, -3.5, 4.8, 7.9, 41.2, 10.1};
		
		skrivUt(obs);
		
		nullstillNegative(obs);
		
		skrivUt(obs);
		
		double[] kopiobs = kopier(obs);
		
		skrivUt(obs);
		
		double[] diffobs = diff(obs);
		
		skrivUt(diffobs);
		
	}

	// TODO: skrivUt metode
	private static void skrivUt(double[] tab) {
		
		System.out.print("[ ");
		for (int i = 0;i<tab.length;i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println("]");
		
	}
	
	// TODO: nullstill negative metode
	private static void nullstillNegative(double[] tab) {
		
		for (int i = 0; i<tab.length; i++) {
			
			tab[i] = Math.max(tab[i], 0);
		}
	}
	
	// TODO: kopier metode
	private static double[] kopier(double[] tab) {
		
		double[] kopitab = new double[tab.length];
		
		for (int i = 0; i<tab.length; i++) {
			
			kopitab[i] = tab[i];
		}
		
		return kopitab;
	}
	
	// TODO: diff metode
	private static double[] diff(double[] tab) {
	
		double[] difftab = new double[tab.length-1];
		
		for (int pos = 0; pos<difftab.length; pos++) {
			
			difftab[pos] = tab[pos+1] - tab[pos];
		}
		
		return difftab;
	}
}
