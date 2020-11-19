package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.get("https://www.facebook.com/");
	WebElement username=wd.findElement(By.id("email"));
	username.sendKeys("facebook");
	}

}
