package pageObjectModel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModel2 {
	
	@FindBy(linkText="New User Register Here")
	public static WebElement newRegister;
	
	public static WebElement username;
	
	public static WebElement password;
	
	public static WebElement re_password;
	
	public static WebElement full_name;
	
	public static WebElement email_add;
	
	@FindBy(xpath="//td[@valign='middle']")
	public static WebElement textCopy;
	
	
	
	
	
	
	
	
	
	
	
	
//	public static WebElement login(WebDriver driver) {
//		return driver.findElement(By.id("login"));
	
}
