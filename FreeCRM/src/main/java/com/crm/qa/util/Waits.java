package com.crm.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://mwebware.greythr.com/uas/portal/auth/login?");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement userName  = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='userame']"))));
		
		userName.sendKeys("lfjsdlfjls");
		
		
		
			
	
	
	
	}
}
