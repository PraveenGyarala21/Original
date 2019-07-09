package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	
	public LoginPageTest() {
		
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		
		String actualTitle = loginPage.getLoginPageTitle();
		
		Assert.assertEquals(actualTitle, loginPage.title, "LoginPage title not matched");
	}
	
	
	@Test(priority = 2)
	public void emailFieldExistTest(){
	
		boolean emailExist = loginPage.verifyEmailFieldExist();
		
		Assert.assertTrue(emailExist);
		
	}
	
	
	@Test(priority = 3)
	public void passwordFieldExistTest(){
		
		boolean passwordExist = loginPage.verifyPasswordExist();
		
		Assert.assertTrue(passwordExist);
	}
	
	
	@Test(priority = 4)
	public void loginButtonExistTest(){
		
		boolean loginButtonExist = loginPage.verifyLoginButtonExist();
		
		Assert.assertTrue(loginButtonExist);
	}
	
	
	@Test(priority = 5)
	public void clikForgotLinkTest(){
		 
	boolean resetPasswordButtonExist = loginPage.clickForgotLink();
	
	Assert.assertTrue(resetPasswordButtonExist);
	
	}
	
	
	@Test(priority = 6)
	public void clickSignUpLinkTest(){
		
		boolean signUpButtonExist = loginPage.clickSignUpLlink();
		
		Assert.assertTrue(signUpButtonExist);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
