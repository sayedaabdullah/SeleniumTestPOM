package com.pom.pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuiftCardPFPage {
	WebDriver driver;
	//Constractor method to initilize the driver value
	public GuiftCardPFPage(WebDriver driver) {
		this.driver=driver;
		 //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='left-nav']//span[contains(text(),'Gift Cards')]")
	WebElement guiftCardLink;
	public void clickGuiftCardLink() {
		guiftCardLink.click();
	}

}
