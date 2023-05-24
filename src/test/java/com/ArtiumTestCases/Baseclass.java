package com.ArtiumTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public String baseURL = "https://artiumacademy.com/";
	public String UserName = randomstr()+"Raj";
	public String MobileNo = randomNum()+"564824";
	public String emailId = randomstr()+"@gmail.com";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown() {
		// driver.quit();
	}
	public String  randomNum() {
		String ranNum=RandomStringUtils.randomNumeric(4);
		return ranNum;
		}
	public String  randomstr() {		
		String ranStr=RandomStringUtils.randomAlphabetic(8);
		return ranStr;
		}
}
