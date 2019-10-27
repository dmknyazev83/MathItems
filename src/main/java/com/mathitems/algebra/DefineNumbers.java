package com.mathitems.algebra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
	
	public Integer[] defineIntegersAmongDoubles(Double[] dArr){
		return Arrays.stream(dArr).filter(i -> i % 1 <= 0)
		.map(i -> Integer.valueOf(i.intValue())).toArray(Integer[] :: new);
	}
	
	public int[] defineIntegersPrimitivesAmongDoubles(Double[] dArr){
		return Arrays.stream(dArr).filter(i -> i % 1 <= 0)
		.mapToInt(i -> i.intValue()).toArray();
	}
	
	public List<int[]> createPifagorTriaples(int limitRight){		
	
		List<int[]> res = IntStream.range(2, limitRight).boxed().flatMap(i -> {			
			return IntStream.range(i, limitRight).filter(b-> Math.sqrt(i*i + b*b)% 1 <= 0).mapToObj(b -> 				
				new int[]{i, b, (int)Math.sqrt(i*i + b*b)});		
	 }).collect(Collectors.toList());
		
		return res;
		
	}

}
