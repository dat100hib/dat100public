package no.hvl.dat100.gui.eiendomsregister.modell;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Basisklasse for representasjon av eiendommer.
 * 
 * @author Lars Kristensen
 * @version 1.0
 */

public abstract class Eiendom {

	private int gns;
	private int bns;

	private ArrayList<Eier> eiere;

	private static int MAX_NABOER = 4;
	private Eiendom[] naboer;

	/**
	 * Konstruer Eiendoms objekt.
	 * 
	 * @param gns
	 *            Gårdsnummer
	 * @param bns
	 *            Bruksnummer
	 */
	public Eiendom(int gns, int bns) {
		this.gns = gns;
		this.bns = bns;
		naboer = new Eiendom[MAX_NABOER];
		eiere = new ArrayList<Eier>();
	}

	/**
	 * Hent gårdsnummer for eiendom.
	 * 
	 * @return Gårdsnummer
	 */
	public int getGns() {
		return gns;
	}

	/**
	 * Hent bruksnummer for eiendom.
	 * 
	 * @return Bruksnummer
	 */
	public int getBns() {
		return bns;
	}

	/**
	 * Register eiere på eiendommen.
	 * 
	 * @param eiere
	 *            Eiere som skal registreres som eiere
	 */
	public void setEiere(ArrayList<Eier> eiere) {
		this.eiere = eiere;
	}

	/**
	 * Register en ny eier på eiendommen (legges til).
	 * 
	 * @param nyeier
	 *            Eier som skal registreres på eiendom
	 */
	public void registrerEier(Eier nyeier) {
		eiere.add(nyeier);
	}

	private boolean erLik(Eiendom e1, Eiendom e2) {
		
		boolean lik = false;

		if ((e1 != null) && (e2 != null)) {
			lik = ((e1.gns == e2.gns) && (e1.bns == e2.bns));
		}

		return lik;
	}

	private boolean erNabo(Eiendom eiendom) {
		boolean finnes = false;

		// sjekk om nabo eiendom finnes allerede
		int i = 0;
		while (!finnes && i < MAX_NABOER) {

			Eiendom naboeiendom = naboer[i];
			finnes = erLik(eiendom, naboeiendom);

			i++;
		}

		return finnes;
	}

	private boolean settInnNabo(Eiendom eiendom) {
		
		boolean sattinn = false;

		int i = 0;
		while ((!sattinn) && i < MAX_NABOER) {
			if (naboer[i] == null) {
				naboer[i] = eiendom;
				sattinn = true;
			}
			i++;
		}
		return sattinn;
	}

	/**
	 * Registrer en eiendom som nabo.
	 * 
	 * @param eiendom
	 *            eiendom som skal registreres som eiendom
	 * @return finnes eller blev nabo registret (max 4 naboer per eiendom)
	 */
	public boolean registrerNabo(Eiendom eiendom) {
		
		boolean finnes = false;
		boolean sattinn = false;

		finnes = erNabo(eiendom);

		if (!finnes) {
			sattinn = settInnNabo(eiendom);
		}

		return (finnes || sattinn);
	}

	/**
	 * Hent eiere for eiendommen.
	 * 
	 * @return listen av eiere på eiendommen
	 */
	public ArrayList<Eier> getEiere() {
		return eiere;
	}

	/**
	 * Streng representasjon av eiendom.
	 * 
	 * @return streng representasjon
	 */
	@Override
	public String toString() {
		return gns + " " + bns + "\n" + eieretoString() + naboertoString();
	}

	/**
	 * Streng representasjon av eiere for eiendom.
	 * 
	 * @return streng representasjon
	 */
	private String eieretoString() {

		String text = eiere.size() + "\n";

		// iterator for eiere
		Iterator<Eier> it = eiere.iterator();

		while (it.hasNext()) {
			Eier eier = it.next();
			text = text + eier.toString();
		}

		return text;
	}

	/**
	 * Streng representasjon av naboer for eiendom.
	 * 
	 * @return streng representasjon
	 */
	private String naboertoString() {
		int i = 0;
		String text = "";
		int antall = 0;

		while (i < naboer.length) {
			Eiendom nabo = naboer[i];
			if (nabo != null) {
				text = text + nabo.gns + " " + nabo.bns;
				antall++;
			}
			i++;
		}

		text = antall + " " + text;

		return text;
	}
}
