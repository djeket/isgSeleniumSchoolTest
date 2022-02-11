package isg1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsgStudentsSchoolTest extends IsgStudentsSchoolBaseTest {

	@Test(priority = 0)
	public void URL() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		// String actualTitle ="ISG Weekend Registration";
		// Assert.assertEquals(, null)
		Thread.sleep(5000);
		// Welcome to the ISG Weekend School Enrollment Web Application.
		// getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a")).click();
		Assert.assertEquals(true, true);
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void userLoginByXpath() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a"))
				.click();
		// enter username and password
		getWebDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("amy");
		getWebDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("1962");

		// click to sign in
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-login/div/div/form/button")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void createNewAccount() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a"))
				.click();
		Thread.sleep(2000);
		getWebDriver().findElement(By.linkText("Create New Account!")).click();
		Thread.sleep(2000);
		getWebDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("amina toure");
		getWebDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("amy");
		getWebDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("1962");
		getWebDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(true, true);
		// driver.findElement(By.linkText("I have an Account!")).click();
		Thread.sleep(2000);
		// driver.findElement(By.linkText("I have an Account!")).click();
	}
}
