package com.crm.autodesk.objectrrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author sravya
 *
 */

public class ProjectInfo {
	public ProjectInfo(WebDriver driver) {             
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'project-item-name tp-text')]")
	private WebElement successFullMSG;

	public WebElement getSuccessFullMSGProject() {
		return successFullMSG;
	}

}
