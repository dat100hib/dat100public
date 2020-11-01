package no.hvl.dat100.gui.eiendomsregister.lagring;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

import no.hvl.dat100.gui.eiendomsregister.modell.Eiendom;
import no.hvl.dat100.gui.eiendomsregister.modell.EiendomsRegister;
import no.hvl.dat100.gui.eiendomsregister.modell.Eier;
import no.hvl.dat100.gui.eiendomsregister.modell.KontaktAdresse;
import no.hvl.dat100.gui.eiendomsregister.modell.NeringsEiendom;
import no.hvl.dat100.gui.eiendomsregister.modell.UtleieEiendom;

public class Lagring {

	private static String NESTR = "NERINGSEIENDOM";
	private static String UESTR = "UTLEIEEIENDOM";

	public static boolean skriv(EiendomsRegister register, String filnavn) {

		boolean skrevet = true;
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(filnavn);

			String kommune = register.getKommune();

			writer.println(kommune);

			Collection<Eiendom> eiendommer = register.getEiendommer();

			writer.println(eiendommer.size());

			Iterator<Eiendom> eit = eiendommer.iterator();

			while (eit.hasNext()) {
				Eiendom e = eit.next();
				writer.println(e.toString());
			}

			writer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Feil ved skriving av register");
			skrevet = false;
		}

		return skrevet;
	}

	private static EiendomsRegister lesEiendommer(File file) throws FileNotFoundException {
		
		Scanner reader = new Scanner(file);

		String kommune = reader.next();
		EiendomsRegister register = new EiendomsRegister(kommune);

		int antall = reader.nextInt();

		for (int i = 1; i <= antall; i++) {
			Eiendom e = lesEiendom(reader);
			register.registrerEiendom(e);
		}

		reader.close();
		
		return register;
	}
	
	public static EiendomsRegister les(String filnavn) {

		EiendomsRegister register = null;

		try {
			
			File file = new File(filnavn);
			
			// første lesing - skipper informasjon om naboer
			register = lesEiendommer(file);
		
			// andre lesing - registere naboer
			lesNaboer(file,register);

		} catch (FileNotFoundException e) {
			System.out.println("Feil i filformat");
		}
		return register;
	}
	
	private static Eiendom lesEiendom(Scanner reader) {

		Eiendom eiendom = null;

		String type = reader.next();
		int gns = reader.nextInt();
		int bns = reader.nextInt();

		int antalleiere = reader.nextInt();

		ArrayList<Eier> eiere = new ArrayList<Eier>();

		for (int i = 1; i <= antalleiere; i++) {
			Eier eier = lesEier(reader);
			eiere.add(eier);
		}

		// spring over informasjon om naboer i første lesing
		reader.nextLine();

		if (type.equals("UTLEIEEIENDOM")) {
			int leierfodselsnummer = reader.nextInt();
			int leie = reader.nextInt();
			reader.nextLine();
			eiendom = new UtleieEiendom(gns, bns, leierfodselsnummer, leie);
			eiendom.setEiere(eiere);
		} else if (type.equals("NERINGSEIENDOM")) {
			int orgnr = reader.nextInt();
			reader.nextLine();
			eiendom = new NeringsEiendom(gns, bns, orgnr);
			eiendom.setEiere(eiere);
		} else {
			System.out.println("Feil i eiendomstype");
		}

		return eiendom;
	}
	
	private static Eier lesEier(Scanner reader) {

		reader.nextLine(); // springer over ny linje etter antall eiere
		String navn = reader.nextLine();
		int fodselsnummer = reader.nextInt();

		String vei = reader.next();
		int nummer = reader.nextInt();

		int postnummer = reader.nextInt();
		String by = reader.next();
		
		String land = reader.next();
		
		reader.nextLine(); // flyt scanner til neste linje

		KontaktAdresse ka = new KontaktAdresse(vei, nummer, postnummer, by, land);

		Eier eier = new Eier(navn, fodselsnummer, ka);

		return eier;
	}
	
	private static void lesNaboer(File file, EiendomsRegister register) throws FileNotFoundException {

		Scanner reader = new Scanner(file);

		reader.nextLine(); // spring over kommune
		int antall = reader.nextInt(); 
		reader.nextLine();
		
		for (int k = 1; k <= antall; k++) {

			String type = reader.next(); 
			int gns = reader.nextInt();
			int bns = reader.nextInt();

			Eiendom eiendom = register.finnEiendom(gns, bns);

			int antalleiere = reader.nextInt();
			
			reader.nextLine();

			// skip eiere - fyller fem linjer
			for (int i = 1; i <= antalleiere; i++) {
				for (int j = 1; j <= 5; j++) {
					String str = reader.nextLine(); 
					System.out.println(str);
				}
			}

			int antallnaboer = reader.nextInt();

			for (int i = 1; i <= antallnaboer; i++) {
				int nabogns = reader.nextInt();
				int nabobns = reader.nextInt();
				Eiendom nabo = register.finnEiendom(nabogns, nabobns);
				eiendom.registrerNabo(nabo);
			}
			
			if (type.equals(UESTR)) {
				reader.next();
				reader.next();
			} else if (type.equals(NESTR)) {
				reader.next();

			} else {
				System.out.println("Feil i eiendomstype");
			}
		}

		reader.close();
	}	
}
