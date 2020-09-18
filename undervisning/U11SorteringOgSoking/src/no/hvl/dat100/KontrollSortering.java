package no.hvl.dat100;

public class KontrollSortering {

	/*
	 * Metode for å kontrollere om heiltalstabell er sortert. 
	 * Metoden returnerer true om tabellen er sortert og 
	 * false elles.
	 */

	public static boolean erSortert(int[] tab) {
		
		int j = 1;
		boolean sortert = true;
		
		// Alternativ: for (int i = 0; (i < tab.length - 1) && sortert; i++){
		while (sortert && j < tab.length - 1) {
			if (tab[j] > tab[j + 1]) {
				sortert = false;
			}
			j++;
		}
		return sortert;
	}

	public static void main(String[] args) {
		int[] sortertTabell = { 1, 7, 11, 21 };
		int[] usortertTabell = { 1, 11, 21, 7 };  

		System.out.println(erSortert(sortertTabell));
		System.out.println(erSortert(usortertTabell));
	}

}
