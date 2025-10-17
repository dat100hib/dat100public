package no.hvl.dat100.tabeller;

public class LottoSjekkSortert {

	public static int ANTALL = 7;
	
	static int[] lottoTall = {1,2,7,16,21,29,34};
	
	static int[] minKupong1 = {1,2,12,16,25,26,34};
	
	static int[] minKupong2 = {1,2,7,16,21,29,34};

	public static boolean sjekkkupong(int[] kupong) {
		
		int i = 0;
		boolean lik = true;
		
		while (lik && i<ANTALL) {
			lik = lottoTall[i] == kupong[i];
			i++;
		}
		
		return lik;
	}
	
	public static void main(String[] args) {
		System.out.println(sjekkkupong(minKupong1));
		System.out.println(sjekkkupong(minKupong2));

	}

}
