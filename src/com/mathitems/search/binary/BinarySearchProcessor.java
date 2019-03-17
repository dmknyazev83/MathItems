package com.mathitems.search.binary;

public class BinarySearchProcessor {
	
	private ArrayInvestigations arrayInvestigations;
	
	public BinarySearchProcessor(){
		this.arrayInvestigations = new ArrayInvestigations();
	}
	
	public int findIndexWithRecursion(int[] array, int value){
		return findIndexRecursive(array, 0, array.length - 1, value);
	}
	
	private int findIndexRecursive(int[] array, int start, int end, int value){
		if(start == end){
			if(array[start] == value){
				return start;
			}else{
				return -1;
			}
		}else{
			int mid = arrayInvestigations.middleStartPlus(start, end);
			if(array[mid] != value){
				int currentVal = array[mid];
				int h0;
				int h1;
				if(currentVal > value){
					h0 = start;
					h1 = mid == start ? mid : mid - 1;
				}else{
					h0 = mid + 1;
					h1 = end;
				}
				return findIndexRecursive(array, h0, h1, value);
			}else{
				return mid;
			}
		}
		
		
	}

}
