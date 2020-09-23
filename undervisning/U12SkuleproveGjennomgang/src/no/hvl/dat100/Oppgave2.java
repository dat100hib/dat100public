package no.hvl.dat100;

public class Oppgave2 {

	public static void main(String[] args) {
		/* 
		 * for-løkkke
		 * 
		 * 10 / 2 = 5
		 * 10 / 3 = 3
		 * 10 / 4 = 2
		 * 10 / 5 = 2
		 * 10 / 6 = 1
		 */
		
		for (int nemner = 2; nemner <= 6; nemner++) {
			int svar = 10 / nemner;
			System.out.println(10 + " / " + nemner + " = " + svar); 
		}
		

	}

}
