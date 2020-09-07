package no.hvl.dat100.tabeller;

public class LottoSjekk {
	
	static int[] lottoTall = {34,2,7,16,21,29,1};
	
	static int[] minKupong1 = {12,1,34,16,2,25,26};
	static int[] minKupong2 = {2,7,34,16,21,1,29};
	
	public static boolean finnesTall(int tall, int[] tabell) {
		
		boolean funnet = false;
		int pos = 0;
		
		while (!funnet && pos < tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true;
			}
			pos++;
		}
		
		return funnet;
	}
	
	public static boolean sjekkkupong(int[] kupong, int[] lottotall) {
		
		for (int tall : lottotall) {
			
			boolean hartall = finnesTall(tall,kupong);
			
			if (!hartall) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sjekkkupong(minKupong1,lottoTall));
		System.out.println(sjekkkupong(minKupong2,lottoTall));
		
	}
}
