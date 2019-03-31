package com.mathitems.algebra.factors;

public class FactorsProcessor {
	
	public int[] findFactors(int value){
		int end = value/2;
		int size = 2;
		int[] buf = new int[end];
		for(int i = 2; i <=end; i++){
			if(value % i <= 0){
				buf[i-2]=i;
				size++;
			}
		}
		int[] factors = new int[size];
		factors[0] = 1;
		int k = 1;
		for(int j = 0; j < buf.length; j++){
			if(buf[j] > 0){
				factors[k] = buf[j];
				k++;
			}
			
		}
		factors[size - 1] = value;
		return factors;
	}

}
