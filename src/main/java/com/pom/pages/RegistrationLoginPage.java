package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationLoginPage {
	WebDriver driver;
	//Constractor method to initilize the driver value
	public RegistrationLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By emailTestBox = By.id("customer.emailAddress");
	
	public WebElement typeEmail() {
		return driver.findElement(emailTestBox);
	}
	
	public void registration(String email) {
		typeEmail().sendKeys(email);
	}
	//Capture the locator and assign the locator to a By object
	By firstNameTextBox = By.id("customer.firstName");
	//Assign the By class object value to WebElement class
	public WebElement firstName() {
		return driver.findElement(firstNameTextBox);
	}
	//Using WebElelment perform user action
	public void typeFirstName(String firstName) {
		firstName().sendKeys(firstName);
	}
	
	

}
