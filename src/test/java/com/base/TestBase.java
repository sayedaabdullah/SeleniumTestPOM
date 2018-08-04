package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestBase {
	public WebDriver driver;
	@BeforeMethod
	public void testStart() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.broadleafcommerce.org/");
		//String title = driver.getTitle();
		//System.out.println(title);
		String value = driver.findElement(By.xpath("//h2[contains(text(),'HOT SAUCE AFICIONADO?')]")).getText();
		System.out.println(value);
		Assert.assertNotSame("HOT SAUCE AFICIONADO?", value);
		driver.manage().window().fullscreen();
	}
	@AfterMethod
	public void testFinish() {
		//driver.close();
		//driver.quit();
	}


}
