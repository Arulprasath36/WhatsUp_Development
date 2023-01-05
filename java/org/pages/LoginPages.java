package org.pages;

import javax.swing.text.Element;

import org.BasePages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.seleniumBase.Locators;

public class LoginPages extends BasePage {

//	public LoginPages(RemoteWebDriver driver) {
//		this.driver=driver;
		
//	}
	public boolean usernameLable()
	{
		WebElement element = element(Locators.xpath, "(//td[@align='right'])[1]");
	return	element.isEnabled();
	}

}





































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
