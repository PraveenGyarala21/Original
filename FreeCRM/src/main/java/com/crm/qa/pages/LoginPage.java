package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	// Xpath for all elements in Login Page
	
	String email_Field = "//input[@name='email']";
	
	String password_Field = "//input[@name='password']";
	
	String login_Button = "//div[text()='Login']";

	String forgot_Password_Link = "//a[contains(text(),'Forgot your password?')]";
	
	String signUp_Link = "//a[contains(text(),'Sign Up')]";
	
	public String title = "CRM";
	
	
	
	
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
		
	}
	
	
	public  boolean verifyEmailFieldExist() {
		
		boolean emailFieldExist  = driver.findElement(By.xpath(email_Field)).isDisplayed();
		
		return emailFieldExist;
	}
	
	
	public boolean verifyPasswordExist() {
		
		boolean passwordFieldExist = driver.findElement(By.xpath(password_Field)).isDisplayed();
		
		return passwordFieldExist;
	}
	
	
	public void verifyLogin() {
		
		driver.findElement(By.xpath(email_Field)).sendKeys(prop.getProperty("userName"));
		
		driver.findElement(By.xpath(password_Field)).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(login_Button)).click();
	}
	
	
	
	

}
