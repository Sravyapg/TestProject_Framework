package com.crm.autodesk.objectrrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.genericlib.WebDriverUtiles;

/**
 * 
 * @author sravya
 *
 */
public class CreateNewTest extends WebDriverUtiles{
	WebDriver driver;
	public CreateNewTest(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='tp-drop-list-icon-wrapper ng-scope']")
	private WebElement appselectDropdown;
	
	@FindBy(xpath = "//textarea[@placeholder='Test Description']")
	private WebElement testDescriptbox;
	
	@FindBy(xpath = "//div[.='Add a new application for testing']")
	private WebElement newAppLnk;
	
	@FindBy(xpath = "//div[.='Name:']/..//input[contains(@class,'tp-input')]")
	private WebElement appNameLnk;
	
	@FindBy(xpath = "//div[.='URL:']/..//input[contains(@class,'not-empty')]")
	private WebElement appUrlLnk;
	
	
	@FindBy(xpath = "//div[.='Finish']")
	private WebElement finishBtn;
	
	@FindBy(xpath = "//div[.='Edit']")
	private WebElement editOptionLnk;
	
	@FindBy(xpath = "//div[.='Start editing']")
	private WebElement edtStartlLnk;
	
	@FindBy(xpath = "//div[.='Next']")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//input[@title='Test Name']")
	private WebElement testNamebox;
	
	
	@FindBy(xpath = "//span[.='SAVE & EXIT']")
	private WebElement saveExitBtn;
	
	@FindBy(xpath = "//div[.='Web']")
	private WebElement websel;
	
	
	public WebElement getappselectDropdownEdt() {
		return appselectDropdown;
	}

	public WebElement gettestDescriptbox() {
		return testDescriptbox;
	}

	public WebElement getnewAppLnk() {
		return newAppLnk;
	}
	public WebElement getappNameLnk() {
		return appNameLnk;
	}

	public WebElement getappUrlLnk() {
		return appUrlLnk;
	}

	public WebElement getfinishBtn() {
		return finishBtn;
	}

	public WebElement geteditOptionLnk() {
		return editOptionLnk;
	}

	public WebElement getedtStartlLnk() {
		return edtStartlLnk;
	}

	public WebElement getnextBtn() {
		return nextBtn;
	}
	public WebElement getTestNamebox() {
		return testNamebox;
	}
	public WebElement getsaveExitBtn() {
		return saveExitBtn;
	}
	public WebElement getwebsel() {
		return websel;
	}
	/**
	 * 
	 * @param testName
	 * @param testDescription
	 * @param appName
	 * @param appUrl
	 * @throws Throwable
	 */
	
	public void createTest(String testName , String testDescription,String appName,String appUrl) throws Throwable {
		websel.click();
		nextBtn.click();
		testNamebox.sendKeys(testName);
		testDescriptbox.sendKeys(testDescription);
		nextBtn.click();
		appselectDropdown.click();
		newAppLnk.click();
		appNameLnk.sendKeys(appName);
		appUrlLnk.sendKeys(appUrl);
		finishBtn.click();
		nextBtn.click();
		editOptionLnk.click();
		edtStartlLnk.click();
		waitforElement(saveExitBtn);
		saveExitBtn.click();
	
		
		// OrganizationInfo orginfo = new OrganizationInfo(driver);
		// waitforElement(orginfo.getSuccessFullMsg());
	}
	
	
}
