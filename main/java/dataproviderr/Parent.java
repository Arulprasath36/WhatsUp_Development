//package dataproviderr;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//// IT IS CHILD CLASS IMPLEMENTING CLASS 3
//public class Parent extends Child{
//	@Test(dataProvider = "login")
//
//	public void logIn(String data[]) {
//
//	//	System.out.println("emaillocator" + email + "passlocator" + pass);
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/login/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement findElement = driver.findElement(By.id("email"));
//		findElement.sendKeys(data[0]);
//		WebElement findElement2 = driver.findElement(By.id("pass"));
//		findElement2.sendKeys(data[1], Keys.TAB, Keys.TAB, Keys.ENTER);
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.quit();
//
//	}
//
//}
