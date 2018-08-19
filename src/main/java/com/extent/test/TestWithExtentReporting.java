package com.extent.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;



public class TestWithExtentReporting extends ExtentTestBase {
	
	@Test
	public void registrationTest() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		test.log(Status.INFO, "Clicked on login link");
		driver.findElement(By.id("customer.emailAddress")).sendKeys("reaz@infixtech.com");
		test.log(Status.INFO, "Typed on email address field");
	}
	

}
