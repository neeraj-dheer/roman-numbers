package com.test.roman;

public class Numeral implements Comparable<Numeral> {
	
	private int num;
	private String roman;
	
	public Numeral(int num, String roman){
		this.num 	= num;
		this.roman 	= roman;
	}
	
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the roman
	 */
	public String getRoman() {
		return roman;
	}
	/**
	 * @param roman the roman to set
	 */
	public void setRoman(String roman) {
		this.roman = roman;
	}
	
	public int compareTo(Numeral other){
		return this.getNum() - other.getNum();
	}
	
	public String toString(){
		return num + "=" + roman;
	}

}
