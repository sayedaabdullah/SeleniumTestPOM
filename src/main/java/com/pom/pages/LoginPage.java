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
	
	
	By loginLink = By.linkText("Login");
	By emailTextBox = By.id("username");
	By passwordTextBox = By.xpath("id(\\\"login\\\")/form[1]/div[2]/div[1]/input[1]");
	By loginButton = By.xpath("id(\\\"login\\\")/form[1]/button[1]");
	
	
	public WebElement loginLink() {
		return driver.findElement(By.linkText("Login"));
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
