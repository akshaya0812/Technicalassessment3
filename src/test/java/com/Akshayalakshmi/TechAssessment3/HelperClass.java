package com.Akshayalakshmi.TechAssessment3;

import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	private static HelperClass helper;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT=10;
	HelperClass(){
		driver=new EdgeDriver();
		wait=new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	     }
	public static void openPage(String url) {
	  	driver.get(url);
	 }
	 public static WebDriver getDriver() {
		return driver;
	}
	 public static void setUpDriver() {
			if (helper==null) {
				helper= new HelperClass();
			}
		}
		public static void tearDown() {
			if(driver!=null) {
				driver.close();
				driver.quit();
			}
			helper=null;
		}
		public static SearchContext getdriver() {
			// TODO Auto-generated method stub
			return null;
		}
		

	}
 


