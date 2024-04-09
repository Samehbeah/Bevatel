package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;

public class HomePage extends PageBase {
	By AllTasksBtn = By.id("com.anydo:id/action_to_all_tasks");
	public HomePage(AndroidDriver driver) {
		
		super(driver);
		
	}
	
	public void clickAllTasksBtn() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AllTasksBtn)).click();
		
	}
	
	public void clickTaskCategoryCard(String TaskCategory) {
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='" +TaskCategory+ "']//ancestor::android.widget.FrameLayout[@resource-id='com.anydo:id/cardView']"))).click();
		
	}

}
