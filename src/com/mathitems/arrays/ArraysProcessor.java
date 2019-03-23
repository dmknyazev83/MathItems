package com.mathitems.arrays;

import java.util.Arrays;

public class ArraysProcessor {
	
	public int findMissedValueInArray(int[] array){
		int start = 1;
		int end = array.length;
		int sumVal = ((start+end+1)*(array.length+1))/2;
		
		int currentSum = Arrays.stream(array).sum();
		return sumVal - currentSum;
		
	}

}
