package no.hvl.dat100;

public class Eksempel {

	public static void main(String[] args) {
		
		double[] obs = {1.2, -3.5, 4.8, 7.9, 41.2, 10.1};

		// oppslag 
		double o2 = obs[2];

		System.out.println(o2);
		
		// oppdatering
		obs[2] = 5.0;
				
		System.out.println(obs[2]);

	}

}
