package com.pom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pom.base.TestBase;
import com.pom.pages.MerchendisePage;

public class MercendiseTest extends TestBase {


	@Test
	public void sortingByHighToLow() {		
		MerchendisePage merchendisePage = new MerchendisePage(driver);
		merchendisePage.clickMerchendiseLink();
		testLog.log(Status.PASS, "Clickled on mercendise link");
		Assert.assertEquals(merchendisePage.mersendiceText().getText(), "Merchandise");
		testLog.log(Status.PASS, "Verified Merchandise text");
		merchendisePage.clickDefaultBox();
		testLog.log(Status.PASS, "Clicked on defualt box");
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
