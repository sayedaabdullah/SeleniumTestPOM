package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuiftCardPage {
	WebDriver driver;
	//Constructor
	public GuiftCardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//By Locator
	By guiftCardLink = By.xpath("//div[@id='left-nav']//span[contains(text(),'Gift Cards')]");

	//Webelement
	public WebElement guiftCardLink() {
		return driver.findElement(guiftCardLink);
	}
	
	//User Action
	public void clickGuiftCardLink() {
		guiftCardLink().click();
	}
}
