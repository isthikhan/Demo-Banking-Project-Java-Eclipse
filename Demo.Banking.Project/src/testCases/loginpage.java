package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.Commonfunctions;
import pageObject.Login_Object;

public class loginpage extends Commonfunctions {

	@Test
	public void Loginpage() {

		PageFactory.initElements(driver, Login_Object.class);
		Login_Object.UserName.sendKeys(properties.getProperty("username"));
		Login_Object.Password.sendKeys(properties.getProperty("password"));
		Login_Object.Submit.click();
		String Actualmessage = Login_Object.loginvalidation.getText();
		Assert.assertEquals(Actualmessage, "Welcome Irshadmohammed");

	}
}