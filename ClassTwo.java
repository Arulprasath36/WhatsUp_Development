package simplepratise;

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

public class ClassTwo {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	}
	@BeforeMethod
	public void webBrowserLaunch() {
		driver.get("https://www.redbus.in/");
	}
	@Test
	public void testCase() {
		 WebElement findElement = driver.findElement(By.xpath("(//input[@class='db'])[1]"));
		 findElement.sendKeys("sholinganllur, chennai");
		 WebElement findElement2 = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		 findElement2.sendKeys("Koyambedu, Chennai");
		 WebElement findElement3 = driver.findElement(By.xpath("(//input[@class='db'])[3]"));
		 findElement3.click();
		 WebElement findElement4 = driver.findElement(By.xpath("//td[text()='9']"));
		 findElement4.click();
		 WebElement findElement5 = driver.findElement(By.xpath("//button[@class='fl button']"));
		 findElement5.click();
		 
	}
	@AfterMethod
	public void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl");
		 
	}
	@AfterClass
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
