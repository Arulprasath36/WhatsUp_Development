package pageObjectModel3;

import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.itextpdf.text.pdf.BarcodeEAN;

public class Log4jTest {
	BarcodeEAN code = new BarcodeEAN();

	public static void main(String[] arg) {
		Logger demologger = LogManager.getLogger(Log4jTest.class.getName());
		demologger.info("this is info statement");
		demologger.error("this is error statement");
		demologger.debug("this is debug statement");
		demologger.fatal("this is fatal statement");

	}
}

// you should add the xml folder to the project

