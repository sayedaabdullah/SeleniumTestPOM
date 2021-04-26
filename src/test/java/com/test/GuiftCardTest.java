package com.test;

import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.GuiftCardPage;

public class GuiftCardTest extends TestBase {

	@Test
	public void fiveDollarGuiftCardTest() {
		GuiftCardPage guiftCardPage = new GuiftCardPage(driver);	
		guiftCardPage.clickGuiftCardLink();
		
	}
	@Test
	public void tenDollarGuiftCardTest() {
		
	}

}
