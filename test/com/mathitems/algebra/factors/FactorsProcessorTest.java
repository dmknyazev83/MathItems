package com.mathitems.algebra.factors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorsProcessorTest {
	
	private FactorsProcessor processor;
	
	@Before
	public void init(){
		processor = new FactorsProcessor();
	}
	
	@Test
	public void findFactorsTest(){
		int[] expectedFactors1 = {1, 2, 3, 6};
		int[] actualFactors1 = processor.findFactors(6);
		Assert.assertArrayEquals(expectedFactors1, actualFactors1);
		
		int[] expectedFactors2 = {1, 3, 7, 9, 21, 27, 63, 81, 189, 567};
		int[] actualFactors2 = processor.findFactors(567);
		Assert.assertArrayEquals(expectedFactors2, actualFactors2);
	}

}
