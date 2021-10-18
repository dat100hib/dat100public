package no.hvl.dat100.pass;

public class PassTabell {

	public static void main(String[] args) {
	
		
		Pass[] passtabell = new Pass[2];
		
		Pass olepass = new Pass("Ole Olsen", "06079112340", Status.GYLDIG, 1.84);
		Pass olinepass = new Pass("Oline Olsen", "06079112341", Status.GYLDIG, 1.94);
		
		passtabell[0] = olepass;
		passtabell[1] = olinepass;
		
		// vanlig for-løkke
		for (int i = 0; i<passtabell.length;i++) {
			
			String str = passtabell[i].toString();
			System.out.println(str);
		}
		
		Pass pass = passtabell[0];
		pass.setHogde(1.96);
		
		// utvidet for-løkke
		for (Pass p : passtabell) {
			String str = p.toString();
			System.out.println(str);
		}
		
		System.out.println(erGyldig(passtabell,1));
		System.out.println(erGyldig(passtabell,2));
		
		passtabell[0].setStatus(Status.UTLØPT);
		
		System.out.println(erGyldig(passtabell,1));
		System.out.println(erGyldig(passtabell,2));
		
		Pass olepass2 = new Pass(1, "Ole Olsen", "06079112340", Status.GYLDIG, 1.84);
		System.out.println(erLik(olepass,olepass2));
	}
	
	private static boolean erGyldig(Pass[] passtabell, int passnummer) {
		
		for (Pass p : passtabell) {
			
			if (p.getNummer() == passnummer) {
				return (p.getStatus() == Status.GYLDIG);
			}
		}
		
		return false;
		
	}
	
	private static boolean erLik(Pass p1, Pass p2) {
		
		// return (p1 == p2);
		
		return (p1.equals(p2));
		
	}

}
