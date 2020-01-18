package com.assignment1.testcases;

import org.testng.annotations.Test;

import com.assignment.constants.BrowserOperations;
import com.assingment.implement.IphonePricingImplements;

public class IphonePricingTestcase extends BrowserOperations {
	
	@Test
	public void IphonePricingTest() throws Exception
	{
		IphonePricingImplements ip=new IphonePricingImplements();
		ip.amazoniphone();
		ip.flipkartiphone();
		ip.validation();
		
	}

}
