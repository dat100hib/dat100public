package no.hvl.dat100;

public class Tildeling {

	public static void main(String[] args) {
		
		// tabell variable - tildeling
		double[] obs1 = {1.2, -3.5, 4.8, 7.9, 41.2, 10.1}; 
		double[] obs2 = {2.2, 6.5, 1.8, 9.9, 52.2, 17.1}; 
		
		System.out.println(obs1);
		System.out.println(obs2);
		
		obs1 = obs2;
		
		System.out.println(obs1);
		System.out.println(obs2);
		
		// oppdaterings eksperiment
		System.out.println(obs2[1]);
		
		obs1[1] = 2.0;
		
		System.out.println(obs1[1]);
			
		System.out.println(obs2[1]);
	}
}
