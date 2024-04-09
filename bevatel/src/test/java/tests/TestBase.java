package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import utilites.ReadPropertiesFile;

public class TestBase {

	public static AndroidDriver driver ;

	@BeforeSuite
	public void setUpEnvironment() throws MalformedURLException
	{
		OpenApp();

	}



	public static void OpenApp() throws MalformedURLException {
		
		Properties properties= ReadPropertiesFile.getCofig();
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", properties.getProperty("deviceName"));
		cap.setCapability("udid", properties.getProperty("udid"));
		cap.setCapability("platformName", properties.getProperty("platformName"));
		cap.setCapability("platformVersion", properties.getProperty("platformVersion"));
		cap.setCapability("appPackage", properties.getProperty("appPackage"));
		cap.setCapability("appActivity", properties.getProperty("appActivity"));

		URL url = new URL (properties.getProperty("URL"));

		driver= new AndroidDriver(url,cap);



	}

}
