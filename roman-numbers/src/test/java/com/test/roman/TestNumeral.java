package com.test.roman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestNumeral {

	Numeral five = new Numeral(5, "V");
	Numeral one = new Numeral(1, "I");
	
	@Test
	public void testNumeralCompareLesser(){
		assertTrue(one.compareTo(five) < 0);
	}
	
	@Test
	public void testNumeralCompareEqual(){
		assertEquals(0, one.compareTo(one));
	}
	
}
