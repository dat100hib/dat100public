package no.hvl.dat100;

public class Areal {

	public static void main(String[] args) {
		
		int svar = areal(3,4);
		
		System.out.println(svar);
		
		int a = 2;
		int b = 3;
		int c = 4;
		
		int min = minst(a,minst(b,c));
	}

	public static int areal(int bredde, int hoyde) {
		
		int flateareal = bredde * hoyde;
		
		return flateareal;
	}
	
	public static int minst(int tall1, int tall2) {
		
		if (tall1 < tall2) {
			return tall1;
		}
		
		return tall2;
	}
	
}
