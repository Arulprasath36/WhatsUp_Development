package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel2 {
	public static WebElement dateSearch(WebDriver driver) {
		return driver.findElement(By.id("txtOnwardCalendar"));
	}

	public static WebElement searchh(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']"));

	}

}
