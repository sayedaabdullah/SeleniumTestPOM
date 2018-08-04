package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	 WebDriver driver;

	@BeforeClass
	public static void testSetup() {
		 WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();	
	}
	@BeforeMethod
	public void broserSetup() {
		//System.setProperty("webdriver.gecko.driver","driver/geckodriver");
		 driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void signUpTest()  {
		driver.get("https://demo.broadleafcommerce.org/");
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("reaz@infixtech.com");
	}
	@AfterMethod
	public void teardown() {
		// driver.close();
		// driver.quit();
	}

}
