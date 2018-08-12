package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	//Constractor method to initilize the driver value
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By loginLink = By.xpath("//a[contains(text(),'Login')]");
	By emailTextBox = By.xpath("//input[@id='username']");
	By passwordTextBox = By.xpath("//div[@class='label-floating form-group']//input[@id='password']");
	By loginButton = By.xpath("//button[contains(text(),'Login')]");
	
	
	public WebElement loginLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	}
	public void clickLoginLink() {
		loginLink().click();
	}
	public WebElement typeEmail() {
		return driver.findElement(emailTextBox);
	}
	public WebElement typePassword() {
		return driver.findElement(passwordTextBox);
	}
	public WebElement clickLogin() {
		return driver.findElement(loginButton);
	}
	
	public void loginToHeatclinic(String email, String pass) throws InterruptedException {
		loginLink().click();
		System.out.println("Clicking on login link");
		Thread.sleep(3000);
		typeEmail().sendKeys(email);
		typePassword().sendKeys(pass);
		clickLogin().click();
	}

	
	
	

}
