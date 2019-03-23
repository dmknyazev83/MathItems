package com.mathitems.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ArraysGeneratorTest {
	
	private ArraysGenerator generator;
	
	@Before
	public void init(){
		generator = new ArraysGenerator();
	}
	
	@Test
	public void generateIntArrWithMissedNumberTest(){
		int[] res1 = generator.generateIntArrWithMissedNumber(3, 10);
		OptionalInt missedValue1 = Arrays.stream(res1).filter(item -> item == 3).findFirst();
		Assert.assertFalse(missedValue1.isPresent());
		int[] res2 = generator.generateIntArrWithMissedNumber(1, 10);
		OptionalInt missedValue2 = Arrays.stream(res2).filter(item -> item == 1).findFirst();
		Assert.assertFalse(missedValue2.isPresent());
	}

}
