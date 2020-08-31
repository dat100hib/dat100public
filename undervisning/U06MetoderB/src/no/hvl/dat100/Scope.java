package no.hvl.dat100;

public class Scope {

	private static int z = 5;

	public static void main(String[] args) {
		
		int x = 5;
		
		set(x,10);

		System.out.println(x);
		System.out.println(z);
	}

	private static void set(int x, int v) {
				
		x = v;
		z = v;

	}
}
	
