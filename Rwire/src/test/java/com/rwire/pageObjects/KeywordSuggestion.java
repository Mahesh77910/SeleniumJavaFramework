package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KeywordSuggestion 
{

	WebDriver ldriver;
	
	   public KeywordSuggestion  (WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	
	   // Keyword Button
	   @FindBy(how = How.XPATH , using ="//div[contains(@class,'footer-buttons')]//div[3]//button[1]")
	   @CacheLookup
	   WebElement Key;
	   
	   // Search Button
	   @FindBy(how = How.XPATH , using ="//button[@class='search-btn input-button-text-form ']")
	   @CacheLookup
	   WebElement Search;
	   
	   // Apply Button
	   @FindBy(how = How.XPATH , using ="//button[normalize-space()='Apply']")
	   @CacheLookup
	   WebElement apply;
	   
	   public void ClickKeywordbtn()
	   {
		   Key.click();
	   }
	   
	   public void ClickSearch()
	   {
		   Search.click();
	   }
	   
	   public void ClickApply()
	   {
		   apply.click();
	   }
	
}
