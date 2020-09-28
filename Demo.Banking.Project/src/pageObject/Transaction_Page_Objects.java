package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transaction_Page_Objects {

	@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/a")
	public static WebElement Transactions;
	
	@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/ul/li[1]/a")
	public static WebElement Deposit;
	
	@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/ul/li[2]/a")
	public static WebElement Withdraw;
	
	@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/ul/li[2]/a")
	public static WebElement AccWithdraw;
	
	@FindBy(id = "id")
	public static WebElement dropdown;
	
	@FindBy(id = "amount")
	public static WebElement amount;
	

	@FindBy(xpath = "//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")
	public static WebElement Submit;
	
	
}
