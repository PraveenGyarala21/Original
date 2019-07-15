package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	public void assertclass() {
		
		// Comparing two char arrays
		
	/*	char array[] = {'f', 'b', 'c'};
		
		char array1[] = {'a', 'b', 'c'};
		
		Assert.assertEquals(array, array1);*/
		
		
		
		// comparing two boolean arrays
		
		/*boolean array[] = {true};
		
		boolean array1[] = {false};
		
		
		Assert.assertEquals(array, array1);*/
		
		
		// comparing two array
		
		double array[] = {1, 4, 3};
		
		double array1[] = {1, 4.0, 3};
		
		Assert.assertEquals(array, array1);
		
		
	}

}
