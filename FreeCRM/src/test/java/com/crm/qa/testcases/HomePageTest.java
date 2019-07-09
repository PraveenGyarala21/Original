package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	ContactsPage contactsPage;
	
	
	public HomePageTest() {
		
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.verifyLogin();
		
	}
	
	
	@Test(priority = 1)
	public void m1() {
		
		 contactsPage = homePage.clickSatish();
		
	
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	

}
