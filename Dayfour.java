package simplepratise;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dayfour {
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
		driver.get("http://adactinhotelapp.com/");
	}
	@Test
	public void testCase() {
		driver.findElement(By.xpath("(//input[@class='login_input'])[1]")).sendKeys("sdurairaj321");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("987654hi");
	}
	@Test
	public void testCase2() {
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//td[@align='center']//a)[1]"));
		String text = findElement.getText();
		System.out.println(text);
	}
	@AfterMethod
	public void getCurrenurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@AfterClass
	public void quitpage() throws InterruptedException {
		Thread.sleep(3000);
	}

}
