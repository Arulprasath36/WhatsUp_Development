package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataproviderr.Child;

public class Main2 extends Child {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		}
	@BeforeMethod
	public void browserLaunch() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider="login")
	public void testCase(String username[]) {
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(username[0]);
		
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys(username[1]);
	}
	@AfterMethod
	public void currenUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	@AfterTest
	public void driverQuit() {
		driver.quit();
	}
	

}
