package com.test.signup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class TestCase02 {
	
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", Configurations.driverPath);
	WebDriver driver = new ChromeDriver();	
	driver.get(Configurations.appURL);
	driver.manage().window().maximize();
	
	SignUpPOM signup  = new SignUpPOM(driver); 
	Utility util = new Utility();
	
	//TC01
	signup.enterFirstName(util.readExcelSheet(1, 1));
	signup.enterLastName(util.readExcelSheet(2, 1));
	signup.enterEmail(util.readExcelSheet(3, 1));
	signup.selectGender();
	signup.selectMonth(util.readExcelSheet(4, 1));
	
	
	Thread.sleep(4000);
	driver.get(Configurations.appURL);
	//TC02
	signup.enterFirstName(util.readExcelSheet(1, 2));
	signup.enterLastName(util.readExcelSheet(2, 2));
	signup.enterEmail(util.readExcelSheet(3, 2));
	signup.selectGender();
	signup.selectMonth(util.readExcelSheet(4, 2));
	
	
	Thread.sleep(4000);
	
	//TC03
	driver.get(Configurations.appURL);
	signup.enterFirstName(util.readExcelSheet(1, 3));
	signup.enterLastName(util.readExcelSheet(2, 3));
	signup.enterEmail(util.readExcelSheet(3, 3));
	signup.selectGender();
	signup.selectMonth(util.readExcelSheet(4, 3));
}




}
