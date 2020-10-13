package no.hvl.dat100.pass;

public class Pass {
	private String navn;
	private String personnr;
	private double hogde;
	
	public Pass(String navn, String personnr, double hogde) {
		this.navn = navn;
		this.personnr = personnr;
		this.hogde = hogde;
	}

	
	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public String getPersonnr() {
		return personnr;
	}


	public void setPersonnr(String personnr) {
		this.personnr = personnr;
	}


	public double getHogde() {
		return hogde;
	}


	public void setHogde(double hogde) {
		this.hogde = hogde;
	}


	public String toString() {
		return navn + ", " + personnr + ", " + hogde + " m";
	}
}
