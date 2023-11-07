package com.Akshayalakshmi.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement clicklogin;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginButton;
	@FindBy(xpath = "//a[@class='account'][1]")
	WebElement verifyemail;
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logout;
	
	
	
	
	
	
	
	
	

}
