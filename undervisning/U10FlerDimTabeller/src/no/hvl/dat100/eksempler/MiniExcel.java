package no.hvl.dat100.eksempler;

public class MiniExcel {

	private static int[][] data = 
		{
		  { 1, 2, 0 }, 
		  { 3, 4, 0 }, 
		  { 5, 6, 0 }, 
		  { 0, 0, 0 } 
		  
		  };

	public static void skrivUt() {

		System.out.println("---------------");

		// TODO
		
		for (int[] rad : data) {
			
			for (int v : rad) {
				System.out.print(v + " ");
			}
			
			System.out.println();
		}

		System.out.println("---------------");
	}

	public static void beregnSum() {

		// TODO - SUMMER RAD
		
		for (int r = 0; r<data.length-1; r++) {
			
			int[] rad = data[r];
			
			int sum = 0;
			int sistepos = rad.length-1;
			
			for (int k = 0; k<sistepos; k++) {
				sum = sum + rad[k];
			}
			
			rad[sistepos] = sum;
			
		}
		
		// TODO - SUMMER KOLONNER
		
		int sisteradpos = data.length-1;
		int radlengde = data[0].length;
		
		int[] sisterad = data[sisteradpos];
		
		for (int k = 0; k<radlengde; k++) {
			
			int sum = 0;
			for (int r = 0; r<sisteradpos; r++) {	
				sum = sum + data[r][k];
			}
			
			sisterad[k] = sum;
			
		}
		
	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
