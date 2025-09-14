package no.hvl.dat100.eksempel;

public class Sensorer {

	public static void main(String[] args) {

		int[] tider = { 1,3,4,7,9,10};

		skrivUt2(tider);

		int[] segtider = beregnTid(tider);

		skrivUt2(segtider);

	}

	public static void skrivUt1(int[] tabell) {

		for (int i = 0; i <= tabell.length; i++) {

			System.out.println("Indeks " + i + " inneholder " + tabell[i]);

		}
	}
	
	public static void skrivUt2(int[] tabell) {

		System.out.print("[");

		for (int t : tabell) {

			System.out.print(t + " ");
		}

		System.out.print("]");
	}
	
	public static int[] beregnTid(int[] passtider) {

		int[] segtider = new int[passtider.length-1];

		for (int i = 0; i<segtider.length; i++) {

			segtider[i] = passtider[i+1] - passtider[i];
		}

		return segtider;
	}
	
	public static boolean bruktMer(int[] tabell, int tidsgrense) {

		return false;
	}
}

