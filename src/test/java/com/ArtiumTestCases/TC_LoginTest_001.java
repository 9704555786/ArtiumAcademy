package com.ArtiumTestCases;

import java.awt.AWTException;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.ArtiumPageObject.LoginPage;

public class TC_LoginTest_001 extends Baseclass {

	@Test
	public void loginTest() throws InterruptedException, AWTException {
		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);
		lp.bookFreeTrial();
		lp.setUserName(UserName);
		lp.mobileNumber(MobileNo);// By default i am selecting country India (to Handle use Selection class)
		lp.continuve();
		Thread.sleep(5000);
		
		// 2nd Login page
		
		lp.age();
		lp.selectGender();
		lp.emailId(emailId);
		  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)","");
		
     
		Actions actions = new Actions(driver);
		
		WebElement State = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
		
		Thread.sleep(10000);
		
		actions.moveToElement(State).click().build().perform();
		
		List<WebElement> StateSelect = driver.findElements(By.xpath("//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-1vi33gt']")); 
				 System.out.println(StateSelect.size());
		for(WebElement StateType :StateSelect ) {
			if(StateType.getText().equals("Maharashtra"));//SelectionClass Also available
			StateType.click();
			break;
		}
				 
		lp.nextButtonClick();
		
		//3rd Login page activity
		lp.selectInstrument();
		lp.SelecttypeofInstument();
		lp.secondnextButton();
		//ConfirmationSlot
		lp.SelectDate();
		lp.SelectTime();
		lp.lastConfirmation();
	
		
	}

}
