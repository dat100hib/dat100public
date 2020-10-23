package no.hvl.dat100;

public class Funksjonar extends Ansatt {
	private String funksjon;
	
	public Funksjonar(int nr, String fn, String en, double lonn, String funksjon) {
		super(nr, fn, en, lonn);
		this.funksjon = funksjon;
	}

	public String getFunksjon() {
		return funksjon;
	}

	public void setFunksjon(String funksjon) {
		this.funksjon = funksjon;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Funkjon: " + funksjon;
	}
}
