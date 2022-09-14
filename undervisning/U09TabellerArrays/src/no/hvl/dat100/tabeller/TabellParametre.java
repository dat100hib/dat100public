package no.hvl.dat100.tabeller;

public class TabellParametre {

	public static void main(String[] args) {
		
		int tallvar = 1;
		
		int[] talltabell = {3,4,5,6,7,8};
		
		System.out.println("Verdioverføring");
		
		System.out.println(tallvar);
		
		tallParameter(tallvar);
		
		System.out.println(tallvar);
		
		System.out.println("Referanse-overførsel");
		
		skrivUt(talltabell);
		
		tabellParameter(talltabell);
		
		skrivUt(talltabell);
	}
	
	public static void skrivUt(int[] tabell) {
		
		for (int t : tabell) {
			System.out.print(t + " ");
		}
		
		System.out.println();
		
	}
	// referanse overførsel
	public static void tabellParameter(int[] tabell) {
		
		tabell[2] = 20;
		
	}
	
	// verdi-overførsel
	public static void tallParameter(int tall) {
		
		tall = 20;
	}
}
