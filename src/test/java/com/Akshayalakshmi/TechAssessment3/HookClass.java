package com.Akshayalakshmi.TechAssessment3;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HookClass {
	
	
	@After
	public static void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",scenario.getName());
		}
		HelperClass.tearDown();
	}
	}


