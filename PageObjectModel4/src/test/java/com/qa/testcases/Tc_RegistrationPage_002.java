package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegistrationPage;

public class Tc_RegistrationPage_002 extends BaseClass {
	@Test(priority = 1)
	public void test1() {
		Tc_linkTest_001 obj=new Tc_linkTest_001();
		obj.linkTest();
		
	}
	@Test(priority = 2)
	public void test2() {
		RegistrationPage obj1=new RegistrationPage(driver);
		obj1.registerUser("Kiran", "Lakkasani", "lovelykiranvj@gmail.com");
	}
	
	@Test(priority = 3)
	public void test3() {
		RegistrationPage obj2=new RegistrationPage(driver);
		obj2.userPassword("Kirruu@123", "Kirruu@123");
	}

}
