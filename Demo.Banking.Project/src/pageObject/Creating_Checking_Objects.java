package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creating_Checking_Objects {
	
	@FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[2]/ul/li[2]/a")
	public static WebElement Newchecking;
	
	@FindBy(id = "Standard Checking")
	public static WebElement standardchecking;

	@FindBy(id = "Interest Checking")
	public static WebElement interestchecking;

	@FindBy(id = "Individual")
	public static WebElement Individual;

	@FindBy(id = "Joint")
	public static WebElement Joint;

	@FindBy(id = "name")
	public static WebElement name;

	@FindBy(id = "openingBalance")
	public static WebElement openingBalance;

	@FindBy(xpath = "//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")
	public static WebElement newchekingsubmit;
	
	@FindBy(id="notification")
	public static WebElement Notification;
	
	@FindBy(xpath="//*[text()='stdone2']")
	public static WebElement text;

	@FindBy(xpath="//*[text()='stdone2']")
	public static WebElement text1;

}
