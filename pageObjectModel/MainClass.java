package pageObjectModel;

import java.sql.DriverAction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.itextpdf.text.pdf.BarcodeEAN;

public class MainClass {
	BarcodeEAN code = new BarcodeEAN();

	@Test
	private void testCase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets");
		
		PageObjectModel.from(driver).sendKeys("Chennai");
		PageObjectModel.to(driver).sendKeys("Borivali East, Mumbai");
		PageObjectModel2.dateSearch(driver).sendKeys("20/12/2022");
		PageObjectModel2.searchh(driver).click();
		
		driver.quit();
		
	}
}














// PageObjectModel.userName(driver).sendKeys("durairaj");
// PageObjectModel.passWord(driver).sendKeys("56354");
// PageObjectModel.nextpage(driver).click();
// WebElement findElement = driver.findElement(By.id("email"));
// findElement.sendKeys("1234");
//
// WebElement findElement2 = driver.findElement(By.id("pass"));
// findElement2.sendKeys("jflfj");
//
// WebElement findElement3 = driver.findElement(By.id("loginbutton"));
// findElement3.click();
//
//
// }
