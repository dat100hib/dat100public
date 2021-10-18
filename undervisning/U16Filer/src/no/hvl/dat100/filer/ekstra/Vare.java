package no.hvl.dat100.filer.ekstra;

import java.io.Serializable;

public class Vare implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String navn;
	private double pris;
	
	public Vare(String navn, double pris) {
		super();
		this.navn = navn;
		this.pris = pris;
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
	
	
	
	
}
