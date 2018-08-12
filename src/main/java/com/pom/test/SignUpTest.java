package com.pom.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.pages.LoginPage;
import com.pom.pages.RegistrationLoginPage;
import com.pom.test.utility.ExcelUtility;



public class SignUpTest extends TestBase {
	ExcelUtility excel = new ExcelUtility();
	private static final Logger log = LogManager.getLogger(SignUpTest.class);
	@Test
	public void testRegistration() throws Exception {
		RegistrationLoginPage registration = new RegistrationLoginPage(driver);
		
		excel.setExcelFile("//Users//reaz//Desktop//SSA4.xlsx", "logindata");
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		log.info("Click on login link");
		registration.registration(excel.getCellData(8, 0));
		registration.typeFirstName("reaz");
		
	}

}
