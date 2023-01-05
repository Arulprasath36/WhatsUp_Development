package org.pages;

import javax.swing.text.Element;

import org.BasePages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.seleniumBase.Locators;
import org.seleniumBase.SeleniumBase;

public class LoginPages extends SeleniumBase {

//	public LoginPages(RemoteWebDriver driver) {
//		this.driver=driver;
		
//	}
	public  boolean usernameLable()
	{
		WebElement element = element(Locators.xpath, "(//td[@align='right'])[1]");
	return	element.isEnabled();
	}
	
	public boolean passwordLable() {
		return element(Locators.xpath, "(//td[@align='right'])[2]").isEnabled();
	}
	
	public boolean loginLable() {
	return	element(Locators.xpath, "(//table[@cellspacing='0']//input)[3]").isEnabled();
	}
	

}





































//public  void enterUserName(String name) {
//	WebElement element = element(Locators.id, "username");
//	type(element, name);
//	
//	
//}
//public void enterPassword(String pass) {
//	WebElement element = element(Locators.id, "password");
//	type(element, pass);
//}
//public void enterLogin() {
//	WebElement element = element(Locators.id, "login");
//	click(element);
//}
//

//public static WebElement clickLogin() {
	//return driver.findElement(By.id("login"));
//public static void getUserLable(String string, String string2) {
//element(string,string2);
////return driver.findElement(By.xpath("(//td[@align='right'])[1]")).isEnabled();
//}
//
//public static boolean getPasswordLable() {
//return driver.findElement(By.xpath("(//td[@align='right'])[2]")).isEnabled();
//}
//
//public static boolean getLoginLable() {
//return driver.findElement(By.xpath("//input[@type='Submit']")).isEnabled();
//}
//

//
//public static void enterUserName(String name) {
//// TODO Auto-generated method stub
//driver.findElement(By.id("username")).sendKeys(name);
//}
//
//public static void enterPassword(String pass) {
//driver.findElement(By.id("password")).sendKeys(pass);
//}
//
//public static void loginClick() {
//driver.findElement(By.id("login")).click();
//}

// public static void LoginTestCase(String name,String pass) {
// enterUserName(name);
// enterPassword(pass);
// loginClick();
// }
//public static void LoginTestCase(String names, String passs) {
//// TODO Auto-generated method stub
//enterUserName(names);
//enterPassword(passs);
//loginClick();
//}
