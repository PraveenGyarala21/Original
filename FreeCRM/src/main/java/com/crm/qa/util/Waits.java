package com.crm.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
			
	
	
	
	}
}
