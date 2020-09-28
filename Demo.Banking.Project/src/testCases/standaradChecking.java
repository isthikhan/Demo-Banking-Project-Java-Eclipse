package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;
import pageObject.Checking_Page_Objects;
import pageObject.Creating_Checking_Objects;
import pageObject.Login_Object;

public class standaradChecking extends Commonfunctions {

	@Test
	public void StandardCheckingCreation() {

		PageFactory.initElements(driver, Checking_Page_Objects.class);
		Checking_Page_Objects.checking.click();

		PageFactory.initElements(driver, Creating_Checking_Objects.class);
		Creating_Checking_Objects.Newchecking.click();
		Creating_Checking_Objects.standardchecking.click();
		Creating_Checking_Objects.Individual.click();
		Creating_Checking_Objects.name.sendKeys("stdone22");
		Creating_Checking_Objects.openingBalance.sendKeys("100");
		Creating_Checking_Objects.newchekingsubmit.submit();
		Creating_Checking_Objects.text.isDisplayed();
	}
}
