package com.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestBase {
	public WebDriver driver;
	private static final Logger log = LogManager.getLogger(TestBase.class);
	public static ExtentHtmlReporter htmlReporter; 
	 
	// create ExtentReports and attach reporter(s)
	public static ExtentReports extent; 
	// creates a toggle for the given test, adds all log events under it    
	public static ExtentTest test;
	@BeforeClass
	public static void startTest()
	{
		extent = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent.attachReporter(htmlReporter);
	}
	
	@AfterClass
	public void reportClose() {
		extent.flush();
		
	}
	
	@BeforeMethod
	public void testStart() {
		test = extent.createTest("verifyHomePageTitle", "Checking the Title");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("Succefully Open Crome Browser");
		
		// Extent log(Status, details)
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		
		driver.get("https://demo.broadleafcommerce.org/");
		//String title = driver.getTitle();
		//System.out.println(title);
		String value = driver.findElement(By.xpath("//h2[contains(text(),'HOT SAUCE AFICIONADO?')]")).getText();
		System.out.println(value);
		Assert.assertNotSame("HOT SAUCE AFICIONADO?", value);
		driver.manage().window().fullscreen();
		log.info("Making browser full screen");
	}
	@AfterMethod
	public void testFinish() {
		//driver.close();
		log.info("Closing browser tab");
		//driver.quit();
		log.info("Closing browser ");
	}


}
