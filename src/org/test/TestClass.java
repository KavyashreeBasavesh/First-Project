package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestClass extends BaseClass {
	
	public static void main(String[] args) {
		
	WebDriver d= 	launchBrowser();
		launchURL("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		WebElement txtUserName= d.findElement(By.id("email"));
		fill(txtUserName, "kavy");
		
	}
	
	
	

}
