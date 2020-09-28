package testCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;
import pageObject.Transaction_Page_Objects;

public class TransactionDeposit extends Commonfunctions {

	
	
	@Test

	public void deposittransactions() {

		PageFactory.initElements(driver, Transaction_Page_Objects.class);
		Transaction_Page_Objects.Transactions.click();
		Transaction_Page_Objects.Deposit.click();
		Transaction_Page_Objects.dropdown.click();
		Select withdrawselect = new Select(Transaction_Page_Objects.dropdown);
		withdrawselect.selectByValue("951");
		Transaction_Page_Objects.amount.sendKeys("100");
		Transaction_Page_Objects.Submit.submit();
	}
}
