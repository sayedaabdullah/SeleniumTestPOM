package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.base.TestBase;
import com.test.data.RegistrationTestData;
import com.test.locator.RegistrationLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class RegistrationTest extends TestBase {
	RegistrationTestData data = new RegistrationTestData();
	RegistrationLocator locator = new RegistrationLocator();
	@Test
	public void registrationTest() {
		driver.findElement(By.linkText(locator.loginLink)).click();
		test.log(Status.INFO, "Click on link");
		driver.findElement(By.id(locator.emailTestboxID)).sendKeys(data.email);
		test.log(Status.INFO, "Type email");
	}
	
}
