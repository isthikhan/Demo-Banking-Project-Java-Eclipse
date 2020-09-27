package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commonfunctions {
	public static WebDriver driver = null;
	public static Properties properties = null;
	
	public Properties loadpropertiesfile() throws IOException {
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;	
	}
	
	@BeforeSuite
	public void launchbrowser() throws IOException {
	    loadpropertiesfile();
		String browser=properties.getProperty("browser");
		String URL=properties.getProperty("url");
		String driverLocation=properties.getProperty("Driverlocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverLocation);
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driverLocation);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
	
	
	
	@AfterSuite
	public void teardown() {
		
	}

}
