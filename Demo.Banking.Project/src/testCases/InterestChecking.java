package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;
import pageObject.Checking_Page_Objects;
import pageObject.Creating_Checking_Objects;

public class InterestChecking extends Commonfunctions {
	Logger logger = Logger.getLogger(InterestChecking.class);
	@Test
	public void CreateInterestCheckingCreation() {
		logger.info("Navigating to Savings Menu");
		PageFactory.initElements(driver, Checking_Page_Objects.class);
		Checking_Page_Objects.checking.click();
		logger.info("Navigating to Create Interest checking Menu");
		PageFactory.initElements(driver, Creating_Checking_Objects.class);
		Creating_Checking_Objects.Newchecking.click();
		Creating_Checking_Objects.interestchecking.click();
		Creating_Checking_Objects.Individual.click();
		Creating_Checking_Objects.name.sendKeys("Interest11one");
		Creating_Checking_Objects.openingBalance.sendKeys("55");
		Creating_Checking_Objects.newchekingsubmit.submit();
		logger.info("Interest checking Submitted");
		logger.info("verifying the created");
		Creating_Checking_Objects.text1.isDisplayed();
	}
}
