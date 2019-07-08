package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	
	public LoginPageTest() {
		
		super();
	}
	
	
	@BeforeTest
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	
	@Test
	public void loginPageTitleTest() {
		
		String actualTitle = loginPage.getLoginPageTitle();
		
		Assert.assertEquals(actualTitle, loginPage.title, "LoginPage title not matched");
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
