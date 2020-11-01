package no.hvl.dat100.gui.eiendomsregister.kontroll;

import java.util.ArrayList;
import java.util.Collection;

import no.hvl.dat100.gui.eiendomsregister.lagring.Lagring;
import no.hvl.dat100.gui.eiendomsregister.modell.Eiendom;
import no.hvl.dat100.gui.eiendomsregister.modell.EiendomsRegister;
import no.hvl.dat100.gui.eiendomsregister.modell.Eier;
import no.hvl.dat100.gui.eiendomsregister.modell.KontaktAdresse;
import no.hvl.dat100.gui.eiendomsregister.modell.NeringsEiendom;
import no.hvl.dat100.gui.eiendomsregister.modell.UtleieEiendom;



// implementerer brukstilfeller for register

public class Kontroll {

	public enum StatusCode {
		OK, FEIL, EIER_IKKEFUNNET, EIENDOM_FINNES, EIENDOM_IKKEFUNNET
	}

	private EiendomsRegister register;
	
	public Kontroll() {
		super();
	}
	
	// opprett kontroller og sett register for kontroller
	public Kontroll(EiendomsRegister register) {
		this.register = register;
	}

	// opprett nytt register
	public Kontroll(String kommune) {
			this.register = new EiendomsRegister(kommune);
	}
		
	// opprett ny eiendom om den ikke allerede finnes
	public StatusCode nyNeringsEiendom(int gns, int bns,int orgnr) {

		StatusCode status = StatusCode.OK;

		Eiendom eiendom = register.finnEiendom(gns, bns);

		if (eiendom == null) {
			eiendom = new NeringsEiendom(gns, bns, orgnr);
			register.registrerEiendom(eiendom);
		} else {
			status = StatusCode.EIENDOM_FINNES;
		}
		
		return status;
	}

	// opprett ny utleieeiendom om den ikke allerede finnes
	public StatusCode nyUtleieEiendom(int gns, int bns, int leier, int pris) {

		StatusCode status = StatusCode.OK;

		Eiendom eiendom = register.finnEiendom(gns, bns);

		if (eiendom == null) {
			eiendom = new UtleieEiendom(gns, bns, leier, pris);
			register.registrerEiendom(eiendom);
		} else
			status = StatusCode.EIENDOM_FINNES;

		return status;

	}

	// opprett ny eier og knytt til Eiendom
	public StatusCode nyEier(String navn, int fodselsnummer,
			KontaktAdresse adresse, int gns, int bns) {

		StatusCode status = StatusCode.OK;

		Eiendom eiendom = register.finnEiendom(gns, bns);

		if (eiendom != null) {
			Eier nyeier = new Eier(navn, fodselsnummer, adresse);
			eiendom.registrerEier(nyeier);
		} else
			status = StatusCode.EIENDOM_IKKEFUNNET;

		return status;
	}

	// registrer en ny eier for en eiendom
	public StatusCode nyEierEiendom(int fodselsnummer, int gns, int bns) {

		StatusCode status = StatusCode.OK;

		Eier eier = register.finnEier(fodselsnummer);
		Eiendom eiendom = register.finnEiendom(gns, bns);

		if ((eier != null) && (eiendom != null)) {
			register.registrerEier(eier, gns, bns);
		} else
			status = StatusCode.FEIL;

		return status;
	}

	// registrer to eiendommer som naboer
	public StatusCode registrerNabo(int gns, int bns, int gnsnabo, int bnsnabo) {

		StatusCode status = StatusCode.OK;

		Eiendom eiendom1 = register.finnEiendom(gns, bns);
		Eiendom eiendom2 = register.finnEiendom(gnsnabo, bnsnabo);

		if ((eiendom1 != null) && (eiendom2 != null)) {
			// nabo relasjon er symmetrisk
			eiendom1.registrerNabo(eiendom2); // TODO: ingen feilsjekk her for max 4
			eiendom2.registrerNabo(eiendom1);
		} else
			status = StatusCode.EIENDOM_IKKEFUNNET;

		return status;
	}

	// finn eiere på en given eiendom
	public ArrayList<Eier> finnEiere(int gns, int bns) {

		Eiendom eiendom = register.finnEiendom(gns, bns);

		if (eiendom != null) {
			return eiendom.getEiere();

		}

		return null;
	}

	// finn leier fodselsnummer for eiendom
	public int finnLeier(int gns, int bns) {

		int leier = -1; // -1 indikerer feil: eiendom finnes ikke, eller ikke utleieeiendom

		Eiendom eiendom = register.finnEiendom(gns, bns);

		if (eiendom != null) {
			if (eiendom instanceof UtleieEiendom) {
				leier = ((UtleieEiendom) eiendom).getLeier();
			}
		}

		return leier;
	}
	
	public void nyttRegister(String kommune) {
		register = new EiendomsRegister(kommune);
	}
	
	public void importerRegister(String filnavn) {
		register = Lagring.les(filnavn);
	}
	
	public void eksporterRegister(String filnavn) {
		Lagring.skriv(register, filnavn);
	}
	
	public Collection<Eiendom> getEiendommer() {
		if (register != null) {
			return register.getEiendommer();
		}
		return null;
	}
	
	public Eiendom finnEiendom(int gns, int bns) {
		Eiendom e = register.finnEiendom(gns,bns);
		
		return e;
	}
	
	public void slettEiendom(int gns, int bns) {
		if (register != null) {
			register.slettEiendom(gns, bns);
		}
	}
}
