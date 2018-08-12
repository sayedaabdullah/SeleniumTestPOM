package com.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestBase {
	public WebDriver driver;
	private static final Logger log = LogManager.getLogger(TestBase.class);
	@BeforeMethod
	public void testStart() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("Succefully Open Crome Browser");
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
