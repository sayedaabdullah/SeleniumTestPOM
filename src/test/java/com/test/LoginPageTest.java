package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.LoginPage;


public class LoginPageTest extends TestBase {
	@DataProvider(name = "login")
	  public static Object[][] login() {
	 
	        return new Object[][] { { "reaz@infixtech.com", "Test@123" }, { "reaz@infixtech.com", "T" },
	        	{"reaz", ""}};
	 
	  }
	
	@Test(dataProvider="login")
	public void testLogin(String email,String pass) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.loginToHeatclinic(email,pass);
	}

}
