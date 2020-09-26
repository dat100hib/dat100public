package no.hvl.dat100.rektangel;

public class Rektangel {
	int bredde;
	int hogde;
	// Plassering for øverste venstre hjørne
	Punkt oversteVenstre;
	
	public Rektangel(int bredde, int hogde, int x, int y) {
		this.bredde = bredde;
		this.hogde = hogde;
		oversteVenstre = new Punkt(x, y);
	}

	public void skrivUt() {
		System.out.println("Bredde: " + bredde + ", Høgde: " + hogde);
		System.out.print("Øverste venstre hjørne: ");
		oversteVenstre.skrivUt();
	}
}
