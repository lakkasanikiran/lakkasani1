package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class Tc_LoginPage_003 extends BaseClass {
	public LoginPage lp;
	
	@Test(priority = 1)
	public void test1() {
		Tc_linkTest_001 obj=new Tc_linkTest_001();
		obj.linkTest();
		
		
	}
	@Test(priority = 2)
	public void test2() {
	  lp=new LoginPage(driver);
		lp.test("lovelykiranvj@gmail.com", "Kirruu@123");
	}
	
	
	@Test(priority = 3)
	public void test3() {
		lp=new LoginPage(driver);
		String actualemail = lp.accountVerify();
		System.out.println("act=" +actualemail);
		String expactaedEmail="lovelykiranvj@gmail.com";
		System.out.println("exp="+expactaedEmail);
		
		Assert.assertEquals(actualemail, expactaedEmail);
	}
}
