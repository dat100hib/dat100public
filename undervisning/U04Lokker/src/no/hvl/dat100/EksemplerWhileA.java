package no.hvl.dat100;

public class EksemplerWhileA {

	public static void main(String[] args) {

		int tall = 11;

		int a = 0;
		while (tall > 1) {
			
			tall = tall / 2;
			a++;
			
		}
		
		System.out.println("tall = " + tall);
		System.out.println("a = " + a);
	}
}
