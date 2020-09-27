package no.hvl.dat100.studenttabell;

public class StudentTabell {

	public static void main(String[] args) {
		// Opprette tabell med plass til 3 studenter
		Student[] sTab = new Student[3];
		
		// Legge inn studenter
		sTab[0] = new Student(7, "Ole", "Olsen");
		sTab[1] = new Student(11, "Kari", "Nilsen");
		sTab[2] = new Student (15, "Nils", "Nilsen");
		
		// Skrive ut alle objekta
		for (Student s : sTab) {
			s.skrivUt();
		}
		
		// Søke etter et gitt studentnr
		// Ved funn skriv ut studenten, elles skriv melding
		// Lager metode
		
		Student s1 = sok(sTab, 11);
		if (s1 != null) {
			System.out.println("Fann studenten");
			// s1.skrivUt();
			System.out.println(s1.toString());
		} else {
			System.out.println("Fann ikkje studenten");
		}
		
	}

	public static Student sok(Student[] sTab, int snr) {
		
		int i = 0;
		boolean funnet = false;
		Student svar = null;
		
		while (i < sTab.length && !funnet) {
			if (snr == sTab[i].getStudentnr()) {
				svar = sTab[i];
				funnet = true;
			} else {
				i++;
			}
		}
		
		return svar;
	}
}
