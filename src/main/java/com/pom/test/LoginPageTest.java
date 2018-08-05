package com.pom.test;

import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.LoginPage;


public class LoginPageTest extends TestBase {
	
	@Test
	public void testLogin() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.loginToHeatclinic("reaz@infixtech.com","Test1234");
	}

}
