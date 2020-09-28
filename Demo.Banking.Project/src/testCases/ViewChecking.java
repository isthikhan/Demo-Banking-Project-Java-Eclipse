package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonFunctions.Commonfunctions;
import pageObject.Checking_Page_Objects;


public class ViewChecking extends Commonfunctions {

	@Test
	public void viewchecking() {
		PageFactory.initElements(driver, Checking_Page_Objects.class);
		Checking_Page_Objects.checking.click();
		Checking_Page_Objects.Viewchecking.click();
		String Actualmessage = Checking_Page_Objects.text.getText();
		Assert.assertEquals(Actualmessage, "Account Number: 486130140");
	}

}
