package com.inetBanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.AddCustomerPage;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddCustomer_003 extends BaseClass
{
 
	@Test
	public void addNewCustomer() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		logger.info("Providing Customer Details...");
		
		addcust.CustomerName("Priyanka");
		addcust.Customergender("Female");
		addcust.Customerdob("05","25","1990");
		Thread.sleep(3000);
		addcust.Customeraddress("INDIA");
		addcust.Customercity("PUNE");
		addcust.Customerstate("MH");
		addcust.Customepinno("411017");
		addcust.Customertelephone("9966552404");
	    String email=randomString()+"@gmail.com";
		addcust.Customeremailid(email);
		addcust.Customerpassword("1234567");
		addcust.Customersubmit();
		
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed...");
		}
		else
		{
			logger.info("Test case Failed...");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
}
