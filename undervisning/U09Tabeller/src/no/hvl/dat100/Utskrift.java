package no.hvl.dat100;

public class Utskrift {

	public static void main(String[] args) {

		double[] obs = { 1.2, 3.5, 4.8, 7.9, 41.2, 10.1 };

		System.out.println(obs);

		// utskrift - versjon 0
		System.out.println(obs[0]);
		System.out.println(obs[1]);
		System.out.println(obs[2]);
		System.out.println(obs[3]);
		System.out.println(obs[4]);
		System.out.println(obs[5]);

		// utskrift - versjon 1
		for (int i = 0; i <= 5; i++) {

			double v = obs[i];
			System.out.println(v);

		}

		// utskrift - versjon 2
		for (int i = 0; i < obs.length; i++) {

			double v = obs[i];
			System.out.println("Observasjon " + i + " : " + v);

		}

		// utskrift - versjon 3
		for (int i = 0; i < obs.length; i++) {

			System.out.println("Observasjon " + i + " : " + obs[i]);

		}

	}

}
