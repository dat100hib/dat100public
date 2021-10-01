package no.hvl.dat100.pass;

import java.util.Objects;

public class Pass {
	
	private static int passteller = 1; // 
	
	private int nummer;
	private String navn;
	private String personnr;
	private Status status;    // steg 1 - introdusere oppramstype
	
	private double hogde;

	public Pass(String navn, String personnr, Status status, double hogde) {

		this.nummer = passteller;
		this.navn = navn;
		this.personnr = personnr;
		this.status = status;
		this.hogde = hogde;
		
		passteller++;
	}

	public Pass(int nummer, String navn, String personnr, Status status, double hogde) {

		this.nummer = nummer;
		this.navn = navn;
		this.personnr = personnr;
		this.status = status;
		this.hogde = hogde;

	}
	
	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public double getHogde() {
		return hogde;
	}

	public void setHogde(double hogde) {
		this.hogde = hogde;
	}

	// steg 2 overskjøre toString-metoden
	@Override
	public String toString() {
		return "Pass [nummer=" + nummer + ", navn=" + navn + ", personnr=" + personnr + ", status=" + status
				+ ", hogde=" + hogde + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hogde, navn, nummer, personnr, status);
	}

	@Override
	public boolean equals(Object obj) {
		
		return (this.nummer == ((Pass)obj).getNummer());
	}

	

}
