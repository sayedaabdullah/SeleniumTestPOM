package com.pom.base;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestBase {
	Random ran = new Random();
	File file;
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest testLog;
	@BeforeClass
	public void reportInit() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Infixtech.com");
		extent.setSystemInfo("Environment", "Staging Environment");
		extent.setSystemInfo("User Name", "Reaz Patwary");
		
		htmlReporter.config().setDocumentTitle("Adhock Test Reporter");
		htmlReporter.config().setReportName("Adhock Test Reporter");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	@AfterClass
	public void reportClose() {
		extent.flush();
		
	}
	@BeforeMethod
	public void testStart() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.broadleafcommerce.org/");
		// String title = driver.getTitle();
		// System.out.println(title);
		String value = driver.findElement(By.xpath("//h2[contains(text(),'HOT SAUCE AFICIONADO?')]")).getText();
		System.out.println(value);
		Assert.assertNotSame("HOT SAUCE AFICIONADO?", value);
		driver.manage().window().fullscreen();
	}

	@AfterMethod
	public void testFinish() {
		// driver.close();
		// driver.quit();
	}
	public void captureScreen() throws IOException{
        String str = System.getProperty("user.dir") + "/test-output/"; // Current dir
        System.out.println(str);
        file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken to "+ str);
       // FileUtils.copyFile(file, new File("screenshort"+ran.nextInt()+".png"));
        FileUtils.copyFile(file, new File("screenshort.png"));
	}
	
	public String getFilePath() {
		return file.getPath();
	}
}

