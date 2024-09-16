package parametersss;

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

public class Parameter {
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
		 driver.navigate().to("https://www.facebook.com/");
	 	}
	 @Test
	 @Parameters({"username"})
	 	public void testCase1(String name) {
		 WebElement firstTesxt = driver.findElement(By.id("email"));
		 firstTesxt.sendKeys(name);
		}
	 @Test
	 @Parameters({"password"})
	 	public void testCase2(String pass) {
		 WebElement second = driver.findElement(By.id("pass"));
		 second.sendKeys(pass);
		}
	 @Test
	 public void testCase3() {
		 WebElement button = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]"));		 
		 button.click();
	}
	 @AfterMethod
	 public void currentUrl() {
		 System.out.println(driver.getCurrentUrl());
		 System.out.println("im run before afterclass");
	}
	 @AfterClass
	 public void driverclose() {
		 System.out.println("this anatation for driver close");
	}
	 @AfterTest
	 public void driverquit() {
		 driver.quit();
	}
	 
	
	 

}
	
