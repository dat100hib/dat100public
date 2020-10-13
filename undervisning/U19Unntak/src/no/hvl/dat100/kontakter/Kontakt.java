package no.hvl.dat100.kontakter;

public class Kontakt {

	private String navn;
	private int nummer;
	
	public Kontakt() { }
	
	public Kontakt(String navn, int nummer) {
		this.navn = navn;
		this.nummer = nummer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	public String toString() {
		return 
				"Navn   : " + navn + "\n" + 
				"Nummer : " + nummer;
	}
}
