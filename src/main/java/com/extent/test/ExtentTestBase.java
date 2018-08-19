package com.extent.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ExtentTestBase {
	public WebDriver driver;
	
	public static ExtentHtmlReporter htmlReporter;  
	public static ExtentReports extent;     
	public static ExtentTest test;
	
	@BeforeClass
	public static void testReport() {
		htmlReporter = new ExtentHtmlReporter("TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@AfterClass
	public void reportFinish() {
		extent.flush();
	}
	
	@BeforeMethod
	public void testStart() {
		test = extent.createTest("registrationTest", "Registration feature");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test.log(Status.INFO, "Opening Chrome Browser");
		driver.get("https://demo.broadleafcommerce.org/");
		test.log(Status.INFO, "Open Braodleaf web applicatopm");
		String value = driver.findElement(By.xpath("//h2[contains(text(),'HOT SAUCE AFICIONADO?')]")).getText();
		System.out.println(value);
		Assert.assertNotSame("HOT SAUCE AFICIONADO?", value);
		driver.manage().window().fullscreen();
		
	}
	@AfterMethod
	public void testFinish() {
		driver.close();
		test.log(Status.INFO, "closing the browser");
		driver.quit();
		test.log(Status.INFO, "quiting Selenium");
		
	}


}
