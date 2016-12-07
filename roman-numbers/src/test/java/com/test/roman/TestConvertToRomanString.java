package com.test.roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvertToRomanString {

	ConvertToRomanString convertRoman = new ConvertToRomanString(); 

	@Test
	public void testOneLess9(){
		assertEquals(1, convertRoman.getOneLess(9));
	}
	
	@Test
	public void testOneLess50(){
		assertEquals(10, convertRoman.getOneLess(50));
	}
	
	@Test
	public void test1(){
		assertEquals("I", convertRoman.convertToRoman(1));
	}

	@Test
	public void test2(){
		assertEquals("II", convertRoman.convertToRoman(2));
	}

	@Test
	public void test4(){
		assertEquals("IV", convertRoman.convertToRoman(4));
	}

	@Test
	public void test5(){
		assertEquals("V", convertRoman.convertToRoman(5));
		
	}

	@Test
	public void test7(){
		assertEquals("VII", convertRoman.convertToRoman(7));
	}
	
	@Test
	public void test9(){
		assertEquals("IX", convertRoman.convertToRoman(9));
	}

	@Test
	public void test10(){
		assertEquals("X", convertRoman.convertToRoman(10));
	}
	
	@Test
	public void test12(){
		assertEquals("XII", convertRoman.convertToRoman(12));
	}
	
	@Test
	public void test14(){
		assertEquals("XIV", convertRoman.convertToRoman(14));
	}
	
	@Test
	public void test40(){
		assertEquals("XL", convertRoman.convertToRoman(40));
	}

	@Test
	public void test43(){
		assertEquals("XLIII", convertRoman.convertToRoman(43));
	}
	
	@Test
	public void test49(){
		assertEquals("XLIX", convertRoman.convertToRoman(49));
	}
	
	@Test
	public void test50(){
		assertEquals("L", convertRoman.convertToRoman(50));
	}
	
	@Test
	public void test52(){
		assertEquals("LII", convertRoman.convertToRoman(52));
	}
	
	@Test
	public void test57(){
		assertEquals("LVII", convertRoman.convertToRoman(57));
	}
	
	@Test
	public void test80(){
		assertEquals("LXXX", convertRoman.convertToRoman(80));
	}
	
	@Test
	public void test82(){
		assertEquals("LXXXII", convertRoman.convertToRoman(82));
	}
	
	@Test
	public void test87(){
		assertEquals("LXXXVII", convertRoman.convertToRoman(87));
	}

	@Test
	public void test90(){
		assertEquals("XC", convertRoman.convertToRoman(90));
	}
	
	@Test
	public void test92(){
		assertEquals("XCII", convertRoman.convertToRoman(92));
	}
	
	@Test
	public void test97(){
		assertEquals("XCVII", convertRoman.convertToRoman(97));
	}
	
	@Test
	public void test2016(){
		assertEquals("MMXVI", convertRoman.convertToRoman(2016));
	}
	
	@Test
	public void test0(){
		assertEquals("", convertRoman.convertToRoman(0));
	}

	@Test
	public void testNegative(){
		assertEquals("", convertRoman.convertToRoman(-110));
	}

	
}
