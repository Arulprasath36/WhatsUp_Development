package pageObjectModel4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import DataProviderXlSheet.DataProviderStore;

public class MainClass {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void urlSet() {
		driver.get("http://adactinhotelapp.com/");
		PageFactory.initElements(driver, pageObjectModel1.class);
		PageFactory.initElements(driver, PageObjectModel22.class);

	}

	public void login() {
		pageObjectModel1.username.sendKeys("Theanraj");
		pageObjectModel1.password.sendKeys("Theanraj@123");
		pageObjectModel1.login.click();

	}

	@Test()
	public void loginTestCase() {
		login();

		WebElement locaTion = PageObjectModel22.locaTion(driver);
		Select select = new Select(locaTion);
		select.selectByIndex(1);

		WebElement hotels = PageObjectModel22.hotels;
		Select select2 = new Select(hotels);
		select2.selectByIndex(1);

		WebElement room_type = PageObjectModel22.room_type;
		Select select3 = new Select(room_type);
		select3.selectByIndex(1);

		WebElement room_nos = PageObjectModel22.room_nos;
		Select select4 = new Select(room_nos);
		select4.selectByIndex(1);

		PageObjectModel22.datepick_in.sendKeys("25/12/2022");

		PageObjectModel22.datepick_in.sendKeys("30/10/2022");

		WebElement adult_room = PageObjectModel22.adult_room;
		Select select5 = new Select(adult_room);
		select5.selectByIndex(1);

		WebElement adult_room2 = PageObjectModel22.Adult_room;
		Select select6 = new Select(adult_room2);
		select6.selectByIndex(1);

		WebElement child_room = PageObjectModel22.child_room;
		Select select7 = new Select(child_room);
		select7.selectByIndex(1);

		WebElement submit = PageObjectModel22.Submit;
		submit.click();

	}

	@AfterSuite
	public void driverClose() {
		driver.quit();

	}

}
