package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	public String homePageHeader = "//div[text()='Deals Summary']";
	
	public String satish = "//a[text()='Satish J']";
	
	
	
	// Actions
	
	public ContactsPage clickSatish() {
		
		WebElement satish1 = driver.findElement(By.xpath(satish));
		
		satish1.click();
		
		return new ContactsPage();
	}
	
	
	
	
	
	
}
