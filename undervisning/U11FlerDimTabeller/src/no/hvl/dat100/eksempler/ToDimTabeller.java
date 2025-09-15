package no.hvl.dat100.eksempler;

public class ToDimTabeller {

	// datatype[][] tabellnavn = new datatype[M][N];
	static boolean[][] btab = new boolean[4][5];

	public void main(String[] args) {
		
		// variable = tabellnavn[r][k]
		boolean b = btab[1][3];

		// tabellnavn[r][k] = verdi
		btab[1][3] = true;
	}
}
