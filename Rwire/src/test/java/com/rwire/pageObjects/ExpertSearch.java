package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExpertSearch
{
	WebDriver ldriver;
	
	   public ExpertSearch(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	   
	   
	   @FindBy(how = How.XPATH , using ="//button[normalize-space()='Expert']")
	    @CacheLookup
	    WebElement Expert;
	   
	   
	   public void ClickExpert()
	   {
		 
			   Expert.click();
	
	   }
	
}
