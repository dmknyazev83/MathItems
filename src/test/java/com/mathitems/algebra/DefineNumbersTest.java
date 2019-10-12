package com.mathitems.algebra;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefineNumbersTest {
	
	private DefineNumbers defineNumber;
	
	@Before
	public void init(){
		defineNumber = new DefineNumbers();
	}
	
	@Test
	public void defineIntegersAmongDoublesTest(){
		double[] arrDouble1 = {3.4, 5.0, 2.1};
		int[] expected1 = {5};
		int[] actualArr1 = defineNumber.defineIntegersAmongDoubles(arrDouble1);
		Assert.assertArrayEquals(expected1, actualArr1);
		
		double[] arrDouble2 = {7.0, 12.8, 2.5, 6.0, 3.8, 1.0};
		int[] expected2 = {7, 6, 1};
		int[] actualArr2 = defineNumber.defineIntegersAmongDoubles(arrDouble2);
		Assert.assertArrayEquals(expected2, actualArr2);
		
	}

}
