package com.test.roman;

public interface RomanConversions {

	String convertToRoman(int num);
	
	//TODO
	default int convertFromRoman(String roman) {return 0;}
}
