package no.hvl.dat100.gui.eiendomsregister.modell;

/**
 * Representasjon av utleieeiendommer.
 * @author Lars Kristensen
 * @version 1.0
 */

public class UtleieEiendom extends Eiendom {
	
	private int leierfodselsnummer;  
	private int leie;
	/**
	 * Konstruer utleieeiendom.
	 * @param gns G�rdsnummer
	 * @param bns Bruksnummer
	 * @param leierfodselsnummer f�dselsnummer p� leier
	 * @param leie leie per m�ned
	 */
	public UtleieEiendom(int gns, int bns, int leierfodselsnummer, int leie) {
		super(gns,bns);
		this.leierfodselsnummer = leierfodselsnummer;
		this.leie = leie;
	}
	
	/**
	 * Hent leier.
	 * @return leier for utleieeiendom
	 */
	public int getLeier() {
		return leierfodselsnummer;
	}
	
	
	public int getLeie() {
		return leie;
	}

	/**
	 * Streng representasjon av eiere for eiendom.
	 * 
	 * @return streng representasjon
	 */
	@Override
	public String toString() {
		return "UTLEIEEIENDOM" + "\n" + super.toString() + "\n" + leierfodselsnummer + "\n" + leie;
	}
}
