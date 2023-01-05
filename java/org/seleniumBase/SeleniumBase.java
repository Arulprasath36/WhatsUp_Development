package org.seleniumBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumBase implements SeleniumApi {

	long timeOuts = 10; //30
	long maxWaitTime =10;

    RemoteWebDriver driver = null;
	WebDriverWait wait = null;

	public void setUp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofSeconds(timeOuts));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
	}

	public void setUp(Browser browserName, String url) {
		switch (browserName) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		default:
			System.err.println("Driver is not defined");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofSeconds(timeOuts));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public WebElement element(Locators type, String value) {
		try {
			switch (type) {
			case id:
				return driver.findElement(By.id(value));
			case name:
				return driver.findElement(By.name(value));
			case xpath:
				return driver.findElement(By.xpath(value));
			case link:
				return driver.findElement(By.linkText(value));
			case className:
				return driver.findElement(By.className(value));
			case css:
				return driver.findElement(By.cssSelector(value));
			default:
				break;
			}
		}catch (NoSuchElementException e) {
			System.err.println("Element not found => "+e.getMessage());
			throw new NoSuchElementException("Element not found");
		}catch(WebDriverException e) {
			System.err.println(e.getMessage());
			throw new WebDriverException("Some unknown webdriver error");
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	public void switchToWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(i));
	}
	// TODO: function to check if the dropdown is selected ?

	public void selectValue(WebElement ele, String value) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByValue(value);
		
	}

	public void selectText(WebElement ele, String text) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByVisibleText(text);
	}

	public void selectIndex(WebElement ele, int position) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByIndex(position);
	}

	public void click(WebElement ele) {
		WebElement element = wait
				.withMessage("Element is not clickable")
				.until(ExpectedConditions
						.elementToBeClickable(ele));
		element.click();
	}

	public void type(WebElement ele, String testData) {
		try {
			WebElement element = isElementVisible(ele);
			element.clear();
			element.sendKeys(testData);
		} catch (NullPointerException e) {
			System.out.println("Element might be null => " +e.getMessage());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private WebElement isElementVisible(WebElement ele) {
		WebElement element = wait.
				withMessage("Element is not visible")
				.until(
						ExpectedConditions
						.visibilityOf(ele));
		return element;
	}
	public void type(WebElement ele, String testData, Keys keys) {
		WebElement element = isElementVisible(ele);
		element.clear();
		element.sendKeys(testData, keys);
	}

	public void appendText(WebElement ele, String testData) {
		WebElement element = isElementVisible(ele);
		element.sendKeys(testData);

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}
	}
