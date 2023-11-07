package com.Akshayalakshmi.TechAssessment3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;

public class Registerstepdefinition {
	
	HelperClass helperClass = new HelperClass();
	RegisterPageAction regAction = new RegisterPageAction();
	
	   
	
	
	@Given("click to register to enter the details")
	public void click_to_register_to_enter_the_details() {
		System.out.println("demo web page register");
	    helperClass.openPage("https://demowebshop.tricentis.com/");
	   
	
	}

	@When("click the radio button")
	public void click_the_radio_button() {
		regAction.clickRegister();
	    
	}

	@When("enter the first name,last name,email,password,confirm password")
	public void enter_the_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String,String>> registerForm = dataTable.asMaps(String.class, String.class);
	    for(Map<String,String> form : registerForm) {
	    	String gender = form.get("Gender");
	    	String firstname = form.get("FirstName");
	    	String lastname = form.get("LastName");
	    	String email = form.get("Email");
	    	String password = form.get("Password");
	    	String cpassword = form.get("Confirm Password");
	    }
	}

	@When("click register")
	public void click_register() {
		regAction.clickRegisterButton();
	  
	    
	}

	@Then("register the page successfully")
	public void register_the_page_successfully() {
		Assert.assertTrue(regAction.getVerifyText().equals("Your registration completed"));
    	regAction.clickLogout();
	    
	}





}
