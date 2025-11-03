package no.hvl.dat100;

public class PlukkSortering {
	
	public static void plukksortering(int[] tab){
		for (int i = 0; i < tab.length; i++) {
			// Finn posisjon for minste element i usortert del
			int minstePos = i;
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[j] < tab[minstePos]) {
					minstePos = j;
				}
			}
			
			// byte om minst i usortert del med første i usortert del
			int tmp = tab[i];
			tab[i] = tab[minstePos];
			tab[minstePos] = tmp;
		}
	}

	public static void skrivUt(int[] tab) {
		for (int e : tab) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {7, 1, 9, 5, 3, 13};
		skrivUt(a);
		plukksortering(a);
		skrivUt(a);

	}

}
