package pageObjectModel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel22 {
	public static WebElement locaTion(WebDriver driver) {
		return driver.findElement(By.id("location"));
		
	}
	@FindBy(id="hotels")
	public static WebElement hotels;
	
	public static WebElement room_type;
	
	public static WebElement room_nos;
	
	public static WebElement datepick_in;
	
	public static WebElement datepick_out;
	
	public static WebElement adult_room;
	
	@FindBy(xpath="//select[@id='adult_room']")
	public static WebElement Adult_room;
	
	public static WebElement child_room;
 
	public static WebElement Submit;
	
	
	
	
	
 }