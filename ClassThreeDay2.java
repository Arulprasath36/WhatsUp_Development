package simpletest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassThreeDay2 {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void browserLunch() {
		driver.get("https://www.google.com/");
	}
	@Test
	public void testCase() {
		WebElement findElement = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		findElement.sendKeys("greentechnology");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void getCurrent() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@AfterClass
	public void quitPages()
	{
		driver.quit();
	}
	
	
	

}
