package com.mathitems.sequences.fibonachi;

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

}