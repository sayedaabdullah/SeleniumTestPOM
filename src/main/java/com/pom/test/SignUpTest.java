package com.pom.test;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.pages.LoginPage;
import com.pom.pages.RegistrationLoginPage;



public class SignUpTest extends TestBase {
	@Test
	public void testRegistration() {
		RegistrationLoginPage registration = new RegistrationLoginPage(driver); 
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		registration.registration("reaz@test.com");
		registration.typeFirstName("reaz");
		
	}

}
