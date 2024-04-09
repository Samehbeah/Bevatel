package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;



public class WelcomePage extends PageBase {



	By homePageBtn = By.id("com.anydo:id/imgHome");
	public WelcomePage(AndroidDriver driver) {
		
		super(driver);
		
	}
	
	
	public void clickHomeBtn() {
		
		wait.until(ExpectedConditions.elementToBeClickable(homePageBtn)).click();
		
		
	}

	

}
