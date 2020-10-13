package no.hvl.dat100.varelager;

public class Vare {
	private int nr;
	private String navn;
	private double pris;
	private int antall;
	
	public Vare(int nr, String navn, double pris, int antall) {
		this.nr = nr;
		this.navn = navn;
		this.pris = pris;
		this.antall = antall;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}
	
	public String toString() {
		return nr + ";" + navn + ";" + pris + ";" + antall;
	}
}
