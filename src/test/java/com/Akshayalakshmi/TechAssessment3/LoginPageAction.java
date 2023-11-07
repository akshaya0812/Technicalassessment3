package com.Akshayalakshmi.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {
	
LoginPageLocator logPageLocators=null;
	
	public LoginPageAction() {
		this.logPageLocators=new LoginPageLocator ();
		
		PageFactory.initElements(HelperClass.getDriver(),logPageLocators);
		
	}
		public void clickLoginaction() {
			logPageLocators.clicklogin.click();
		}
		
		public void setEmail(String strEmail) {
			logPageLocators.email.sendKeys(strEmail);
		}
		
		public void setPwd(String strPwd) {
			logPageLocators.password.sendKeys(strPwd);
		}
		
		public void clickingLoginBtn() {
			logPageLocators.loginButton.click();
		}
		
		public String loginVerify() {
			return logPageLocators.verifyemail.getText();
		}
		
		public void clickLogOut() {
			logPageLocators.logout.click();
		}
		
		
		public void loginDetails(String strEmail,String strPwd) {
			setEmail(strEmail);
			setPwd(strPwd);
		}
	
	}


