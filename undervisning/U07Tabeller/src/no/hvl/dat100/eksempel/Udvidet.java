package no.hvl.dat100.eksempel;

public class Udvidet {

	public static void main(String[] args) {
		
		int [] tab = {1,2,3,5,6};
		
		skrivUt(tab);
		
		inkrementer(tab);
		
		skrivUt(tab);
	}

	public static void skrivUt(int[] tabell) {
		
		for (int x : tabell) {
			System.out.print(x + "");
		}
		
		System.out.println();
	}
	
	public static void inkrementer(int[] tabell) {
		
		for (int x : tabell) {
			
			x = x + 1;
		}
	}
}
