package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	
	public LoginPageTest() {
		
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	
	@Test(priority = 1, enabled = false)
	public void loginPageTitleTest() {
		
		String actualTitle = loginPage.getLoginPageTitle();
		
		Assert.assertEquals(actualTitle, loginPage.title, "LoginPage title not matched");
	}
	
	
	@Test(priority = 2, enabled = false)
	public void emailFieldExistTest(){
	
		boolean emailExist = loginPage.verifyEmailFieldExist();
		
		Assert.assertTrue(emailExist);
		
	}
	
	
	@Test(priority = 3, enabled = false)
	public void passwordFieldExistTest(){
		
		boolean passwordExist = loginPage.verifyPasswordExist();
		
		Assert.assertTrue(passwordExist);
	}
	
	
	@Test(priority = 4, enabled = false)
	public void loginButtonExistTest(){
		
		boolean loginButtonExist = loginPage.verifyLoginButtonExist();
		
		Assert.assertTrue(loginButtonExist);
	}
	
	
	@Test(priority = 5, enabled = false)
	public void clikForgotLinkTest(){
		 
	boolean resetPasswordButtonExist = loginPage.clickForgotLink();
	
	Assert.assertTrue(resetPasswordButtonExist);
	
	}
	
	
	@Test(priority = 6, enabled = false)
	public void clickSignUpLinkTest(){
		
		boolean signUpButtonExist = loginPage.clickSignUpLlink();
		
		Assert.assertTrue(signUpButtonExist);
	}
	
	
	@Test(priority = 7)
	public void loginTest() throws Exception {
		
		homePage = loginPage.verifyLogin();
		
		Thread.sleep(2000);
		
		String  homeHeaderText = driver.findElement(By.xpath(homePage.homePageHeader)).getText();
		
		Assert.assertEquals(homeHeaderText, "Deals Summary", "Not matched HomePage header text");
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
