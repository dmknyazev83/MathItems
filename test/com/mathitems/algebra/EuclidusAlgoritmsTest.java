package com.mathitems.algebra;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EuclidusAlgoritmsTest {
	
	private EuclidusAlgoritms euclidus;
	
	@Before
	public void init(){
		euclidus = new EuclidusAlgoritms();
	}
	
	@Test
	public void findGreatCommonDelimiterTest(){
		Assert.assertEquals(6, euclidus.findGreatCommonDelimiter(30, 18));
		Assert.assertEquals(6, euclidus.findGreatCommonDelimiter(18, 30));		

		Assert.assertEquals(8, euclidus.findGreatCommonDelimiter(56, 32));
		Assert.assertEquals(8, euclidus.findGreatCommonDelimiter(32, 56));
		
		Assert.assertEquals(13, euclidus.findGreatCommonDelimiter(13, 169));
		Assert.assertEquals(13, euclidus.findGreatCommonDelimiter(169, 13));
	}
	
	@Test
	public void findGreatCommonDelimiterSubstractionTest(){
		Assert.assertEquals(6, euclidus.findGreatCommonDelimiterSubstraction(30, 18));
		Assert.assertEquals(6, euclidus.findGreatCommonDelimiterSubstraction(18, 30));		

		Assert.assertEquals(8, euclidus.findGreatCommonDelimiterSubstraction(56, 32));
		Assert.assertEquals(8, euclidus.findGreatCommonDelimiterSubstraction(32, 56));
		
		Assert.assertEquals(13, euclidus.findGreatCommonDelimiterSubstraction(13, 169));
		Assert.assertEquals(13, euclidus.findGreatCommonDelimiterSubstraction(169, 13));
	}

}
