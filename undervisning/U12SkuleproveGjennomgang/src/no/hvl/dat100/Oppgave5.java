package no.hvl.dat100;

public class Oppgave5 {

	public static double arealSirkel(double radius) {
		return Math.PI * radius * radius; // Math.pow(radius, 2)
	}
	
	public static void main(String[] args) {
		double areal = arealSirkel(1.5);
		System.out.println("Areal: " + areal);

	}
}
