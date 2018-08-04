/**
 * 
 */
package com.test;

import static org.testng.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author reaz
 *
 */
public class BroadleafTest {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeMethod()
	  public void setUp() throws Exception {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testBroadleaf() throws Exception {
		  
	    driver.get("https://demo.broadleafcommerce.org/");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("customer.emailAddress")).clear();
	    driver.findElement(By.id("customer.emailAddress")).sendKeys("reaz@test1234.com");
	    driver.findElement(By.id("customer.firstName")).clear();
	    driver.findElement(By.id("customer.firstName")).sendKeys("Reaz");
	    driver.findElement(By.id("customer.lastName")).click();
	    driver.findElement(By.id("customer.lastName")).clear();
	    driver.findElement(By.id("customer.lastName")).sendKeys("Patwary");
	    driver.findElement(By.xpath("(//input[@id='password'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Test1234");
	    driver.findElement(By.id("passwordConfirm")).click();
	    driver.findElement(By.id("passwordConfirm")).clear();
	    driver.findElement(By.id("passwordConfirm")).sendKeys("Test1234");
	    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}



