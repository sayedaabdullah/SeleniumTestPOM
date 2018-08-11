package com.pom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.MerchendisePage;

public class MercendiseTest extends TestBase {
	
	@Test
	public void sortingByHighToLow() {
		MerchendisePage merchendisePage = new MerchendisePage(driver);
		merchendisePage.clickMerchendiseLink();
		Assert.assertEquals(merchendisePage.mersendiceText().getText(), "Merchandise");
		merchendisePage.clickDefaultBox();
	}
	@Test
	public void sortingByLowToHigh() {

	}
	@Test
	public void sortingByAtoZ() {

	}
	@Test
	public void sortingByZtoA() {

	}

}
