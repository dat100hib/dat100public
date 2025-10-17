package no.hvl.dat100.tabeller;

public class TabellLikhet {

	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		
		System.out.println("]");
	}
	
	public static int[] kopier(int[] tabell) {
		
		int[] nytabell = new int[tabell.length];
		
		for (int pos = 0; pos<tabell.length; pos++) {
			nytabell[pos] = tabell[pos];
		}
		
		return nytabell;
	}
	
	public static void oppdater(int[] tabell, int verdi, int pos) {
		tabell[pos] = verdi;
	}
	
	public static void main(String[] args) {
 
		int[] itab = {7,17,20,4,8,12};
				
		skrivUt(itab);
		System.out.println(itab);
		
		oppdater(itab,19,2);
		
		skrivUt(itab);
		System.out.println(itab);
		
		System.out.println(itab == itab);
		System.out.println(itab.equals(itab));
		
		int[] kopitab = kopier(itab);
		
		System.out.println(kopitab);
		skrivUt(kopitab);
		
		System.out.println(kopitab == itab);
		System.out.println(itab.equals(kopitab));
		
	}

}
