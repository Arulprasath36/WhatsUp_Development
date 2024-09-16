package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.itextpdf.text.pdf.BarcodeEAN;

public class PageObjectModel {
	public static WebElement from(WebDriver driver) {
		 return driver.findElement(By.id("txtSource"));
	}

	public static WebElement to(WebDriver driver) {
		return driver.findElement(By.id("txtDestination"));

	}

	

}

// username
// public static WebElement userName(WebDriver driver) {
// return driver.findElement(By.id("email"));
// }
// public static WebElement passWord(WebDriver driver) {
// return driver.findElement(By.id("pass"));
// }
// public static WebElement click(WebDriver driver) {
// return driver.findElement(By.id("loginbutton"));
// }
// public static WebElement nextpage(WebDriver driver) {
// return driver.findElement(By.xpath("(//a[contains(@class,'_42ft
// _4jy0')])[1]"));
//
// }
