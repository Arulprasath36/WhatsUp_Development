package simplepratise;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itextpdf.text.pdf.BarcodeEAN;

public class ClassDemo {
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
	public void browserLaunch() {
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805640%7Cb%7Cfb%20create%20account%7C&placement=&creative=550525805640&keyword=fb%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-332264388364%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAp7GcBhA0EiwA9U0mthjBxl43F-J6cdpIUnSCYQxvXF2DXpPNWzJ624RVPJ9NhRCEiQcHQhoCwKkQAvD_BwE");	
	
	}
	@Test()
	public void testCase1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("durai");
		
	}
	@Test()
	public void testCase2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("raj");
		
	}
	@Test()
	public void testCase3() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("9345755");
		
	}
	@Test()
	public void testCase4() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("123456");
		
	}
	@Test()
	public void testCase5() throws InterruptedException {
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[1]"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("4");
		
	}
	@Test
	private void testCase6() {
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[2]"));
		Select s2=new Select(dropdown2);
		s2.selectByVisibleText("Oct");	
	}
	@Test
	private void testCase7() {
		WebElement dropdown3 = driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[3]"));
		Select s3=new Select(dropdown3);
		s3.selectByVisibleText("2018");
	}
	@Test
	private void testCase8() {
		WebElement radio = driver.findElement(By.xpath("//label[text()='Male']"));
		radio.click();
	}
	@Test
	private void testCase9() {
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}
	@AfterMethod
	public void currenUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	@AfterClass
	public void quitPage() {
		driver.quit();
		
	}
}
