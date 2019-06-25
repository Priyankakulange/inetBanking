package com.inetBanking.testCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDt(String uname,String pass) throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		logger.info("user name provided");
		lp.setPassword(pass);
		logger.info("passward provided");
		lp.clickSubmit();
		Thread.sleep(5000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Loging Failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login Pass");
			Thread.sleep(3000);
			lp.clickLogout();
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
	}
	public boolean isAlertPresent()//user define method created to check alert is present or not
	{
		try
		{
			driver.switchTo().alert();
			return true;
			
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	@DataProvider(name="LoginData")
	String[][] getData() throws Exception
	{
		String path=System.getProperty("user.dir")+"//src//test//java//com//inetBanking//testData//LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
	
		
	
}