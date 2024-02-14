package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NumberSearch
{

	WebDriver ldriver;
	
	   public NumberSearch(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	    //Number Tab
	    @FindBy(how = How.XPATH , using ="//button[normalize-space()='Number']")
	    @CacheLookup
	    WebElement Number;
	    
	    public void ClickNumber()
	    {
	    	Number.click();
	    }
	
	    //Check Syntax
	    @FindBy(how = How.XPATH , using ="//div[@class='syntax-check']")
	    @CacheLookup
	    WebElement Cs;
	    
	    public void ClickChecksyntax()
	    {
	    	Cs.click();
	    }
	    
	  //Expert Search button
	    @FindBy(how = How.XPATH , using ="//button[normalize-space()='Search']")
	    @CacheLookup
	    WebElement ExpertSearch;
	    
	    public void ClickExpertSearch()
	    {
	    	ExpertSearch.click();
	    }
	    
}
