package org.BasePages;

import java.time.Duration;

import org.dataProvider.Dataprovider;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.seleniumBase.SeleniumBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BasePage extends SeleniumBase {
	public static RemoteWebDriver driver=null;
	String url="http://adactinhotelapp.com/";
	 public String fileName="";
	
	 @DataProvider(name="data")
	public String[][] dataProvider()
	{
		String[][] xlData = Dataprovider.getXlData(fileName);
		return xlData;
	}
	
	@BeforeMethod
	public void startApp() {
		setUp(url);
		
	}
	@AfterMethod
	public void driverQuit() {
		quit();
	}

}




//
//driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.manage().window().maximize();
//driver.get(url);
