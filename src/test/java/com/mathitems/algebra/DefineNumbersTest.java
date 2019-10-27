package com.mathitems.algebra;

import java.util.List;

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
	public void defineIntegersAmongDoublesTestPrimitives(){
		double[] arrDouble1 = {3.4, 5.0, 2.1};
		int[] expected1 = {5};
		int[] actualArr1 = defineNumber.defineIntegersAmongDoubles(arrDouble1);
		Assert.assertArrayEquals(expected1, actualArr1);
		
		double[] arrDouble2 = {7.0, 12.8, 2.5, 6.0, 3.8, 1.0};
		int[] expected2 = {7, 6, 1};
		int[] actualArr2 = defineNumber.defineIntegersAmongDoubles(arrDouble2);
		Assert.assertArrayEquals(expected2, actualArr2);
		
	}
	
	@Test
	public void defineIntegersAmongDoublesTestWrappers(){
		Double[] dArr1 = {4.7D, 6.8D};
		Integer[] intArr1 = defineNumber.defineIntegersAmongDoubles(dArr1);
		Assert.assertTrue(intArr1.length == 0);
		
		Double[] dArr2 = {1.6D, 2.1D, 7.0D, 3.7D, 11D, 3.8D, 6.0D};
		Integer[] intArr2 = defineNumber.defineIntegersAmongDoubles(dArr2);
		Integer[] expected2 = {7, 11, 6};
		Assert.assertArrayEquals(expected2, intArr2);
	}
	
	@Test
	public void defineIntegersPrimitivesTestAmongDoubles(){
		Double[] dArr2 = {1.6D, 2.00D, 7.0D, 3.7D, 11D, 3.8D, 6.0D};
		int[] intArr = defineNumber.defineIntegersPrimitivesAmongDoubles(dArr2);
		int[] expected = {2, 7, 11, 6};
		Assert.assertArrayEquals(expected, intArr);
	}
	
	@Test
	public void createPifagorTriaplesTest(){
		List<int[]> actulTriples = defineNumber.createPifagorTriaples(10);
		
		
	}

}
