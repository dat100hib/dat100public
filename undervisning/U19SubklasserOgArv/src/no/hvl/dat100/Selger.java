package no.hvl.dat100;

public class Selger extends Ansatt {
	private double bonus;
	
	public Selger(int anr, String fNavn, String eNavn, double lonn, double bonus) {
		super(anr, fNavn, eNavn, lonn);
		this.bonus = bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	@Override
	public double getLønn() {
		return super.getLønn() + bonus;
		// Dersom lønn er protected i Ansatt kan vi også skrive
		// return lønn + bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Bonus: " + bonus;
	}
}
