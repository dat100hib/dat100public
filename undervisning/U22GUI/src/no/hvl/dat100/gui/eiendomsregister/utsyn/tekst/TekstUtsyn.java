package no.hvl.dat100.gui.eiendomsregister.utsyn.tekst;

import java.util.ArrayList;

import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll;
import no.hvl.dat100.gui.eiendomsregister.kontroll.Kontroll.StatusCode;
import no.hvl.dat100.gui.eiendomsregister.modell.Eier;
import no.hvl.dat100.gui.eiendomsregister.modell.KontaktAdresse;


public class TekstUtsyn  {

	private Kontroll kontroll;

	final private static int NYNERINGSEIENDOM = 1;
	final private static int NYUTLEIEEIENDOM = 2;

	final private static int NYEIER = 3;
	final private static int NYEIEREIENDOM = 4;

	final private static int REGISTRERNABO = 5;
	final private static int FINNEIERE= 6;
	final private static int FINNLEIER = 7;
	
	final private static String SEPERATOR = "------------------------------------";
		
	public TekstUtsyn() {
		
	}
	
	public TekstUtsyn(Kontroll controller) {
		this.kontroll = controller;
	}

	public void setKontroll(Kontroll kontroll) {
		this.kontroll = kontroll;
	}
	
	public void start() {

		boolean avslutt = false;

		do {
			System.out.println(SEPERATOR);
			System.out.println("Administrasjon av eiendommer");
			System.out.println(SEPERATOR);
			System.out.println("(1) - Ny næringseiendom");
			System.out.println("(2) - Ny utleieeiendom");
			System.out.println("(3) - Ny eier");
			System.out.println("(4) - Ny eier for eiendom");
			System.out.println("(5) - Registrer naboeiendom");
			System.out.println("(6) - Finn eiere for eiendom");
			System.out.println("(7) - Finn leier for utleieeiendom");
			System.out.println("Andre for avslutt");
			
			int valg = Leser.lesInt("Inntast valg:");

			switch (valg) {
			case NYNERINGSEIENDOM:
				nyNeringsEiendom();
				break;
			case NYUTLEIEEIENDOM:
				nyUtleieEiendom();
				break;
			case NYEIER:
				nyEier();
				break;
			case NYEIEREIENDOM:
				nyEierEiendom();
				break;
			case REGISTRERNABO:
				registrerNabo();
				break;
			case FINNEIERE:
				finnEiere();
				break;
			case FINNLEIER:
				finnLeier();
				break;
			default:
				avslutt = true;
			}

		} while (!avslutt);

	}

	public void nyNeringsEiendom() {

		System.out.println("nyNæringsEiendom");
		
		int gns = Leser.lesInt("Gårdsnummer : ");
		int bns = Leser.lesInt("Bruksnummer : ");
		int orgnr = Leser.lesInt("Organisations nummer: ");
		
		StatusCode status = kontroll.nyNeringsEiendom(gns, bns, orgnr);
		
		System.out.println(status.toString()); 
	}

	public void nyUtleieEiendom() {
		System.out.println("nyUtleieEiendom");
		
		int gns = Leser.lesInt("Gårdsnummer : ");
		int bns = Leser.lesInt("Bruksnummer : ");
		
		int leier = Leser.lesInt("Leier fodselsnummer: ");
		int pris = Leser.lesInt("Leiepris: ");
		
		StatusCode status = kontroll.nyUtleieEiendom(gns, bns, leier, pris);
		
		System.out.println(status.toString()); 
	}

	public void nyEier() {

		System.out.println("nyEier");
		
		String navn = Leser.lesStreng("navn: ");
		int fodselsnummer = Leser.lesInt("fodselsnummer: ");

		String vei = Leser.lesStreng("vei: ");
		int nummer = Leser.lesInt("nummer: ");
		int postnummer = Leser.lesInt("postnummer: ");
		
		String by = Leser.lesStreng("by: ");
		String land = Leser.lesStreng("land: ");
		
		int gns = Leser.lesInt("Gårdsnummer : ");
		int bns = Leser.lesInt("Bruksnummer : ");
		
		KontaktAdresse adresse = new KontaktAdresse(vei,nummer,postnummer,by,land);
		
		StatusCode status = kontroll.nyEier(navn, fodselsnummer, adresse, gns, bns);
		
		System.out.println(status.toString()); 
	}
	
	public void nyEierEiendom() {

		System.out.println("nyEierEiendom");
		
		int fodselsnummer = Leser.lesInt("eier fodselsnummer: ");
		
		int gns = Leser.lesInt("Gårdsnummer : ");
		int bns = Leser.lesInt("Bruksnummer : ");
		
		StatusCode status = kontroll.nyEierEiendom(fodselsnummer, gns, bns);
		
		System.out.println(status.toString()); 
	}

	public void registrerNabo() {

		System.out.println("registrerNabo");
		
		int gns1 = Leser.lesInt("Gårdsnummer : ");
		int bns1 = Leser.lesInt("Bruksnummer : ");
		
		int gns2 = Leser.lesInt("Gårdsnummer : ");
		int bns2 = Leser.lesInt("Bruksnummer : ");
		
		StatusCode status = kontroll.registrerNabo(gns1, bns1, gns2, bns2);
		
		System.out.println(status.toString()); 
		
	}

	private void skrivEier(Eier eier) {
		System.out.println(eier.getNavn()); // simpel representasjon av eier i dette utsyn
	}
	
	public void finnEiere() {

		System.out.println("finnEiere");
		
		int gns = Leser.lesInt("Gårdsnummer : ");
		int bns = Leser.lesInt("Bruksnummer : ");
		
		ArrayList<Eier> eiere = kontroll.finnEiere(gns, bns);
		
		if (eiere != null) {
			for (int i = 0; i<eiere.size(); i++)
				skrivEier(eiere.get(i));
		} else
			System.out.println("finnEiere feilet");
	}

	public void finnLeier() {
		
		System.out.println("finnEiere");
		
		int gns = Leser.lesInt("Gårdsnummer : ");
		int bns = Leser.lesInt("Bruksnummer : ");
		
		int fodselsnummer = kontroll.finnLeier(gns, bns);
		
		if (fodselsnummer >= 0)
			System.out.println("Leier fødselsnummer: " + fodselsnummer);
		else
			System.out.println("finnLeier feilet");
	}
}
