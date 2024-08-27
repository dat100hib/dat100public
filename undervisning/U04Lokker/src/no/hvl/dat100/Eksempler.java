package no.hvl.dat100;

public class Eksempler {

	public static void main(String[] args) {
		
		for_eksempel();
		
		while_eksempel();
		
		dowhile_eksempel();

	}
	
	public static void for_eksempel() {
		
		for (int i=0; i<10; i++) {
			
			System.out.println(i);
			
		}
	}

	public static void while_eksempel() {
		
		int x = 2;
		
		while (x < 1000) {
			
			System.out.println(x);
			x = x * x;
			
		}
	}
	
	public static void dowhile_eksempel() {
		
		int x = 10;
		
		do {
			
			System.out.println(x);
			x = x - 1;
			
		} while (x > 0);
			
			
	}
}
