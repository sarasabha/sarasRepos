package testng;

import org.testng.annotations.Test;

import org.testng.Reporter;

public class tstng {
	@Test
	public void tc1()
	{
		Reporter.log("hi", true);
		Reporter.log("hi", false);
		
		
		
	}
}
