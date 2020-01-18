package com.assignment2.tripadvisorstestcase;

import org.testng.annotations.Test;

import com.assigment2.constants.BrowserOperations;
import com.assignment2.tripadvisorimplementations.TripadvisorImplementations;

public class TripadvisorTestcase extends BrowserOperations {
	
	@Test
	public void tripAdvisorTest() throws Exception{
		
		TripadvisorImplementations ta=new TripadvisorImplementations();
		ta.tripAdvisor();
		ta.review();
		ta.writingreview();
		ta.review2();
	}

}
