package com.pom.pf.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.pf.base.TestBase;
import com.pom.pf.pages.LoginPagePF;


public class LogintestPF extends TestBase {
/*	@DataProvider(name = "loginTestData")
	  public static Object[][] loginData() {
	        return new Object[][] { { "reaz@infixtech.con", "Test@123" }, { "Tawhida@infixtech.com", "Test@123" }
	        ,{"noman@infixtech.com","password"},{"",""}};
	  }dataProvider="loginTestData"
	*/
	@Test()
	public void loginTest() {
		// Created Page Object using Page Factory
		LoginPagePF loginPage=PageFactory.initElements(driver, LoginPagePF.class);
		loginPage.clickLoginLink();
		loginPage.typeEmailTextBox("reaz@infixtech.com");
		
	}

}
