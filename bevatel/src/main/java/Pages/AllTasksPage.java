package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class AllTasksPage extends PageBase {

	By taskTitle_txtBox = By.id("com.anydo:id/quick_add_input");
	By TaskCategoryBtn = By.xpath("(//*[@class='android.widget.ImageButton'])[2]");
	By creatTaskBtn = By.id("com.anydo:id/quick_add_button");
	String taskType;
	public AllTasksPage(AndroidDriver driver) {

		super(driver);

	}




	public void AddTask(String taskType, String taskSchedule, String taskTitle, String taskCategory) {

		clickAddTaskBtn(taskType);
		setTaskSchedule (taskSchedule);
		setTaskTitle(taskTitle);
		setTaskCategory(taskCategory);
		clickCreatTaskBtn();



	}



	public void clickAddTaskBtn(String taskType) {

		this.taskType = taskType ;

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='"+taskType+"']//following::android.widget.FrameLayout[@resource-id ='com.anydo:id/add_task']"))).click();

	}

	public void setTaskSchedule(String taskSchedule) {


		WebElement taskSchedulWebElement =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='"+taskSchedule+"']")));
		String isElementChecked = taskSchedulWebElement.getAttribute("checked");
		if (isElementChecked.equalsIgnoreCase("false"))
			taskSchedulWebElement.click();
		
	

	}


	public void setTaskTitle(String title) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(taskTitle_txtBox)).sendKeys(title);

	}


	public void setTaskCategory(String taskCategory) {

		clickTaskCategoryBtn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='"+taskCategory+"']"))).click();

	}

	public void clickTaskCategoryBtn() {

		wait.until(ExpectedConditions.elementToBeClickable(TaskCategoryBtn)).click();

	}


	public void clickCreatTaskBtn() {

		wait.until(ExpectedConditions.elementToBeClickable(creatTaskBtn)).click();


	}

	public String getAddedTaskTitle() {

		String taskTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='" + taskType + "']//following::android.widget.TableRow//android.widget.TextView"))).getText();
		return taskTitle;


	}

	public void backToHomePage() {

		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

	}


}
