package com.mathitems.algebra;

public class EuclidusAlgoritms {
	
	public int findGreatCommonDelimiter(int a, int b){
		if(a != 0 && b !=0){
			while(a !=0 && b!=0){
				if(a > b){
					a = a % b;
				}else{
					b = b % a;
				}
			}
	
			return a!=0 ? a : b;
		}
		
		throw new IllegalArgumentException(String.format("Check some of passed value are zero a=%d, b=%d", a, b));
	}

}
