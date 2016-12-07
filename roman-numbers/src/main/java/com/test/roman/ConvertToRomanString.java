package com.test.roman;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.test.roman.utils.Utils;

/**
 * Class to convert integers to their equivalent roman symbols.
 * Uses the following logic:
 * 1. Start with the highest (in terms of magnitude) symbol available.
 * 2. Check if number is in the "one less" range - as described in method below.
 * 3. If number is not in one less range, add the highest matching symbol to the symbol string, subtract the symbol value from input and loop again
 * 4. If number is in one less range, adjust symbols, subtract relevant one less value and loop again.
 * Ex:- For input 43, correct symbol is not XXXXIII since this 43 is in the one less range: 50 (change of symbol) - 10 (one less value)
 * and so adjust symbols to X (one less) L (50), subtract XL (ie 40) and continue loop.
 * 5. Continue until the input reduced to 0.
 * 
 * Given that we "find" the one-less number rather than using standard defined, any new symbols following the same convention of one-less
 * will work without any modification to code if supplied the correct symbols.
 * 
 * Assumption:
 * 1. Roman equivalent of zero and negative numbers is empty. Could either throw Exception or return symbol with a negative sign prepended.
 *  
 * TODO: use modulus instead of subtraction to massively reduce looping 
 */

public class ConvertToRomanString implements ConvertToRoman {

	/**
	 * @param number to convert to roman
	 * @return roman symbol string 
	 */
	public String convertToRoman(int input) {
		
		List<Numeral> romans = Utils.buildRomanList(); 
		
		//our logic is based on highest to lowest magnitude symbols,
		//so ensure the symbol list is sorted in that order.
		Collections.sort(romans, Collections.reverseOrder());  

		int descendingInput = input;
		int ctr = 0;
		StringBuilder roman = new StringBuilder();
		
		while(descendingInput > 0){ 
			while(descendingInput >= romans.get(ctr).getNum()){
				
				int oneLess = getOneLess(descendingInput);

				//check one-less here and if applicable, adjust symbols.
				if((ctr!= 0) && (descendingInput >= romans.get(ctr-1).getNum()-oneLess)){
					roman.append(getRoman(romans, ctr, oneLess).get().getRoman());
					roman.append(romans.get(ctr-1).getRoman());
					descendingInput -= romans.get(ctr-1).getNum() - oneLess;
					continue;
				}
					
				roman.append(romans.get(ctr).getRoman());
				descendingInput -= romans.get(ctr).getNum();

			}
			ctr++;
		}
		
		return roman.toString();
	}
	
	/**
	 * Return a Numeral if an exact match is found
	 * @param romans - list of numericals, ie numbers to roman symbols
	 * @param ctr - upper bound of symbols to be found
	 * @param num - number to match
	 * @return matched Numeral if any
	 */
	public Optional<Numeral> getRoman(List<Numeral> romans, int ctr, int num){
	return romans.subList(ctr, romans.size()).stream()
			.filter(roman -> roman.getNum() == num)
			.findFirst();
		
	}
	
	/**
	 * Find the "one less" numeral.
	 * Ex:- 4 is 5 less one, 9 is 10 less one
	 * 		40 is 50 less 10, 90 is 100 less 10
	 * @param num - the number for which the "one less" is required
	 * @return the "one less"
	 * 
	 * TODO: add check for negative numbers
	 */
	
	public int getOneLess(int num){
		int oneLess = 10;
		while(num/oneLess > 1){
			oneLess *= 10;
		}
		
		return oneLess/10;
	}
}
