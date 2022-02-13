package isg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	static WebDriver create(String type, String driverPath) throws IllegalAccessException {
		WebDriver driver;

		switch (type) {

		case "Chrome":
			//This comes first
			System.setProperty("webdriver.chrome.driver", driverPath);
			//This comes second
			driver = new ChromeDriver();
			break;
		case "Firefox":			
			System.setProperty("webdriver.firefox.driver", driverPath);
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalAccessException();
		}

		return driver;
	}
}
