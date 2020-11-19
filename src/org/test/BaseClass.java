package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 return driver;

	}
	
	public static void launchURL(String Url) {
		driver.get(Url);

	}

	public static  void pageTitle() {
		String title= driver.getTitle();

	}
	
	public static void pageUrl() {
		String Url= driver.getCurrentUrl();
	}
	public static void fill(WebElement element,String value) {
		

	element.sendKeys(value);
}
	
	public static void bttnclick(WebElement element) {
		element.click();
	}
}
		
	
