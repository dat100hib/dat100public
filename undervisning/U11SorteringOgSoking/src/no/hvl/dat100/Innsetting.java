package no.hvl.dat100;

import java.util.Arrays;

public class Innsetting {
	public static void skrivUt(int[] tab) {
		for (int e : tab) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	// 0 6 9  11 
	public static void setInnSortert(int[] tab, int tal) {
		int pos = Arrays.binarySearch(tab, tal);
		if (pos < 0) {
			pos = -pos - 1;
		}
		pos--;
		
		for (int i = 0; i < pos; i++) {
			tab[i] = tab[i + 1];
		}
	
		tab[pos] = tal;
	}
	
	public static void main(String[] args) {
		int[] hTab = {0, 5, 9, 11, 21};
		skrivUt(hTab);
		setInnSortert(hTab, 9);
		skrivUt(hTab);
	}
}
