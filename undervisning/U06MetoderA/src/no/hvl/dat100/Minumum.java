package no.hvl.dat100;

public class Minumum {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 4;
		
		int min = minst(a,minst(b,c));
		
		System.out.println(min);

	}

	public static int minst(int tall1, int tall2) {
		
		if (tall1 < tall2) {
			return tall1;
		}
		
		return tall2;
	}
	
}
