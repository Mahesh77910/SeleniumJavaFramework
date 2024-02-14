package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PatentResult 
{

	WebDriver ldriver;
	
	   public PatentResult(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	   
	// Quick
	   @FindBy(how = How.XPATH , using ="//button[contains(@class,'header-table-result-page')]")
	   @CacheLookup
	   WebElement quick1;
	   
	   
	   
	   // Table
	   @FindBy(how = How.XPATH , using ="//div[@class='table-button cursor-pointer button-enabled']")
	   @CacheLookup
	   WebElement Table1;
	   
	   // Sort
	   @FindBy(how = How.XPATH , using ="//button[@data-bs-toggle='dropdown']")
	   @CacheLookup
	   WebElement Sort1;
	   
	  public void ClickQuick()
		  {
			  quick1.click();
		  } 
	  
	  public void Clicktable()
	  {
		  Table1.click();
	  }
	  
	  public void ClickSort()
	  {
		  Sort1.click();
	  }
	
}
