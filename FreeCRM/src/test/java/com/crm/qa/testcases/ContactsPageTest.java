package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	ContactsPage contactsPage;
	
	
	public ContactsPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		loginPage = new LoginPage();
		
		homePage = loginPage.verifyLogin();
		
		contactsPage = homePage.clickSatish();
	}
	
	
	
	@Test
	public void clickEditTest() {
		
		boolean editMode = contactsPage.clickEditButton();
		
		Assert.assertTrue(editMode);
	
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	

}
