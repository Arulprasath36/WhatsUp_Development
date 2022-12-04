package simplepratise;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassFive {
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
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void testCase1() {
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[1]")).sendKeys("durai1234123");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]")).sendKeys("0987654");
		
	}
	@Test
	public void testCase2() {
		driver.findElement(By.xpath("//div[@id='login_link']//a[1]")).click();
	}
	@Test
	public void testCase3() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("(//input[@name='email'])[2]")).sendKeys("76543245");
	}
	@AfterMethod
	public void currenURL() {
		System.out.println(driver.getCurrentUrl());
	}
	@AfterClass
	public void pageQuit() {
		driver.quit();
	}
	
}
