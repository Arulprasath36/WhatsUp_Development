package pageObjectModel3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataProviderXlSheet.DataProviderStore;
import pageObjectModel3.PageObjectModel1;

public class MainClass extends DataProviderStore {
	@Test(dataProvider = "login")
	public void testCase(String data[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
		PageFactory.initElements(driver, PageObjectModel1.class);
		PageFactory.initElements(driver, PageObjectModel2.class);
 
		PageObjectModel1.password.sendKeys(data[0]);
		PageObjectModel1.username.sendKeys(data[1]);
		PageObjectModel2.login.click();
		
		driver.quit();
		
		

	}
}
