package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import seleniumBase.BaseClass;

public class LoginPages extends BaseClass{
	//RemoteWebDriver driver;

	// Lobel validation
	public boolean getUserNameLabel() {
		return driver.findElement(By.xpath("(//table[@class='login']//td)[2]")).isDisplayed();

	}

	public boolean getPassWordLabel() {
		return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[3]/td[1]")).isDisplayed();
	}

	// Action
	/**
	 * @description- get the data form user and type on the user name field
	 * @param username-pass
	 *            the user to be login
	 * @return 
	 */

	public LoginPages enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}

	public LoginPages enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public BookingDetails clickLoing() {
		driver.findElement(By.id("login")).click();
		return new BookingDetails();

	}
	public ForgetPassword forgetPassword() {
		driver.findElement(By.linkText("Forgot Password?")).click();
		return new ForgetPassword();
	}
	
	
		
	

	public void selectdropDown(String lang) {
		// locator
		// new Select(locator).selectByVisibleText(lang);
	}
	public void login(String username,String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoing();
		
	}
}
