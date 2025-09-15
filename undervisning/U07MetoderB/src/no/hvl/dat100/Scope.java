package no.hvl.dat100;

public class Scope {

	private static int y = 5;

	public static void main(String[] args) {
		
		int x = 5;
		
		set(x,10);

		System.out.println(x);
		System.out.println(y);
	}

	private static void set(int x, int v) {
				
		x = v;
		y = v;

	}
}
	
