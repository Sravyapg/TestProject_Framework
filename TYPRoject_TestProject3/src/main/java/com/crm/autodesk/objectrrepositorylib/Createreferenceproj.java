package com.crm.autodesk.objectrrepositorylib;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

/**
 * 
 * @author Sravya
 *
 */
public class Createreferenceproj {


	@Test
	public void createProject() throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testproject.io/");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		String parent=driver.getWindowHandle();
		Set<String> alltab = driver.getWindowHandles();
		Iterator<String> it = alltab.iterator();
		while(it.hasNext()) {
			String child_window=it.next();

			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sravyapgupta@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sravya@123");

				driver.findElement(By.xpath("//input[@id='tp-sign-in']")).click();

				driver.findElement(By.xpath("//div[@class='icon-arrow-close']")).click();
				driver.findElement(By.xpath("//div[contains(text(),'New Project')]")).click();


				driver.findElement(By.xpath("(//input[contains(@class,'iwp-input')])[1]")).sendKeys("proj47");
				driver.findElement(By.xpath("(//input[contains(@class,'iwp-input')])[2]")).sendKeys("sampleproject47");
				//a[@class='link active']
				driver.findElement(By.xpath("//div[@class= 'tp-mbw-nav-button ng-binding ng-scope blue']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[contains(@class,'new-test-button')]")).click();
				driver.findElement(By.xpath("//div[.='Web']")).click();
				driver.findElement(By.xpath("//div[.='Next']")).click();
				driver.findElement(By.xpath("//input[@title='Test Name']")).sendKeys("webtest1");
				driver.findElement(By.xpath("//textarea[@placeholder='Test Description']")).sendKeys("samplewebtest1");
				driver.findElement(By.xpath("//div[.='Next']")).click();
				driver.findElement(By.xpath("//div[@class='tp-drop-list-icon-wrapper ng-scope']")).click();
				
				//span[.='Amazon']
				driver.findElement(By.xpath("//div[.='Add a new application for testing']")).click();
				driver.findElement(By.xpath("//div[.='Name:']/..//input[contains(@class,'tp-input')]")).sendKeys("Amazon");
				driver.findElement(By.xpath("//div[.='URL:']/..//input[contains(@class,'not-empty')]")).sendKeys("www.amazon.in/");
				//driver.findElement(By.xpath("//input[@class='tp-input ng-pristine ng-valid ng-isolate-scope tpi-light ng-empty tpi-error ng-touched']")).sendKeys("Amazon");

				//driver.findElement(By.xpath("//input[@class='tp-input ng-pristine ng-untouched ng-valid ng-isolate-scope tpi-light ng-not-empty']")).sendKeys("https://www.amazon.in/");
				driver.findElement(By.xpath("//div[.='Finish']")).click();
				
				
				
				//div[.='Name:']/..//input[contains(@class,'tp-input')]
				//input[contains(@class,'not-empty')]
				driver.findElement(By.xpath("//div[.='Next']")).click();
				driver.findElement(By.xpath("//div[.='Edit']")).click();
				driver.findElement(By.xpath("//div[.='Start editing']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[.='SAVE & EXIT']")).click();
				//span[.='SAVE & EXIT']
				
				
				
				
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[@class='emc-button-container']/div")).click();
				driver.findElement(By.xpath("//span[.='Web']")).click();
				
				driver.findElement(By.xpath("//div[.='Next']")).click();
				driver.findElement(By.xpath("//div[@class='cj__row cj__row--list']//input[contains(@class,'tp-input')]")).sendKeys("jobtest1");
				driver.findElement(By.xpath("//div[@class='mCSB_container mCS_y_hidden mCS_no_scrollbar_y']//textarea")).sendKeys("samplejobtest1");
				driver.findElement(By.xpath("//div[.='Next']")).click();
				
				driver.findElement(By.xpath("(//div[contains(text(),'Chrome 88.0.4324.190')]/../../..//div[@class='cj-checkbox__view'])[1]")).click();
				
				driver.findElement(By.xpath("//div[.='Create']")).click();
				Thread.sleep(3000);
				
				
				
				
				
				WebElement source = driver.findElement(By.xpath("//div[@class='content-item-containers tp-info-tooltip-box-project-drag-test']"));
				
				WebElement target = driver.findElement(By.xpath("//div[@class='ddi-placeholder ng-scope']"));
				Thread.sleep(3000);
				Actions a = new Actions(driver); 
				a.dragAndDrop(source, target).perform();
				driver.findElement(By.xpath("//div[.='jobtest1']")).click();
				driver.findElement(By.xpath("//div[.='jobtest1']/../../../../..//div[@title='Run']")).click();
				
				
			
	               	Thread.sleep(10000);
				driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
				//WebDriverWait wait = new WebDriverWait(driver, 100);
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='pie-center-border']"))));
				//driver.navigate().refresh();
				Thread.sleep(2400);
				driver.findElement(By.xpath("//div[contains(@class,'user-default-avatar')]")).click();
						driver.findElement(By.xpath("//a[.='Logout']")).click();
						
						









			}
		}
	}
}
