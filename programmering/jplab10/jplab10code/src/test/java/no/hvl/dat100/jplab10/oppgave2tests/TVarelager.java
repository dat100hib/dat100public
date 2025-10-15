package no.hvl.dat100.jplab10.oppgave2tests;

import no.hvl.dat100.jplab10.oppgave2.Varelager;
import no.hvl.dat100.jplab10.oppgave2.Vare;

public class TVarelager extends Varelager {

	public TVarelager(int n) {
		super(n);
	}
	
	public int getAntall () {
		return this.antall;
	}
	
	public Vare[] getTVarer () {
		return this.varer;
	}
}
