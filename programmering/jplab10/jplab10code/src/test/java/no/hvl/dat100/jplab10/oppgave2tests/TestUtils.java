package no.hvl.dat100.jplab10.oppgave2tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat100.jplab10.oppgave2.Vare;
import no.hvl.dat100.jplab10.oppgave2.VarelagerUtils;

class TestUtils {

	private Vare[] varetab;
	
	@BeforeEach
	void setUp() throws Exception {

		varetab = new Vare[3];
		varetab[0] = new Vare(0,"0",1);
		varetab[1] = new Vare(1,"1",7);
		varetab[2] = new Vare(2,"2",42);
	
	}

	@Test
	void testfinnBilligste() {
		
		assertEquals(varetab[0],VarelagerUtils.finnBilligste(varetab));
	}

	@Test
	void testtotalPris() {
		
		assertEquals(50,VarelagerUtils.totalPris(varetab));
	}

	@Test
	void testfinnVarenr() {
		
		int[] numre = {0,1,2};
		
		assertTrue(Arrays.equals(numre,VarelagerUtils.finnVarenr(varetab)));
	}
	
	@Test
	void testfinnPrisDifferanser() {
		
		double[] diffs = {6,35};
		
		assertTrue(Arrays.equals(diffs,VarelagerUtils.finnPrisDifferanser(varetab)));
	}
	
}
