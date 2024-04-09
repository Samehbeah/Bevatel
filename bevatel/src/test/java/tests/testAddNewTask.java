package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Pages.AllTasksPage;
import Pages.HomePage;
import Pages.WelcomePage;

public class testAddNewTask extends TestBase {
	String TaskTitle = "bevatel_task";
	WelcomePage welcomePage;
	HomePage homepage;
	AllTasksPage Taskspage;
	@Test
	public void test_AddNewTask() {
	
	welcomePage = new WelcomePage(driver);
	
	homepage  = new HomePage(driver);
	
	Taskspage= new AllTasksPage(driver);
	
	welcomePage.clickHomeBtn();
	
	homepage.clickAllTasksBtn();
	
	Taskspage.AddTask("Today", "This evening", TaskTitle, "Work");
	
	String ActualTaskTitle =Taskspage.getAddedTaskTitle();
	
	Assert.assertEquals(ActualTaskTitle.toLowerCase(), TaskTitle);
	
	
	}
	@AfterClass
	public void navigateToHomePage() {
		
		Taskspage.backToHomePage();
		
	}
	
}
