package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	
	String editXpath = "(//i[@class='edit icon'])[1]";
	
	public String cancelButtonXpath = "//*[text()='Cancel']";
	
	// Actions
	
	public boolean clickEditButton() {
		
		WebElement  editButton = driver.findElement(By.xpath(editXpath));
		
		editButton.click();
		
		boolean editMode = driver.findElement(By.xpath(cancelButtonXpath)).isDisplayed();
		
		return editMode;
	}

}
