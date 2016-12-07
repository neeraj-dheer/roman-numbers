package com.test.roman.utils;

import java.util.ArrayList;
import java.util.List;

import com.test.roman.Numeral;

public class Utils {
	
	public static List<Numeral> buildRomanList(){
		List<Numeral> romans = new ArrayList<>();
		romans.add(new Numeral(1000, "M"));
		romans.add(new Numeral(500, "D"));
		romans.add(new Numeral(100, "C"));
		romans.add(new Numeral(50, "L"));
		romans.add(new Numeral(10, "X"));
		romans.add(new Numeral(5, "V"));
		romans.add(new Numeral(1, "I"));
		
		return romans;
	}

}
