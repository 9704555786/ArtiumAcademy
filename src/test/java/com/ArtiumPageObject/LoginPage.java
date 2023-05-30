package com.ArtiumPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy (xpath="//span[contains(text(),'Book a free trial')]")
	WebElement clickOption;
	
	@FindBy (xpath="//input[@id='learner-name']")
	WebElement UserName;
	
	@FindBy (xpath="//input[@id='standard-number']")
	WebElement MobileNo;
	
	@FindBy (xpath="//button[normalize-space()='Continue']")
	WebElement ContinueButton;
			//2nd LoginPage
	@FindBy (xpath="//span[normalize-space()='22-30']")
	WebElement AgeGroup;
	
	@FindBy (xpath="//span[normalize-space()='Male']")
	WebElement Gender;
	
	@FindBy (xpath="//input[@id='learner-email']")
	WebElement EmailId;
	
/*	@FindBy (xpath="//div[@id='state']")
	WebElement StateClick;
	
	@FindBy (xpath="//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-1vi33gt']")
	WebElement Dropdown; */
	
	@FindBy (xpath="//button[normalize-space()='Next']")
	WebElement NextButton; 
	//3rd Login Page
	
	@FindBy (xpath="//div[@class='cursor-pointer']")
	WebElement Instrument;
	
	@FindBy (xpath="(//div[@class='course-info'])[3]")
	WebElement Tabla;
	
	@FindBy (xpath="//button[normalize-space()='Next']")
	WebElement SecNextButton;
	//Confirmation last step of login
	//span[text()='29']
	@FindBy (xpath="//span[text()='04']")
	WebElement Date;
	
	@FindBy (xpath="//div[@class='time-info-container']//button[4]")
	WebElement Time;
	
	@FindBy (xpath="//button[normalize-space()='Confirm Slot']")
	WebElement ConfirmatioSlot;
	
	//LoginFirst page
	
	public void bookFreeTrial() {
		clickOption.click();
	}	
	public void setUserName(String uname) {
		UserName.sendKeys(uname);
	}
	public void mobileNumber(String number) {
		MobileNo.sendKeys(number);
	}
	public void continuve() {
		ContinueButton.click();
	}
	//2nd Login page
	public void age() {
		AgeGroup.click();
	}	
	public void selectGender() {
		Gender.click();
	}
	public void emailId(String email) {
		EmailId.sendKeys(email);
	}
/*	public void selectState() {
		StateClick.click();
	}
	public void Dropdown() {
		Dropdown.click();
	}*/
	public void nextButtonClick() {
		NextButton.click();
	}
	//3rd Login Page
	public void selectInstrument() {
		Instrument.click();
	}
	public void SelecttypeofInstument() {
		Tabla.click();
	}
	public void secondnextButton() {
		SecNextButton.click();
}
	public void SelectDate() {
		Date.click();
	}
	public void SelectTime() {
		Time.click();
	}
	
	public void lastConfirmation() {
		ConfirmatioSlot.click();
	}
}
