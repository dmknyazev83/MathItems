package com.mathitems.sequences.fibonachi;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FibonachiSequenceProcessorTest {
	
	private FibonachiSequenceProcessor processor;
	
	@Before
	public void init(){
		processor = new FibonachiSequenceProcessor();
	}
	
	@Test
	public void getFibonachiNumberTest(){		
		Assert.assertEquals(1, processor.getFibonachiNumber(1));
		Assert.assertEquals(1, processor.getFibonachiNumber(2));
		Assert.assertEquals(3, processor.getFibonachiNumber(4));	
		Assert.assertEquals(21, processor.getFibonachiNumber(8));	
		Assert.assertEquals(144, processor.getFibonachiNumber(12));		
		Assert.assertEquals(6765, processor.getFibonachiNumber(20));	
		Assert.assertEquals(196418, processor.getFibonachiNumber(27));
	}
	
	@Test
	public void getFibonachiRecursionTest(){
		Assert.assertEquals(1, processor.getFibonachiRecursion(1));
		Assert.assertEquals(1, processor.getFibonachiRecursion(2));
		Assert.assertEquals(3, processor.getFibonachiRecursion(4));	
		Assert.assertEquals(21, processor.getFibonachiRecursion(8));	
		Assert.assertEquals(144, processor.getFibonachiRecursion(12));
		Assert.assertEquals(6765, processor.getFibonachiRecursion(20));
		Assert.assertEquals(196418, processor.getFibonachiRecursion(27));
	}
	
	@Test
	public void getFibonachiStreamTest(){
		Assert.assertEquals(1, processor.getFibonachiStream(1));
		Assert.assertEquals(1, processor.getFibonachiStream(2));
		Assert.assertEquals(3, processor.getFibonachiStream(4));	
		Assert.assertEquals(21, processor.getFibonachiStream(8));	
		Assert.assertEquals(144, processor.getFibonachiStream(12));
		Assert.assertEquals(6765, processor.getFibonachiStream(20));
		Assert.assertEquals(196418, processor.getFibonachiStream(27));
	}

}
