package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath = "//a[@class='ico-login']")	
	WebElement login;
	
	
@FindBy(xpath = "//input[@id='Email']")
WebElement userName;

@FindBy(xpath = "//input[@id='Password']")
WebElement pasword;

@FindBy(xpath = "//input[@value='Log in']")
WebElement submit;

@FindBy (xpath = "(//a[@class='account'])[1]")
WebElement kiran;
public void test(String user, String pas) {
	
	
	login.click();
	userName.sendKeys(user);
	pasword.sendKeys(pas);	
	submit.click();
	

}	

public String accountVerify() {
	String actual  = kiran.getText();
	return actual;
	
	
	
	
}

}