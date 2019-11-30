package com.mathitems.sequences.fibonachi;

import java.util.Optional;
import java.util.stream.Stream;

public class FibonachiSequenceProcessor {
	
	/**
	 * Calculates Fibonachi value for passes index. Recursion is not used.
	 * @param index
	 * @return Fibonachi value
	 */
	public int getFibonachiNumber(int index) {
		if(index < 1){
			throw new IllegalArgumentException("Passed index should be more than 1");
		}
		
		int valuePrev1 = 1;
		int valuePrev2 = 1;
		int value = 1;
		
		for(int i=3; i <=index; i++){
			value = valuePrev1 + valuePrev2;
			valuePrev2 = valuePrev1;
			valuePrev1 = value;
		}
		
		return value;
	}
	
	/**
	 * Calculates Fibonachi value for passes index by recursion.
	 * @param index
	 * @return Fibonachi value
	 */
	public int getFibonachiRecursion(int index) {
		if(index <= 2 ){
			return 1;
		}else{
			return getFibonachiRecursion(index - 1) + getFibonachiRecursion(index - 2);
		}
	}
	
	/**
	 * Calculates Fibonachi value for passes index by creation stream.
	 * @param index
	 * @return Fibonachi value
	 */
	public int getFibonachiStream(int index){
		final int[] initalSize = {0, 1};
		Optional<int[]> arrFibonachi = Stream.iterate(initalSize, arr -> {
			final int[] item = new int[2];
			item[0] = arr[1];
			item[1] = arr[0] + arr[1];
			return item;		
			
		}   ).limit(index).skip(index - 1).findFirst();
		
		if(arrFibonachi.isPresent()){
			return arrFibonachi.get()[1];
		}
		
		throw new IllegalStateException(String.format("Something wrong with calculation of fibonachi number via stream logic, passed value of index is %d", index));
				
	}

}
