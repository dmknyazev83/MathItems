package com.mathitems.search.binary;

public class RunnerBinarySearch {

	public static void main(String[] args) {
		
		ArrayInvestigations arrInestig = new ArrayInvestigations();
		
		int[] arr0 = {};
		int[] arr1 = {1};
		int[] arr2 = {1,2};
		int[] arr3 = {1,2,3};
		int[] arr4 = {1,2,3,4};
		int[] arr5 = {1,2,3,4,5};
		int[] arr6 = {1,2,3,4,5,6};
		int[] arr7 = {1,2,3,4,5,6,7};
		int[] arr8 = {1,2,3,4,5,6,7,8};
		int[] arr9 = {1,2,3,4,5,6,7,8,9};
		int[] arr10 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr11 = {1,2,3,4,5,6,7,8,9,10,11};
		int[] arr12 = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int[][] aggregateArrays = {arr0,arr1,arr2,arr3,arr4,arr5,arr6,arr7,arr8,arr9,arr10,arr11,arr12};
		
		for(int[] currArray : aggregateArrays){
			int size = currArray.length;
			int start = 0;
			int end = currArray.length - 1;
			System.out.println(String.format("Calculate middle in array size=%d: classic=%d, start plus=%d, end plus=%d", 
					size, arrInestig.middleClassic(start, end), arrInestig.middleStartPlus(start, end), arrInestig.middleEndPlus(start, end)));
		}
	}

}
