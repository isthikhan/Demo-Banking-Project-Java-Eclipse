package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creating_Saving_Object {

	
	
	@FindBy(xpath="//*[@id=\"new-savings-menu-option\"]")
	public static WebElement newsavings;
	
	@FindBy(id="Savings")
	public static WebElement SavAcctype;
	@FindBy(id="Individual")
	public static WebElement SavAccIndi;
	@FindBy(id="name")
	public static WebElement savingsname;
	@FindBy(id="openingBalance")
	public static WebElement savopeningbalance;
	@FindBy(id="newSavingsSubmit")
	public static WebElement savingssubmit;
}
