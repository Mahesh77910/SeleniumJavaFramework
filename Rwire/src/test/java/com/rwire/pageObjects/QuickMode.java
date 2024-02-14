package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class QuickMode 
{
	
	WebDriver ldriver;

	public QuickMode(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	//Filter Apply button
	@FindBy(how = How.XPATH , using ="(//button[@class='ms-5 me-4 btn'])[9]")
	@CacheLookup
	WebElement btn; 
	
	
	public void ClickApply()
	{
	  btn.click();
	}
}
