package no.hvl.dat100;

public class Oppdatering {

	public static void main(String[] args) {

		double[] obs = { 1.2, 3.5, -4.8, 7.9, 41.2, 10.1 };

		for (int i = 0; i < obs.length; i++) {

			System.out.println("Observasjon " + i + " : " + obs[i]);

		}

		// oppdatering - versjon 1
		for (int i = 0; i < obs.length; i++) {

			if (obs[i] < 0) {
				obs[i] = 0;
			}
		}

		// oppdatering - versjon 2
		for (int i = 0; i < obs.length; i++) {

			obs[i] = Math.max(0, obs[i]);

		}

		for (int i = 0; i < obs.length; i++) {

			System.out.println("Observasjon " + i + " : " + obs[i]);

		}
	}

}
