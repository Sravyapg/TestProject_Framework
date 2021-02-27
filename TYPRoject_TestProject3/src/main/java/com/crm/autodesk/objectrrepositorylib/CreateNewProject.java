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
public class CreateNewProject extends WebDriverUtiles{

	WebDriver driver;
	public CreateNewProject(WebDriver driver) {  
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "(//input[contains(@class,'iwp-input')])[1]")
	private WebElement projNameEdt;


	@FindBy(xpath = "(//input[contains(@class,'iwp-input')])[2]")
	private WebElement projDescription;


	@FindBy(xpath = "//div[@class= 'tp-mbw-nav-button ng-binding ng-scope blue']")
	private WebElement createprojBtn;


	/**
	 * 
	 * @param projName
	 * @param projDesc
	 */
	public  void createProject(String projName , String projDesc) {
		waitforElementToBeClickable(driver, projNameEdt);
		projNameEdt.sendKeys(projName);
		waitforElementToBeClickable(driver, projDescription);
		projDescription.sendKeys(projDesc);

		createprojBtn.click();
	}

}
