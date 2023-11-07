package com.Akshayalakshmi.TechAssessment3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	@Given (" user will click loginpage")
	public void user_will_click_loginpage() {
		System.out.println("demo web page login");
	    HelperClass.openPage("https://demowebshop.tricentis.com/");
	   
	}
	
	@When("enter the <email> and <password>")
	public void enter_the_email_and_password() {
	    
	   
	}

	@When("enter into the login page")
	public void enter_into_the_login_page() {
	    
	   
	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {
	  
	   
	}

	@Then("error message for invalid user")
	public void error_message_for_invalid_user() {
	   
	   
	}
}
