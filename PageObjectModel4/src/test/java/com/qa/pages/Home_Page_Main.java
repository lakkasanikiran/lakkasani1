package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Home_Page_Main extends BaseClass {

	public  Home_Page_Main(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}
	
	
	
	
}
