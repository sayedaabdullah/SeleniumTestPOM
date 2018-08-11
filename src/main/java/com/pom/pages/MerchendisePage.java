package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MerchendisePage {
	WebDriver driver;
	//Constructor
	public MerchendisePage(WebDriver driver) {
		this.driver=driver;
		
	}
	By mersendiceText = By.xpath("//h2[@class='section-title']//span[contains(text(),'Merchandise')]");
	By merchendiseLInk = By.xpath("//div[@id='left-nav']//span[contains(text(),'Merchandise')]");
	//WebElement
	public WebElement merchendiseLInk() {
	 return driver.findElement(merchendiseLInk);
	}
	public WebElement mersendiceText() {
		return driver.findElement(mersendiceText);
	}
	public WebElement defaultBox() {
		return driver.findElement(By.xpath("//span[contains(text(),'Default')]"));
	}
	//User Action
	public void clickMerchendiseLink() {
		merchendiseLInk().click();
	}
	
	public void clickDefaultBox() {
		defaultBox().click();
	}

}
