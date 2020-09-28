package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;
import pageObject.Checking_Page_Objects;
import pageObject.Creating_Checking_Objects;

public class InterestChecking extends Commonfunctions {
	@Test
	public void StandardCheckingCreation() {

		PageFactory.initElements(driver, Checking_Page_Objects.class);
		Checking_Page_Objects.checking.click();

		PageFactory.initElements(driver, Creating_Checking_Objects.class);
		Creating_Checking_Objects.Newchecking.click();
		Creating_Checking_Objects.interestchecking.click();
		Creating_Checking_Objects.Individual.click();
		Creating_Checking_Objects.name.sendKeys("Interest1 one");
		Creating_Checking_Objects.openingBalance.sendKeys("55");
		Creating_Checking_Objects.newchekingsubmit.submit();

	}
}
