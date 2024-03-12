package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PatentView 
{
	 WebDriver ldriver;

	public PatentView(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	 //Patent No
	 @FindBy(how = How.XPATH , using ="//div[@id='US10270479B2']")
	 @CacheLookup
	 WebElement Pub; 
	 public void ClickPatentNo()
	 {
		 
	  Pub.click();
	
	 }
	
	 //Classification
	 @FindBy(how = How.XPATH , using ="//button[normalize-space()='Classifications']")
	 @CacheLookup
	 WebElement Class; 
	 public void ClickClassification()
	 {
		 
	  Class.click();
	
	 }
	 
	//Claims
	 @FindBy(how = How.XPATH , using ="//button[normalize-space()='Claims']")
	 @CacheLookup
	 WebElement CL;   
	 public void ClickClaim()
	{
			 
	   CL.click();
		
	}
	 
	//Description
	 @FindBy(how = How.XPATH , using ="//button[normalize-space()='Description']")
	 @CacheLookup
	 WebElement Desc;	   
	 public void ClickDesc()
	{
				 
	  Desc.click();
			
	}
	 
	//Families
	 @FindBy(how = How.XPATH , using ="//button[normalize-space()='Families']")
	 @CacheLookup
	 WebElement Fam;	   
	 public void ClickFamilies()
	{
					 
	   Fam.click();
				
	}
	 
	//Citation
	@FindBy(how = How.XPATH , using ="//button[normalize-space()='Citations']")
	@CacheLookup
	WebElement Cit;	   
	public void ClickCitation()
	{
						 
	   Cit.click();
					
	}
	
	//Legal Events
	@FindBy(how = How.XPATH , using ="//button[normalize-space()='Legal Events']")
	@CacheLookup
	WebElement LE;	   
	public void ClickLE()
	{
							 
	  LE.click();
						
	}
	
	//Top
	//Legal Events
	@FindBy(how = How.XPATH , using ="//button[normalize-space()='Top']")
	@CacheLookup
	WebElement Tp;	   
	public void ClickTop()
	{
								 
	  Tp.click();
							
	}
	
	//Show all images
	@FindBy(how = How.XPATH , using ="//span[@class='show-all-btn']")
	@CacheLookup
	WebElement showall;	   
	public void Clickshowall()
	{
								 
		showall.click();
							
	}
	
	//Default button
	@FindBy(how = How.XPATH , using ="//button[normalize-space()='Default view']")
	@CacheLookup
	WebElement deft;	   
	public void ClickDefault()
	{
									 
		deft.click();
								
	}
	
	//SmartREader button
	@FindBy(how = How.XPATH , using ="//button[normalize-space()='Smart Reader']")
	@CacheLookup
	WebElement SmR;	   
	public void ClickSmartReader()
	{
										 
	 SmR.click();
									
	}
	
}
