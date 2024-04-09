package Pages;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class PageBase {
	static AndroidDriver driver;
	static WebDriverWait wait;
	public PageBase(AndroidDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		
		
	}

}
