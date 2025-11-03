package no.hvl.dat100;

public class BokTest {

	public static void main(String[] args) {
		ObjektSamling bibliotek = new ObjektSamling(10);
		
		Bok java = new Bok("978...", "Forstå programmering - med Java");
		bibliotek.settInn(java);
		
		Bok jungelboka = new Bok("451...", "Jungelboka");
		bibliotek.settInn(jungelboka);
		
		System.out.println(bibliotek.toString());
		
		Bok b = (Bok) bibliotek.finn("977...");
		
		if (b != null) {
			System.out.println("Fant: " + b.toString());
		} else {
			System.out.println("Fant IKKE boken");
		}
		

		System.out.println(jungelboka.erMindreEnn(java));
	}

}
