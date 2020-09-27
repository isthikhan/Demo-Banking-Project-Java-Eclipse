package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Savings_Page_Objects {

	
	@FindBy(id="savings-menu")
	public static WebElement savings;
	
	@FindBy(xpath="/html/body/aside/nav/div[2]/ul/li[3]/ul/li[1]/a")
	public static WebElement viewsavings;
	
	@FindBy(xpath="//*[text()='myones']")
	public static WebElement savingstext;
	
}
