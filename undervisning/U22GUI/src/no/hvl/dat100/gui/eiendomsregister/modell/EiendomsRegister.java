package no.hvl.dat100.gui.eiendomsregister.modell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

/**
 * Hovedklasse for eiendomsregister.
 * 
 * @author Lars Kristensen
 * @version 1.0
 */
public class EiendomsRegister {

	private String kommune;
	private HashMap<String, Eiendom> eiendommer;

	/**
	 * Konstruer og initialiser eiendomsregister.
	 * 
	 * @param kommune
	 *            kommune for register
	 */
	public EiendomsRegister(String kommune) {
		this.kommune = kommune;
		eiendommer = new HashMap<String, Eiendom>();
	}

	/**
	 * Hent kommune for register.
	 * 
	 * @return kommune
	 */
	public String getKommune() {
		return this.kommune;
	}

	/**
	 * Hent eiendommer for register.
	 * 
	 * @return eiendommer
	 */
	public Collection<Eiendom> getEiendommer() {
		return eiendommer.values();
	}

	// gns og bns blir brukt som nøkkel (key) i HashMap
	private String key(int gns, int bns) {
		return gns + " " + bns;
	}

	/**
	 * Registrer eiendom i register.
	 * 
	 * @param nyeiendom
	 *            eiendom som skal registreres
	 */
	public void registrerEiendom(Eiendom nyeiendom) {
		int gns = nyeiendom.getGns();
		int bns = nyeiendom.getBns();

		eiendommer.put(key(gns, bns), nyeiendom);
	}

	/**
	 * Finn eier i eiendomsregister.
	 * 
	 * @param fodselsnummer
	 *            fødselsnummer på eier
	 * @return eier (null hvis eier ikke finnes)
	 */
	public Eier finnEier(int fodselsnummer) {

		// TODO potensjale for effektivitetsforbedring her
		Eier eier = null;
		boolean funnet = false;

		// iterator for eiendommer
		Iterator<Eiendom> eiendomit = eiendommer.values().iterator();

		while (!funnet && eiendomit.hasNext()) {

			// sjekk eiere i neste eiendom
			Eiendom eiendom = eiendomit.next();
			ArrayList<Eier> eiere = eiendom.getEiere();

			Iterator<Eier> eierit = eiere.iterator();
			
			while (!funnet & eierit.hasNext()) {

				Eier eneier = eierit.next();

				if (eneier.getFodselsnummer() == fodselsnummer) {
					funnet = true;
					eier = eneier;
				}
			}
		}
		return eier;
	}

	/**
	 * Registrer (legg til) eier på en eiendom.
	 * 
	 * @param eier
	 *            eier som skal registreres på eiendom
	 * @param gns
	 *            gårdsnummer for eiendom
	 * @param bns
	 *            bruksnummer for eiendom
	 */
	public void registrerEier(Eier eier, int gns, int bns) {

		String k = key(gns,bns);
		
		Eiendom eiendom = eiendommer.get(k);

		eiendom.registrerEier(eier);
	}

	/**
	 * Hent eiendom i register.
	 * 
	 * @param gns
	 *            Gårdsnummer
	 * @param bns
	 *            Bruksnummer
	 * @return eiendom i register (null ellers)
	 */
	public Eiendom finnEiendom(int gns, int bns) {
		return eiendommer.get(key(gns, bns));
	}
	
	public void slettEiendom(int gns, int bns) {
		String key = key(gns,bns);
		
		eiendommer.remove(key);
		
	}
}
