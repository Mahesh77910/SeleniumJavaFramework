package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClassesSuggestion 
{
	WebDriver ldriver;
	
	   public ClassesSuggestion (WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	
	   // Classes Button
	   @FindBy(how = How.XPATH , using ="//button[contains(@class,'input-button-text-form')][normalize-space()='Classes']")
	   @CacheLookup
	   WebElement Class;
	   
	   // Inside Search  Button
	   @FindBy(how = How.XPATH , using ="//button[@class='search-btn input-button-text-form ']")
	   @CacheLookup
	   WebElement s;
	   
	// Apply  Button
	   @FindBy(how = How.XPATH , using ="//button[normalize-space()='Apply']")
	   @CacheLookup
	   WebElement Ap;
	   
	   
	   public void ClickClassesbtn()
	   {
		 
	     Class.click();
	
	   }
	
	  public void Clicksearch()
	  { 
		  s.click();
	  }
	  
	  public void ClickApplybtn()
	  { 
		  Ap.click();
	  }
}
