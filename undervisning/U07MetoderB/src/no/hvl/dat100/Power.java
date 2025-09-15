package no.hvl.dat100;

public class Power {

	public static void main(String[] args) {
		
		System.out.println(power(2,5));

		System.out.println(power(2,0));
		
		System.out.println(pow(2,5));

		System.out.println(pow(2,0));
	}

	private static int power(int x, int n) {
		
		int r = 1;
		
		for (int i = 1; i<=n;i++) {
			r = r * x;
		}
		
		return r;
	}
	
	private static int pow(int x, int n) {
		
		if (n == 0) {
			return 1;
		}
		
		return (x*pow(x,n-1));
	}
}
