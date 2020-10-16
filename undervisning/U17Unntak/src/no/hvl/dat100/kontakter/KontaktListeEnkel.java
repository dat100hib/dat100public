package no.hvl.dat100.kontakter;

public class KontaktListeEnkel {

	public static Kontakt finnPerson(Kontakt[] kontakter, String navn) {
	
		boolean funnet = false;
		Kontakt k = null;
		
		int i = 0;
		while (i<kontakter.length && !(funnet)) {
			
			String kontaktnavn = kontakter[i].getNavn();
			
			if (navn.equals(kontaktnavn)) {
				funnet = true; 
				k = kontakter[i];
			}
			i++;
		}
		
		return k;
	}
	
	public static void main(String[] args) {
		
		Kontakt k1 = new Kontakt("Lars",55943623);
		Kontakt k2 = new Kontakt("Sven-Olai",55323223);
		
		Kontakt[] kontakter = new Kontakt[2];
		
		kontakter[0] = k1;
		kontakter[1] = k2;

		Kontakt k3 = finnPerson(kontakter,"Lars");
		
		String str = k3.toString();
		System.out.println(str);
		
		Kontakt k4 = finnPerson(kontakter,"Nemo");
		
		str = k4.toString();
		System.out.println(str);
	}

}
