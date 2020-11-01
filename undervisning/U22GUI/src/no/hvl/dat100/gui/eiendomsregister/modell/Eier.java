package no.hvl.dat100.gui.eiendomsregister.modell;

/**
 * Klasse for representasjon av eiere av eiendommer.
 * @author Lars Kristensen
 * @version 1.0
 */

public class Eier {

	private String navn;
	private int fodselsnummer;
	
	private KontaktAdresse adresse;

	/**
	 * Konstruer eier objekt
	 * @param navn - navn på eier
	 * @param fodselsnummer - fødselsnummer på eier
	 * @param adresse - kontaktadresse
	 */
	public Eier(String navn, int fodselsnummer, KontaktAdresse adresse) {
		this.navn = navn;
		this.fodselsnummer = fodselsnummer;
		this.adresse = adresse;
	}

	/**
	 * Hent kontaktadresse på eier.
	 * 
	 * @return kontraktadresse for eier
	 */
	public KontaktAdresse getAdresse() {
		return adresse;
	}
	
	/**
	 * Sett kontaktadresse for eier.
	 * 
	 * @param adresse ny kontaktadresse for eier (erstatter eksisterende)
	 */
	public void setAdresse(KontaktAdresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Hent navn.
	 * 
	 * @return - navn på eier
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * Hent fødselsnummer.
	 * 
	 * @return fødselsnummer for eier
	 */
	public int getFodselsnummer() {
		return fodselsnummer;
	}
	
	/**
	 * Streng representasjon av eier.
	 * 
	 * @return Streng representasjon
	 */
	@Override
	public String toString () {
		return navn + "\n" + fodselsnummer + "\n" + adresse.toString();
	}
}
