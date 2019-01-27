package com.mathitems.search.binary;

public class ArrayInvestigations {
	
	/**
	 * Calculate middle point using classic formula (a+b)/2 
	 */
	public int middleClassic(int start, int end) {
		return (start + end)/2;
	}
	
	/**
	 * Calculate middle point using formula a + (b-a)/2 
	 */
	public int middleStartPlus(int start, int end) {
		return start + (end - start)/2;
	}
	
	/**
	 * Calculate middle point using formula b + (a-b)/2 
	 */
	public int middleEndPlus(int start, int end) {
		return end + (start - end)/2;
	}

}
