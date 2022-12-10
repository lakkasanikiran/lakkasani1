package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class Tc_HomePage_004 extends BaseClass {

	
	
	@Test(priority = 1)
	public void test1() {
		Tc_linkTest_001 obj=new Tc_linkTest_001();
		obj.linkTest();
		
	}
	@Test(priority = 2)
	public void test2() {
		Tc_LoginPage_003 obj1=new Tc_LoginPage_003();
	   obj1.test2();
	}
	@Test(priority = 3)
	public void test3() {
		HomePage obj2=new HomePage(driver);
		obj2.test();
	}
}
