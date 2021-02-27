package com.crm.autodesk.objectrrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.genericlib.WebDriverUtiles;
/**
 * 
 * @author Sravya
 *
 */


public class Home  extends WebDriverUtiles{
	WebDriver driver;
	public Home(WebDriver driver) {     
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'New Project')]")
	private WebElement newprojectlnk;
	
	@FindBy(xpath = "//div[contains(@class,'user-default-avatar')]")
	private WebElement myprofileImg;


	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	private WebElement reportLnk;


	@FindBy(xpath = "//div[@class='icon-arrow-close']")
	private WebElement arrowLnk;

	@FindBy(xpath = "//div[contains(@class,'new-test-button')]")
	private WebElement newtestbtnlnk;

	@FindBy(xpath = "//div[@class='emc-button-container']/div")
	private WebElement newjobLnk;

	@FindBy(xpath = "//div[@class='ddi-placeholder ng-scope']")
	private WebElement targetjoblnk;

	@FindBy(xpath = "//div[@class='content-item-containers tp-info-tooltip-box-project-drag-test']")
	private WebElement sourcetestlnk;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutlnk;
	

	//@FindBy(xpath = "//div[.='jobtest1']")
	//private WebElement jobdivlnk;
	

	//@FindBy(xpath = "//div[.='" +jobName+ "']/../../../../..//div[@title='Run']")
	//private WebElement runBtnlnk;
	



	public WebElement getreportLnk() {
		return reportLnk;
	}

	public WebElement getarrowLnk() {
		return arrowLnk;
	}

	public WebElement getnewtestbtnlnk() {
		return newtestbtnlnk;
	}

	public WebElement getmyprofileImglnk() {
		return myprofileImg;
	}

	public WebElement getnewjobLnk() {
		return newjobLnk;
	}
	public WebElement getnewprojectlnk() {
		return newprojectlnk;
	}


	/*public WebElement getjobdivlnk() {
		return jobdivlnk;
	}
	public WebElement getrunBtnlnk() {
		return runBtnlnk;
	}*/
	

	public WebElement gettargetjoblnk() {
		return targetjoblnk;
	}

	public WebElement getsourcetestlnk() {
		return sourcetestlnk;
	}


public void logout() throws Throwable {
	moveToExpectedElemnet(driver, myprofileImg);
	waitforElement(logoutlnk);
	logoutlnk.click();
}




}
