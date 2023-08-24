package com;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestPrimeNumber {
	@Test
	public void TestPrimeNumber() {
		primeNumber pn = new primeNumber();
		boolean boolActual = pn.checkPrimeNumber(11);
		assertFalse(boolActual);
		//assertTrue(boolActual);
	}
	
}
