package no.hvl.dat100;

/*
 *  Klasse for representasjon av et antall
 *  Ansatt-objekt. Klassen har metoder for
 *  søk, innsetting og sletting.
 *
 */
public class AnsattSamling {
	private Ansatt[] tabell;
	private int nesteLedige;

	public AnsattSamling(int antall) {
		tabell = new Ansatt[antall];
		nesteLedige = 0;
	}

	// Finner ansatt, gitt ansattnummer.
	// Returnerer null hvis objektet ikke finnes.

	public Ansatt finn(int ansNr) {
		int pos = finnPos(ansNr);
		if (pos >= 0) {
			return tabell[pos];
		} else {
			return null;
		}
	}

	// Setter inn en ansatt bakerst. Returnerer false
	// hvis en ansatt med samme ansattnummer finnes,
	// eller det ikke er ledig plass, og true ellers.

	public boolean settInn(Ansatt a) {
		boolean ny = finnPos(a.getAnsNr()) == -1;

		if (ny && nesteLedige < tabell.length) {
			tabell[nesteLedige] = a;
			nesteLedige++;
			return true;
		} else {
			return false;
		}
	}

	// Sletter en ansatt, gitt ansattnummer. Returnerer
	// false hvis objektet ikke finnes, true ellers.
	public boolean slett(int ansNr) {
		int pos = finnPos(ansNr);
		if (pos >= 0) {
			nesteLedige--;
			tabell[pos] = tabell[nesteLedige];
			tabell[nesteLedige] = null;
			return true;
		} else {
			return false;
		}
	}

	// Finner posisjonen til et Ansatt-objekt, gitt et
	// ansattnr. Leverer -1 hvis objektet ikke er der.

	private int finnPos(int ansNr) {
		boolean funnet = false;
		int pos = 0;

		while (pos < nesteLedige && !funnet) {
			if (tabell[pos].getAnsNr() == ansNr) {
				funnet = true;
			} else {
				pos++;
			}
		}

		if (funnet) {
			return pos;
		} else {
			return -1; // betyr ant ansNr ikkje finst i tabell
		}
	}
	
	public String toString() {
		String svar = "";
		for (int i = 0; i < nesteLedige; i++) {
			svar += tabell[i].toString() + "\n";
		}
		
		return svar;
	}

}