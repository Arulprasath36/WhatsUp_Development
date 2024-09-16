package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ForgetPassword {
	RemoteWebDriver driver;
	public void clickForgetPassword() {
		driver.findElement(By.linkText("Forgot Password?")).click();
	}

}
