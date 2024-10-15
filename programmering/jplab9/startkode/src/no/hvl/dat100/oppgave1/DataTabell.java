package no.hvl.dat100.oppgave1;

public class DataTabell {
	
	public static void main(String[] args) {
	
		Data[] tab = new Data[3];
		
		tab[0] = new Data(1);
		tab[1] = new Data(2);
		tab[2] = new Data(3);
		
		for (Data d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		for (Data d : tab) {
			d.setData(d.getData() + 1);
		}
		
		
		for (Data d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();
		
	}
}
