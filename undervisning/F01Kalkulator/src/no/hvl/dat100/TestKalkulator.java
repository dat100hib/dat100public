package no.hvl.dat100;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKalkulator {

	@Test
	public void testAdd() {
		assertEquals("Test av 1+2", 3, Kalkulator.add(1, 2));
	}

	@Test
	public void testSub() {
		assertEquals("Test av 4-2", 2, Kalkulator.sub(4, 2));
		assertEquals("Test av 2-4", -2, Kalkulator.sub(2, 4));

	}

	@Test
	public void testMul() {
		assertEquals("Test av 3*2", 6, Kalkulator.mul(3, 2));
	}

	@Test
	public void testDiv() {
		assertEquals("Test av 4/2", 2, Kalkulator.div(4, 2));
	}



}

