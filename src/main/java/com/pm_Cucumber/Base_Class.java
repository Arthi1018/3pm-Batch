package com.pm_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver browser_Launch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\OneDrive\\Desktop\\Commons io\\chromedriver.exe");
		driver=new ChromeDriver(); //local variable
        driver.manage().window().maximize();
        return driver;
	}
	public static void url(String url) {
    driver.get(url);		
	}
	
	public static void sendkeys(WebElement element, String input) {
    element.sendKeys(input);
	}
	public static void dropdown(WebElement element, String text, String value) {
		Select s=new Select(element);
		if (text.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if (text.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}else {
			int ind = Integer.parseInt(value);
			s.selectByIndex(ind);
		}

	}
	
	public static void click(WebElement element) {
     element.click();
	}
	public static void close() {
       driver.close();
	}

}
