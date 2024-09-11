package no.hvl.dat100.eksempel;

public class Sensorer {

	public static void main(String[] args) {

		int[] tider = {1, 3, 4, 7, 9, 10};
		
		skrivUt2(tider);
		
		int[] segmenttider = beregnTid(tider);

		skrivUt2(segmenttider);
		
		System.out.println(bruktMer(segmenttider,2));
		
	}

	public static void skrivUt1(int[] tabell) {
	
		for (int i = 0; i<tabell.length;i++) {
			
			int t = tabell[i];
			
			System.out.println("Indeks:" + i + " inneholder " + t);
		}
	}
	
	public static void skrivUt2(int[] tabell) {
		
		System.out.print("[ ");
		
		for (int t : tabell) {
			System.out.print(t + " ");
		}
		
		System.out.println("] ");
	}
	
	public static int[] beregnTid(int[] passtider) {
		
		int antall = passtider.length-1;
		int[] segtider = new int[antall];
		
		for (int i = 0; i<segtider.length;i++) {
			segtider[i] = passtider[i+1] - passtider[i];
		}
		
		return segtider;
	}
	
	public static boolean bruktMer(int[] tabell, int tidsgrense) {
		
		boolean overtiden = false;
		
		int i = 0;
		
		while (!overtiden && i<tabell.length) {
			
			if (tabell[i] > tidsgrense) {
				overtiden = true;
			}
			
			i++;
		}
		
		return overtiden;
	}
}

