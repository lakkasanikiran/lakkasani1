package com.qa.pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@id='pollanswers-1']")
	WebElement exlent;

	
@FindBy(xpath ="//ul[@class='top-menu'] /li/a ")
  WebElement book;  


@FindBy(xpath = "//select[@id='products-orderby']")

WebElement dropdown;
 Select sc=new Select(dropdown);
 





   public void test() {
	exlent.click();
	book.click();
}
}