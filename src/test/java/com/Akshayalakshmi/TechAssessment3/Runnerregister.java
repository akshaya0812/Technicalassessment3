package com.Akshayalakshmi.TechAssessment3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\cucumberfeature\\Register.feature",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},glue="com.Akshayalakshmi.TechAssessment3") 

public class Runnerregister extends AbstractTestNGCucumberTests {
	

}


