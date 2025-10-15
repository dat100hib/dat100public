package no.hvl.dat100.jplab10.oppgave2tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat100.jplab10.oppgave2.Vare;

class TestVare {

	private Vare v;
	
	private int NR = 1;
	private String NAVN = "ostepops";
	private double PRIS = 200.0;
	
	private int NR_S = 2;
	private String NAVN_S = "discount ostepops";
	private double PRIS_S = 100.0;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		v = new Vare(1,"ostepops",200);
	}

	@Test
	void testgetVarenr() {
		assertEquals(NR,v.getVarenr()); 	
	}

	@Test
	void testgetNavn() {
		assertEquals(NAVN,v.getNavn()); 	
	}

	@Test
	void testsetPris() {
		v.setPris(PRIS_S);
		assertEquals(PRIS_S,v.getPris()); 	
	}
	
	@Test
	void testsetVarenr() {
		v.setVarenr(NR_S);
		assertEquals(NR_S,v.getVarenr()); 	
	}

	@Test
	void testsetNavn() {
		v.setNavn(NAVN_S);
		assertEquals(NAVN_S,v.getNavn()); 	
	}

	@Test
	void testgetPris() {
		assertEquals(PRIS,v.getPris()); 	
	}
	
	@Test
	void testberegnMoms() {
		assertEquals(40.0,v.beregnMoms()); 	
	}
	
	@Test
	void testerBilligere() {
		
		Vare v2 = new Vare(NR_S,NAVN_S,PRIS_S);
		assertTrue(v2.erBilligereEnn(v));
		assertFalse(v.erBilligereEnn(v2));
	}
	
	@Test
	void testprintVare() {
		
		String res = "Vare [varenr=1, navn=ostepops, pris=200.0]";

		assertEquals(res,v.toString()); 	
	}
}
