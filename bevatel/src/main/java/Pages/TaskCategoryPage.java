package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;

public class TaskCategoryPage extends PageBase {
	By taskTitlelocator = By.id("com.anydo:id/title");

	By markAsCompleteBtn =By.id("com.anydo:id/mark_as_complete");
	
	By deleteTaskBtn = By.id("com.anydo:id/btnDelete"); 
	
	By EmptyTasksTitle = By.id("com.anydo:id/textviewEmptyListTitle");

	public TaskCategoryPage(AndroidDriver driver) {

		super(driver);

	}


	public String getAddedTaskTitle() {

		String taskTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(taskTitlelocator)).getText();
		return taskTitle;


	}


	public void deleteTask() {

		markTaskAsCompleted();

		wait.until(ExpectedConditions.elementToBeClickable(deleteTaskBtn)).click();

		

	}


	public void markTaskAsCompleted() {

		wait.until(ExpectedConditions.elementToBeClickable(markAsCompleteBtn)).click();


	}
	
	public String ConfirmDeletedTask() {
		
		String EmptyTasksLabel= wait.until(ExpectedConditions.visibilityOfElementLocated(EmptyTasksTitle)).getText();

		return EmptyTasksLabel;
		
	}

}
