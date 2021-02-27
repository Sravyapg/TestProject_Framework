package com.crm.autodesk.objectrrepositorylib;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobInfo {
	public JobInfo(WebDriver driver) {             
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'item-job-name tp-')]")
	private WebElement successFullMSG;

	public WebElement getSuccessFullMSGJob() {
		return successFullMSG;
	}

	
	
	
}
