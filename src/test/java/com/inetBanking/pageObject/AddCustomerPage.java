package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH,using="//a[ @href=\"addcustomerpage.php\"]")
	@CacheLookup
	WebElement lnkAddNewCustomer;

	
	@FindBy(how=How.NAME,using="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME,using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.ID_OR_NAME,using="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.NAME,using="addr")
	@CacheLookup
	WebElement txtaddr;
	
	@FindBy(how=How.NAME,using="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.NAME,using="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how=How.NAME,using="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how=How.NAME,using="telephoneno")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(how=How.NAME,using="emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how=How.NAME,using="sub")
	@CacheLookup
	WebElement btnsub;
	
	@FindBy(how=How.NAME,using="res")
	@CacheLookup
	WebElement btnreset;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();	
	}
	public void CustomerName(String cname)
	{
		txtCustomerName.sendKeys(cname);	
	}
	public void Customergender(String cgender)
	{
		rdGender.click();
	}
	
	public void Customerdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void Customeraddress(String caddress)
	{
		txtaddr.sendKeys(caddress);
	}
	
	public void Customercity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void Customerstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	
	public void Customepinno(String cpinno)
	{
		txtpinno.sendKeys(String.valueOf(cpinno));
	}
	
	public void Customertelephone(String ctelephone)
	{
		txttelephoneno.sendKeys(ctelephone);
	}
	
	public void Customeremailid(String cemailid)
	{
		txtemailid.sendKeys(cemailid);
	}
	
	public void Customerpassword(String cpassword)
	{
		txtpassword.sendKeys(cpassword);
	}
	
	public void Customersubmit()
	{
		btnsub.click();;
	}
	
	public void Customerreset()
	{
		btnreset.click();;
	}
	
	
	
	
	
	
	
	

}
