package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AllTasksPage;
import Pages.HomePage;
import Pages.TaskCategoryPage;

public class testTaskAddedToRightCategory extends TestBase {
	AllTasksPage Taskspage;
	String ExpectedTaskTitle = "bevatel_task";
	@Test
	public void test_TaskAddedToRightCategory() {
		
		HomePage homepage  = new HomePage(driver);
		TaskCategoryPage taskCategoryPage= new TaskCategoryPage(driver);
		
		homepage.clickTaskCategoryCard("Work");
		 String ActualTaskTitle= taskCategoryPage.getAddedTaskTitle();
		 
		 Assert.assertEquals(ActualTaskTitle.toLowerCase(), ExpectedTaskTitle);

	}
	

}
