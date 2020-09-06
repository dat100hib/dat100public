package no.hvl.dat100;

public class Sokning {

	public static void main(String[] args) {

		double[] obs = { 1.2, -3.5, 4.8, 7.9, 41.2, 10.1 };

		System.out.println(finnesOver(obs, 10));

		System.out.println(antallOver(obs, 10));

		System.out.println(antallOver2(obs, 10));

	}

	// TODO: finnesOver metode
	private static boolean finnesOver(double[] tab, int grense) {

		boolean funnet = false;

		int i = 0;
		while (i < tab.length && (!funnet)) {

			if (tab[i] > grense) {
				funnet = true;
			}
			i++;
		}

		return funnet;
	}

	// TODO: antallOver metode
	private static int antallOver(double[] tab, int grense) {

		int antall = 0;
		int i = 0;
		while (i < tab.length) {

			if (tab[i] > grense) {
				antall++;
			}
			i++;
		}

		return antall;

	}

	private static int antallOver2(double[] tab, int grense) {

		int antall = 0;
		for (double v : tab) {

			if (v > grense) {
				antall++;
			}
		}

		return antall;

	}
}
