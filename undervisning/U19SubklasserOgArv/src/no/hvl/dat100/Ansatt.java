package no.hvl.dat100;

/*
 *  Klasse for representasjon av ansatt-data.
 */
public class Ansatt {

	protected int ansNr;
	protected String fornavn;
	protected String etternavn;
	protected double lønn;

	public Ansatt(int ansNr, String fornavn, String etternavn, double lønn) {
		this.ansNr = ansNr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.lønn = lønn;
	}

	public int getAnsNr() {
		return ansNr;
	}

	public void setAnsNr(int ansNr) {
		this.ansNr = ansNr;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public double getLønn() {
		return lønn;
	}

	public void setLønn(double lønn) {
		this.lønn = lønn;
	}

	public String toString() {
		return ansNr + ": " + fornavn + " " + etternavn + " - lønn kr. " + lønn;
	}

}


