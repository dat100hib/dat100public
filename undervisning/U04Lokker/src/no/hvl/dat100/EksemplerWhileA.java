package no.hvl.dat100;

public class EksemplerWhileA {

	public static void main(String[] args) {

		int tal = 11;

		int a = 0;
		while (tal > 1) {
			
			tal = tal / 2;
			a++;
			
		}
		
		System.out.println("tal = " + tal);
		System.out.println("a = " + a);
	}
}
