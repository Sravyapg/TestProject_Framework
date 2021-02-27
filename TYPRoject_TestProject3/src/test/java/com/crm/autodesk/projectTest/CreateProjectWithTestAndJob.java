package com.crm.autodesk.projectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.autodesk.genericlib.BaseClass;
import com.crm.autodesk.objectrrepositorylib.CreateNewJob;
import com.crm.autodesk.objectrrepositorylib.CreateNewProject;
import com.crm.autodesk.objectrrepositorylib.CreateNewTest;
import com.crm.autodesk.objectrrepositorylib.Home;

public class CreateProjectWithTestAndJob extends  BaseClass{
	@Test(groups = "regressionTest")
	public void createProjectWithTestandJob() throws Throwable {
		/*test script data*/
		int randomNum = jLib.generateRandomNum();
		String projName = eLib.getExcelData("Project", "tc_02", "ProjectName")+ randomNum;
		String projDesc = eLib.getExcelData("Project", "tc_02", "ProjectDescription")+ randomNum;
		String jobName = eLib.getExcelData("Project", "tc_02", "JobName")+ randomNum;
		String jobDesc = eLib.getExcelData("Project", "tc_02", "JobDescription")+ randomNum;
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

		hp.waitforElement(hp.getnewjobLnk());
		hp.getnewjobLnk().click();

		//createjob with test inside a project
		CreateNewJob jbc= new CreateNewJob(driver);
		jbc.createJob(jobName, jobDesc);


		/*verify job
		JobInfo jinfo = new JobInfo(driver);
		String actSuccessfullMsgjob = jinfo.getSuccessFullMSGJob().getText();
		Assert.assertTrue(actSuccessfullMsgjob.contains(jobName));*/



		hp.waitforElement(hp.getsourcetestlnk());
		WebElement source = hp.getsourcetestlnk();
		hp.waitforElement(hp.gettargetjoblnk());
		WebElement target = hp.gettargetjoblnk();
		Actions a = new Actions(driver); 
		a.dragAndDrop(source, target).perform();


		driver.findElement(By.xpath("//div[.='"+jobName+"']")).click();
		driver.findElement(By.xpath("//div[.='"+jobName+"']/../../../../..//div[@title='Run']")).click();

		hp.waitforElement(hp.getreportLnk());
		hp.getreportLnk().click();


	}

}
