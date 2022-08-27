package no.hvl.dat100;

public class EksemplerWhile {

	public static void main(String[] args) {

		// a)
		
		int tal = 11;

		int a = 0;
		while (tal > 1) {
			
			tal = tal / 2;
			a++;
			
		}
		
		System.out.println("tal = " + tal);
		System.out.println("a = " + a);

		// b)
		
		int x = 16;
		int y = 12;

		while (x != y) {
						
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
