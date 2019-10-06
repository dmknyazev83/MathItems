package com.mathitems.arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ArraysProcessorTest {
	
	private ArraysProcessor processor;
	private ArraysGenerator generator;
	
	@Before
	public void init(){
		processor = new ArraysProcessor();
		generator = new ArraysGenerator();
	}
	
	@Test
	public void findMissedValueInArrayTest(){
		int missedVal1 = 5;
		int[] val1 = generator.generateIntArrWithMissedNumber(missedVal1, 10);
		int actualMissed1 = processor.findMissedValueInArray(val1);
		Assert.assertEquals(missedVal1, actualMissed1);
		int missedVal2 = 1;
		int[] val2 = generator.generateIntArrWithMissedNumber(missedVal2, 10);
		int actualMissed2 = processor.findMissedValueInArray(val2);
		Assert.assertEquals(missedVal2, actualMissed2);
		int missedVal3 = 8;
		int[] val3 = generator.generateIntArrWithMissedNumber(missedVal3, 10);
		int actualMissed3 = processor.findMissedValueInArray(val3);
		Assert.assertEquals(missedVal3, actualMissed3);
	}

}
