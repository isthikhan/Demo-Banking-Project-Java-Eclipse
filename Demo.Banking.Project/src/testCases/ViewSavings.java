package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonFunctions.Commonfunctions;
import pageObject.Savings_Page_Objects;

public class ViewSavings extends Commonfunctions {

	@Test
	public void viewsavings() {
		PageFactory.initElements(driver, Savings_Page_Objects.class);
		Savings_Page_Objects.savings.click();
		Savings_Page_Objects.viewsavings.click();
		String Actualmessage = Savings_Page_Objects.savingstext.getText();
		Assert.assertEquals(Actualmessage, "Account Number: 486130176");

	}

}
