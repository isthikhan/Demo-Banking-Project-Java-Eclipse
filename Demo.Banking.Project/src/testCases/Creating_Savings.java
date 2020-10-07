package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;

import pageObject.Creating_Saving_Object;
import pageObject.Savings_Page_Objects;

public class Creating_Savings extends Commonfunctions {
	Logger logger = Logger.getLogger(Creating_Savings.class);
	@Test
	
	public void Creatingsavings() {

		logger.info("Navigating to Savings Menu");
		PageFactory.initElements(driver, Savings_Page_Objects.class);
		Savings_Page_Objects.savings.click();
		logger.info("Navigating to Create Savings Menu");
		PageFactory.initElements(driver, Creating_Saving_Object.class);
		Creating_Saving_Object.newsavings.click();
		Creating_Saving_Object.SavAcctype.click();
		Creating_Saving_Object.SavAccIndi.click();
		Creating_Saving_Object.savingsname.sendKeys("SavingsOne");
		Creating_Saving_Object.savopeningbalance.sendKeys("100");
		Creating_Saving_Object.savingssubmit.submit();
		logger.info("Savings Submitted");
		logger.info("verifying the created savings");
		Creating_Saving_Object.text.isDisplayed();
	}
}
