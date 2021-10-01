package no.hvl.dat100.pass;

import java.util.Arrays;

public class PassSamling {

	private Pass[] tabell;
	
	private int antall;
	
	public PassSamling() {
		antall = 0;
		tabell = new Pass[100];
	}
	
	public boolean leggTil(Pass pass) {
		
		boolean sattinn = false;
		
		if (antall < tabell.length) {
			tabell[antall] = pass;
			antall++;
			sattinn = true;
		}
		
		return sattinn;
	}

	@Override
	public String toString() {
		return "PassSamling [tabell=" + Arrays.toString(tabell) + ", antall=" + antall + "]";
	}
	
	public void print() {
		
		for (int i = 0; i<antall; i++) {
			System.out.println(tabell[i].toString());
		}
	}
	
}
