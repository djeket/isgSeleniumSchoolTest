package isg1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsgStudentsSchoolTest extends IsgStudentsSchoolBaseTest {

	@Test(priority = 0)
	public void testURL() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		Thread.sleep(2000);		
		String expected = "ISG Weekend Registration";
		String actual = getWebDriver().getTitle();		
		Assert.assertEquals(expected, actual);
		Thread.sleep(3000);
		
		getWebDriver().quit();
	}
	
	@Test(priority = 1)
	public void testStudentEnrollment() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a"))
				.click();
		Thread.sleep(2000);
		getWebDriver().findElement(By.linkText("Create New Account!")).click();
		Thread.sleep(2000);
		getWebDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("Salif Keita");
		getWebDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("skeita");
		getWebDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("skeita");
		getWebDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(true, true);
		// driver.findElement(By.linkText("I have an Account!")).click();
		Thread.sleep(3000);
		// driver.findElement(By.linkText("I have an Account!")).click();
		
		getWebDriver().quit();
	}

	@Test(priority = 2)
	public void testUserLogin() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a"))
				.click();
		// enter username and password
		getWebDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("amy");
		getWebDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("1962");

		// click to sign in
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-login/div/div/form/button")).click();
		Thread.sleep(3000);
		String expected = "ISG Weekend School Enrollment Wep Application";			
		String actual = getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-welcome/div/h4")).getText();
		
		System.out.println("expected: " + expected);
		System.out.println("actual: " + actual);
		assertEquals(actual, expected);
		
		getWebDriver().quit();
	}
	
	@Test(priority = 3)
	public void testNewStudentEnrollement() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a"))
				.click();
		// enter username and password
		getWebDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("amy");
		getWebDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("1962");

		// click to sign in
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-login/div/div/form/button")).click();
		Thread.sleep(3000);

		// students new rnrollement
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-welcome/div/div/div[3]/a")).click();
		//// Contact Information Form
		// full name
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[1]/div[1]/input"))
				.sendKeys("Morifere toure");
		// relationship Student
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[1]/div[2]/input"))
				.sendKeys("Father");
		// primary phone number
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[2]/div[1]/input"))
				.sendKeys("301-432-0000");
		// primary email
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[2]/div[2]/input"))
				.sendKeys("Toure@gmail.com");
		// Alter Phone number
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[3]/div[1]/input"))
				.sendKeys("514-432-0000");
		// Alt Email
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[3]/div[2]/input"))
				.sendKeys(" Mor@gmail.com");

		// Student1 Information

		// FirstName
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[1]/div[1]/input"))
				.sendKeys("Adama");
		// Midle Name
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[1]/div[2]/input"))
				.sendKeys("Moriba");
		// Last name
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[1]/div[3]/input"))
				.sendKeys("Toure");
		// Gender
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[2]/div[1]/select"))
				.sendKeys("Male");
		// Date of Birth
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[2]/div[2]/input"))
				.sendKeys("01/14/2010");
		// Ages

		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[2]/div[3]/input"))
				.sendKeys("12");
		// allergies
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[3]/div/textarea"))
				.sendKeys("chocolate");
		// Class Days
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[4]/div[1]/select"))
				.sendKeys("Sartuday");
		// Class Acording To Ages Group
		getWebDriver()
				.findElement(By.xpath(
						"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[4]/div[2]/select"))
				.sendKeys("Proficient");
		// Parent Guardian/Parent Full Name

		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[1]/div/input"))
				.sendKeys("Yousouf Toure");
		// Adress one
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[2]/div[1]/input"))
				.sendKeys("1254 Fall Rd");
		// Addres Two
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[2]/div[2]/input"))
				.sendKeys("215 Elm st");
		// city
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[3]/div[1]/input"))
				.sendKeys("Boyds");
		// State
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[3]/div[2]/input"))
				.sendKeys("MD");
		// Zip code
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[3]/div[3]/input"))
				.sendKeys("20800");
		// email
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[4]/div[1]/input"))
				.sendKeys("you@gmail.com");
		// Phone
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[4]/div[2]/input"))
				.sendKeys("632-432-1100");
		// Alt Email
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[5]/div[1]/input"))
				.sendKeys("tou@gmail.com");
		// Alt Phone
		getWebDriver().findElement(By.xpath(
				"//html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[5]/div[2]/input"))
				.sendKeys("240-432-6666");
		// Relationship To Student
		getWebDriver().findElement(By.xpath(
				"/html/body/app-root/div/app-contact/div/div/form/div[4]/div/div[2]/div[5]/div/div/div/div[6]/div/input"))
				.sendKeys("Uncle");
		// save form
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/form/div[6]/button[1]")).click();
		
		getWebDriver().quit();
		
	}
	
	@Test(priority = 4)
	public void testDeleteExistingStudent() throws InterruptedException {
		getWebDriver().get("http://angular-project-isg.s3-website-us-east-1.amazonaws.com");
		getWebDriver().findElement(By.xpath("/html/body/app-root/div/app-main/div/div/div[2]/div/span[2]/h3/a"))
				.click();
	
		// TO DO:
		String expected = null;			
		String actual = null;
		
		System.out.println("expected: " + expected);
		System.out.println("actual: " + actual);
		assertEquals(actual, expected);
		
		getWebDriver().quit();
	}
}