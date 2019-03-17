package com.mathitems.search.binary;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BinarySearchProcessorTest {
	
	private BinarySearchProcessor processor;
	
	@Before
	public void init(){
		processor = new BinarySearchProcessor();
	}
	
	@Test
	public void findIndexWithRecursionTest(){
		int[] testArray = {4, 6, 8, 12, 13, 14, 21, 26, 29, 45, 67, 78, 79, 82};
		Assert.assertEquals(7, processor.findIndexWithRecursion(testArray, 26));
		Assert.assertEquals(-1, processor.findIndexWithRecursion(testArray, 20));
	}

}
