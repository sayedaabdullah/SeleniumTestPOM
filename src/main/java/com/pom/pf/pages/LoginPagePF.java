package com.pom.pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
	WebDriver driver;
	//Constractor method to initilize the driver value
	public LoginPagePF(WebDriver driver) {
		this.driver=driver;
		 //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginLink;
	@FindBy(xpath="//input[@id='username']")
	WebElement emailTextBox;
	
	@FindBy(linkText="Clearance")
	WebElement clearenceLink;
	public void clickLoginLink() {
		loginLink.click();
	}
	public void typeEmailTextBox(String name) {
		emailTextBox.sendKeys(name);
	}
	

}
