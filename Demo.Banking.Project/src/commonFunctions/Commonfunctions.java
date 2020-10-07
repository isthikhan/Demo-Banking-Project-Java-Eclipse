package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Commonfunctions {
	public static WebDriver driver = null;
	public static Properties properties = null;

	Logger logger = Logger.getLogger(Commonfunctions.class);

	public Properties loadpropertiesfile() throws IOException {
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}

	@BeforeSuite
	public void launchbrowser() throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Initializating browser Drivers");
		loadpropertiesfile();
		String browser = properties.getProperty("browser");
		String URL = properties.getProperty("url");
		String driverLocation = properties.getProperty("Driverlocation");
		logger.info("Validating the Browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		logger.info("Maximize the Browser and clearing all cookies");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void teardown() {
		logger.info("Closing the Browser");
		logger.info("closing the Browser");
		driver.quit();

	}

}
