package com.crm.autodesk.objectrrepositorylib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.autodesk.genericlib.WebDriverUtiles;

public class CreateNewJob extends WebDriverUtiles{

	WebDriver driver;
	public CreateNewJob(WebDriver driver) {  
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Web']")
	private WebElement websel;




	@FindBy(xpath = "//div[@class='cj__row cj__row--list']//input[contains(@class,'tp-input')]")
	private WebElement jobNameEdt;

	@FindBy(xpath = "//div[@class='mCSB_container mCS_y_hidden mCS_no_scrollbar_y']//textarea")
	private WebElement jobDescription;

	@FindBy(xpath = "//div[.='Next']")
	private WebElement nextBtn;

	@FindBy(xpath = "(//div[contains(text(),'Chrome 88.0.4324.190')]/../../..//div[@class='cj-checkbox__view'])[1]")
	private WebElement chromeselCheckBox;


	@FindBy(xpath = "//div[.='Create']")
	private WebElement createBtn;


	public  void createJob(String jobName,String jobDesc) {

		websel.click();
		nextBtn.click();
		waitforElementToBeClickable(driver, jobNameEdt);
		jobNameEdt.sendKeys(jobName);
		jobDescription.sendKeys(jobDesc);
		nextBtn.click();
		chromeselCheckBox.click();
		createBtn.click();


	}
}
