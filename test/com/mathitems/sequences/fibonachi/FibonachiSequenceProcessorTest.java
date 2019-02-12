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
	}

}
