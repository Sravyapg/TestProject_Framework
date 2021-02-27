package com.crm.autodesk.objectrrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestInfo {
	public TestInfo(WebDriver driver) {             
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[contains(@class,'item-name-test-name tp-')]")
	  private WebElement successFullMsg;


	public WebElement getSuccessFullMsg() {
		return successFullMsg;
	}
	
	
}
