package no.hvl.dat100;

public class Sum {

	public static void main(String[] args) {
		
		double sum = sumRekke(2,0.5,5);
		
		System.out.println(sum);
	}
	
	private static double sumRekke(int a, double k, int n) {
		
		double sum = 0;
		
		for (int i = 0;i<=n-1;i++) {
			sum = sum + a* Math.pow(k,i);
			
		}
		
		return sum;
	}

}
