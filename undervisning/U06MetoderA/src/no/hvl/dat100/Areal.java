package no.hvl.dat100;

public class Areal {

	public static void main(String[] args) {
		
		int svar = areal(3,4);
		
		System.out.println(svar);
		
	}

	public static int areal(int bredde, int hoyde) {
		
		int flateareal = bredde * hoyde;
		
		return flateareal;
	}
		
}
