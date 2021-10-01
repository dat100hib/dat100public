package no.hvl.dat100.pass;

public class PassSamlingMain {

	public static void main(String[] args) {
		
		
		Pass olepass = new Pass("Ole Olsen", "06079112340", Status.GYLDIG, 1.84);
		Pass olinepass = new Pass("Oline Olsen", "06079112341", Status.GYLDIG, 1.94);
		
		PassSamling samling = new PassSamling();
		
		samling.leggTil(olepass);
		samling.leggTil(olinepass);
		
		samling.print();
		
		
	}
}
