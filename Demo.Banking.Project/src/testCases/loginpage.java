package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;
import pageObject.Login_Object;

public class loginpage extends Commonfunctions {
	Logger logger = Logger.getLogger(loginpage.class);
	@Test
	public void Loginpage() {
		logger.info("Entering the user details");
		PageFactory.initElements(driver, Login_Object.class);
		Login_Object.UserName.sendKeys(properties.getProperty("username"));
		Login_Object.Password.sendKeys(properties.getProperty("password"));
		Login_Object.Submit.click();
		logger.info("Login Authenticted");
		logger.info("Navigating to Home page");
		String Actualmessage = Login_Object.loginvalidation.getText();
		Assert.assertEquals(Actualmessage, "Welcome Irshadmohammed");

	}
}