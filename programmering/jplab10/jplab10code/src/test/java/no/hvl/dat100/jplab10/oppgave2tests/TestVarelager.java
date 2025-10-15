package no.hvl.dat100.jplab10.oppgave2tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import no.hvl.dat100.jplab10.oppgave2.*;

class TestVarelager {

	private TVarelager varelager;
	private int STR = 3;
	private Vare v0,v1,v2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		varelager = new TVarelager(STR);

		v0 = new Vare(0,"0",1);
		v1 = new Vare(1,"1",2);
		v2 = new Vare(2,"2",3);
		
	}

	@Test
	void testConstructore() {
		
		assertEquals(0,varelager.getAntall());
		assertEquals(STR,varelager.getTVarer().length);
		
	}

	@Test
	void testgetVarer() {
		assertEquals(0,varelager.getAntall());
		assertEquals(STR,varelager.getVarer().length);
		
	}
	
	@Test
	void testleggTilVare () {
		
		assertTrue(varelager.leggTilVare(v0));
		assertEquals(1,varelager.getAntall());

		assertTrue(varelager.leggTilVare(v1));
		assertEquals(2,varelager.getAntall());

		assertTrue(varelager.leggTilVare(v2));
		assertEquals(3,varelager.getAntall());

		Vare[] vl = varelager.getTVarer();
		
		assertEquals(v0,vl[0]);
		assertEquals(v1,vl[1]);
		assertEquals(v2,vl[2]);

		assertFalse(varelager.leggTilVare(v2));

		varelager.printVarelager();
	}
	
	@Test
	void testleggTil () {
		
		assertTrue(varelager.leggTil(0,"0",0));
		assertEquals(1,varelager.getAntall());

		assertTrue(varelager.leggTil(1,"1",1));
		assertEquals(2,varelager.getAntall());

		assertTrue(varelager.leggTil(2,"2",2));
		assertEquals(3,varelager.getAntall());

		Vare[] vl = varelager.getTVarer();
		
		assertFalse(varelager.leggTil(4,"4",4));

		varelager.printVarelager();
	}
	
	@Test 
	void testfinnVare() {
		
		varelager.leggTilVare(v0);
		varelager.leggTilVare(v1);
		varelager.leggTilVare(v2);
		assertEquals(v1,varelager.finnVare(1));
	}
	
	@Test 
	void testfinnVareNull() {
		
		varelager.leggTilVare(v0);
		varelager.leggTilVare(v1);
		varelager.leggTilVare(v2);
		assertNull(varelager.finnVare(4));
	}
}
