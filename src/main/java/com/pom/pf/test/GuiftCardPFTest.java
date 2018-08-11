package com.pom.pf.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pom.pf.base.TestBase;
import com.pom.pf.pages.GuiftCardPFPage;

public class GuiftCardPFTest extends TestBase {
	@Test
	public void fiveDollarCardTest() {
		GuiftCardPFPage guiftCardPFPage = PageFactory.initElements(driver,GuiftCardPFPage.class);
		guiftCardPFPage.clickGuiftCardLink();
	}

}
