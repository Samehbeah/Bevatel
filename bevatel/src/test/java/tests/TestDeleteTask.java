package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.TaskCategoryPage;

public class TestDeleteTask extends TestBase {
	
	@Test
	public void test_DeleteTask() {
		
		TaskCategoryPage taskCategoryPage= new TaskCategoryPage(driver);
		taskCategoryPage.deleteTask();
		String EmptyTasksLabel= taskCategoryPage.ConfirmDeletedTask();
		Assert.assertEquals(EmptyTasksLabel, "No tasks here yet");
		
		
	}

}
