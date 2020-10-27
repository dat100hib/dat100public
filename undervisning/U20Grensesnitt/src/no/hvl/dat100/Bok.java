package no.hvl.dat100;

public class Bok implements Sammenlignbar, Element {
	private String isbn;
	private String tittel;
	
	public Bok(String isbn, String tittel) {
		this.isbn = isbn;
		this.tittel = tittel;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	
	@Override
	public String nokkel() {
		return isbn;
	}
	
	@Override
	public boolean erMindreEnn(Object obj) {
		Bok b = (Bok) obj;
		return this.isbn.compareTo(b.isbn) < 0;
	}
	
	@Override
	public String toString() {
		return isbn + ": " + tittel;
	}
}
