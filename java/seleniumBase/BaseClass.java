package seleniumBase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static RemoteWebDriver driver=null;
	String url="http://adactinhotelapp.com/";
	@BeforeMethod
	public void setAp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	@AfterMethod
	public void closeApp() {
		driver.quit();

	}
}
