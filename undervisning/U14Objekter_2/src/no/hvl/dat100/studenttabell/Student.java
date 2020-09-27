package no.hvl.dat100.studenttabell;

public class Student {

	private int studentnr;
	private String fornavn;
	private String etternavn;

	public Student() {
		// Alle objektvariabler får standardverdi
	}

	public Student(int studentnr, String fornavn, String etternavn) {
		this.studentnr = studentnr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}

	public Student(String fornavn, String etternavn) {
		this(0, fornavn, etternavn);
	}
	
	public int getStudentnr() {
		return studentnr;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setStudentnr(int studentnr) {
		this.studentnr = studentnr;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public void skrivUt() {
		System.out.println(studentnr + " " + fornavn + " " + etternavn);
	}
	
	public String toString() {
		return studentnr + " " + fornavn + " " + etternavn;
	}
}
