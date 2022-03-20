package com.test.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPOM {
	
	//Declaration
	
	@FindBy(xpath="//input[@name='firstname']") private WebElement userName;
	
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
	
	@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement gender;
	
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
	
	
	//Initilization
	
	SignUpPOM(WebDriver dri)
	{
		PageFactory.initElements(dri, this);
	}
	
	
	//Usage
	
	public void enterFirstName(String name) {
		userName.sendKeys(name);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enterEmail(String email1) {
		email.sendKeys(email1);
	}
	
	public void selectGender() {
		gender.click();
	}
	
	public void selectMonth(String value) {
		Select s1 = new Select(month);
		s1.selectByVisibleText(value);
		
	}
	



}

