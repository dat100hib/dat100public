package no.hvl.dat100;

public class Oppgave4 {
	// Hjelp frå oppgåve
	public static double maks(double x, double y) {
		double m = x;
		if (y > m) {
			m = y;
		}
		return m;
	}

	// Finne minste av tre heltall
	public static int min(int a, int b, int c) {
		int minste = a;
		
		if (b < minste) {
			minste = b;
		}
		
		if (c < minste) {
			minste = c;
		}
		
		return minste;
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		int c = 1;
		
		int minste = min(a, b, c);
		System.out.println(minste);
	}
}
