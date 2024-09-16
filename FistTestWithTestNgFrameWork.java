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

public class FistTestWithTestNgFrameWork {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void openBrowser() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void signUp() {
		WebElement user = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[1]"));
		user.sendKeys("sduj123");
		WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]"));
		password.sendKeys("12345");
		WebElement log = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]"));
		log.click();
	}
	@AfterMethod
	public void currenUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@AfterClass
	public void quitTest() throws InterruptedException {
		driver.quit();
	}
}
