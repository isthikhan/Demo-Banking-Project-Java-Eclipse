package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Object {

	@FindBy(id="username")
	public static WebElement UserName;
	@FindBy(id="password")
	public static WebElement Password;
	@FindBy(id="submit")
	public static WebElement Submit;
	@FindBy(xpath="//*[@id=\"right-panel\"]/div[1]/div[2]/div/div/ol/li")
	public static WebElement loginvalidation;
	
}
