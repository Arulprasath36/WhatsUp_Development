package pageObjectModel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel1 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
}
