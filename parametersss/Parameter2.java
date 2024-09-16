package parametersss;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
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
		driver.navigate().to("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
	}
	
	
	
	
	

	@Test
	public void testCase1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement downview = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		js.executeScript("arguments[0].scrollIntoView(true)", downview);

	}
	@Test
	@Parameters({"durai"})
	public void testCase2(String st1) {
		WebElement text1 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		text1.sendKeys(st1);
	}
	@Test
	@Parameters({"raj"})
	public void testCase3(String st2) {
		WebElement text2 = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		text2.sendKeys(st2);
	}
	@Test
	public void testCase4() {
		WebElement sum = driver.findElement(By.xpath("//button[text()='Get Sum']"));
		sum.click();

	}

	
	
	
	
	
	
	
	@AfterMethod
	public void currentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	@AfterClass
	public void driverclose() {
		System.out.println("dumy");
	}

	@AfterTest
	public void driverquit() {
		driver.quit();
	}

}
