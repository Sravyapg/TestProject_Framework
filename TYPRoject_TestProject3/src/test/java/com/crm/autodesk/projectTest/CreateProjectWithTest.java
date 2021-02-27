package com.crm.autodesk.projectTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.crm.autodesk.genericlib.BaseClass;
import com.crm.autodesk.objectrrepositorylib.CreateNewJob;
import com.crm.autodesk.objectrrepositorylib.CreateNewProject;
import com.crm.autodesk.objectrrepositorylib.CreateNewTest;
import com.crm.autodesk.objectrrepositorylib.Home;
import com.crm.autodesk.objectrrepositorylib.JobInfo;
import com.crm.autodesk.objectrrepositorylib.ProjectInfo;
import com.crm.autodesk.objectrrepositorylib.TestInfo;

public class CreateProjectWithTest extends  BaseClass{

	@Test(groups = "smokeTest")
	public void createProjectWithTest() throws Throwable {

		/*test script data*/
		int randomNum = jLib.generateRandomNum();
		String projName = eLib.getExcelData("Project", "tc_02", "ProjectName")+ randomNum;
		String projDesc = eLib.getExcelData("Project", "tc_02", "ProjectDescription")+ randomNum;
		String testName = eLib.getExcelData("Project", "tc_02", "TestName")+ randomNum;
		String testDesc = eLib.getExcelData("Project", "tc_02", "TestDescription")+ randomNum;
		String appName = flib.getPropertyKeyValue("appname");
		String appurl = flib.getPropertyKeyValue("appurl");


		//navigate to project link
		Home hp = new Home(driver);

		hp.getarrowLnk().click();

		hp.getnewprojectlnk().click();
		CreateNewProject prc= new CreateNewProject(driver);
		prc.createProject(projName, projDesc);

		/*verify project
		ProjectInfo pinfo = new ProjectInfo(driver);
		String actSuccessfullMsgproj = pinfo.getSuccessFullMSGProject().getText();
		Assert.assertTrue(actSuccessfullMsgproj.contains(projName));*/

		hp.waitforElement(hp.getnewtestbtnlnk());
		hp.getnewtestbtnlnk().click();




		//create test inside a project
		CreateNewTest tst= new CreateNewTest(driver);
		tst.createTest(testName, testDesc, appName, appurl);

		/*verify test
		TestInfo tinfo = new TestInfo(driver);
		String actSuccessfullMsgtest = tinfo.getSuccessFullMsg().getText();
		Assert.assertTrue(actSuccessfullMsgtest.contains(testName));*/
	}
}

