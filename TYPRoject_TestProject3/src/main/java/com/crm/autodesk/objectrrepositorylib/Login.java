package com.crm.autodesk.objectrrepositorylib;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class Login {  
	public WebDriver driver;
	public Login(WebDriver driver) {           
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy (xpath = "//input[@id='username']")
	WebElement usernameEdt1;
	
    
    @FindBy(xpath="//input[@id='password']")
    private WebElement passwordEdt;
    
    @FindBy(xpath="//input[@id='tp-sign-in']")
    private WebElement loginButon;
    

   
    
	public WebElement getUsernameEdt() {       
		return usernameEdt1;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginButon() {
		return loginButon;
	}
    
	public void loginToApp(String username , String password) throws InterruptedException {  
		
		Thread.sleep(3000);
				usernameEdt1.sendKeys(username);
				passwordEdt.sendKeys(password);
				loginButon.click();

}
	public void loginToApp() {           
		usernameEdt1.sendKeys("sravyapgupta@gmail.com");
		passwordEdt.sendKeys("Sravya@123");
		loginButon.click();
	}
    
}

