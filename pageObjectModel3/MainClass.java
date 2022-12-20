package pageObjectModel3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DataProviderXlSheet.DataProviderStore;
import pageObjectModel3.PageObjectModel1;

public class MainClass extends DataProviderStore {
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
	public void urlSet() {
		driver.get("http://adactinhotelapp.com/");
		PageFactory.initElements(driver, PageObjectModel1.class);
		PageFactory.initElements(driver, PageObjectModel2.class);

	}

	@Test(dataProvider = "login")
	public void testCase(String data[]) {
		PageObjectModel1.username.sendKeys(data[0]);
		PageObjectModel1.password.sendKeys(data[1]);

		PageObjectModel2.newRegister.click();
		PageObjectModel2.username.sendKeys(data[2]);
		PageObjectModel2.password.sendKeys(data[3]);
		PageObjectModel2.full_name.sendKeys(data[4]);
		PageObjectModel2.re_password.sendKeys(data[5]);
		PageObjectModel2.email_add.sendKeys(data[6 ]);
		System.out.println(PageObjectModel2.textCopy.getText());

	}

	@AfterTest
	public void driverClose() {
		driver.quit();
	}
}
