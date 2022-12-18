package pageObjectModel3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjectModel3.PageObjectModel1;

public class MainClass {
	@Test()
	public void testCase() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
		PageObjectModel1.username(driver).sendKeys("durairaj112");
		PageObjectModel1.password(driver).sendKeys("password@123");
		PageObjectModel2.login(driver).click();
		
		driver.quit();
		
		

	}
}
