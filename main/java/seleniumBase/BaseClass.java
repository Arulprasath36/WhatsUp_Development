package seleniumBase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import dataproviderr.Older;

public class BaseClass {
	public static RemoteWebDriver driver=null;// static pothu use panna once driver object create agidum program mudiravaraium but paralalle excution problem varum
	String url="http://adactinhotelapp.com/";
	
	public String filename="";
	@DataProvider(name="data")
	public String[][] dataProvider()
	{
		String[][] xlData = Older.getXlData(filename);
		return xlData;
	}
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
