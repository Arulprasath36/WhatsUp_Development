package simplepratise;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7 {
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
	public void openBrowser() {
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}
	///////////////////////////////////////////////////////////////////////

	@Test
	@Parameters("name")
	public void testCase1(String n) {
		WebElement findElement = driver.findElement(By.xpath("(//span[text()='First name:']/following::input)[1]"));
		findElement.sendKeys(n);
	}

	@Test
	@Parameters("pass")
	public void testCase2(String p) {
		// TODO Auto-generated method stub
		WebElement findElement2 = driver.findElement(By.xpath("(//span[text()='Last name:']/following::input)[1]"));
		findElement2.sendKeys(p);

	}
	/////////////////////////////////////////////////////////////////////

	@AfterMethod
	public void currentUrl() {
		// TODO Auto-generated method stub
		System.out.println(driver.getCurrentUrl());
	}

	@AfterClass
	public void driverquit() {
		System.out.println("this is dumy");
	}

	@AfterTest
	public void driverClose() {
		driver.quit();
	}
}
