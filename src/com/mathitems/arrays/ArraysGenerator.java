package com.mathitems.arrays;

public class ArraysGenerator {
	
	public int[] generateIntArrWithMissedNumber(int missed, int size){
		int realSize = size-1;
		int[] result = new int[realSize];
		int k=0;
		int i=1;
		while(k < realSize){
			if(i != missed){
				result[k] = i;				
			}else{
				result[k] = ++i;
			}
			k++;
			i++;
		}
		
		return result;
	}

}
