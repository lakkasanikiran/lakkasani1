package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.BaseClass;


public class RegistrationPage  extends BaseClass{
	public RegistrationPage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//a[@class='ico-register']" )
	WebElement registerbotton;

	@FindBy (xpath ="//input[@id='gender-male']" )
	WebElement radiobutton;
	
	@FindBy (xpath = "//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']" )
	WebElement confrimPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement register;
	
	
	public void registerUser( String fname,String Lname,String mail) {
		registerbotton.click();
		radiobutton.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(Lname);
		email.sendKeys(mail);
		
	}
	public void userPassword(String Pasword,String ConfirmPassword) {
		password.sendKeys(Pasword);
		confrimPassword.sendKeys(ConfirmPassword);
		register.click();
	}
	
	
}
