package testCases;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.Commonfunctions;
import pageObject.Login_Object;

public class loginpage extends Commonfunctions {

	
public void verifyviewchecking () {
		
		PageFactory.initElements(driver,Login_Object.class);
		Login_Object.UserName.sendKeys(properties.getProperty("username"));
		Login_Object.Password.sendKeys(properties.getProperty("password"));
		Login_Object.Submit.click();
}
}