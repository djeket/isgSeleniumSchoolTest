package isg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class IsgStudentsSchoolBaseTest {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	@BeforeMethod
	public void setdriver() throws IllegalAccessException {

		WebDriver driver = WebDriverFactory.create("Chrome", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");

		setWebDriver(driver);

	}

	public void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}

	public WebDriver getWebDriver() {
		return dr.get();
	}

	@AfterMethod
	public void aftermethod() {
		getWebDriver().quit();
		dr.set(null);
	}
}
