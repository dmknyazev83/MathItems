package com.mathitems.algebra;

public class DefineNumbers {
	
	public int[] defineIntegersAmongDoubles(double[] dArr){
		double[] buff = new double[dArr.length];
		int k = 0;
		for(double item : dArr){
			if(item % 1 <= 0){
				buff[k++] = item;
			}
		}
		int[] result = new int[k];
		for(int i = 0; i < k; i++){
			result[i] = (int)buff[i];
		}
		return result;
	}

}
