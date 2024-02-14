package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FieldSearch 
{

	WebDriver ldriver;
	
	   public FieldSearch(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	 
	   
	    //First Textbox
	    @FindBy(how = How.XPATH , using ="//textarea[@id='txt_4']")
	    @CacheLookup
	    WebElement Textbox1;
	   
	   
	   //Fielded Search button
	   @FindBy(how = How.XPATH , using ="//*[@id=\"Fielded\"]/div/div[1]/div[2]/div[2]/div[3]/div[2]/button")
	    @CacheLookup
	    WebElement FieldSbutton;
	   
	    //Select all button -Export
	    @FindBy(how = How.XPATH , using ="//label[normalize-space()='Select All']")
	    @CacheLookup
	    WebElement Selectcheckbox;
	   
	    //Second Textbox
	    @FindBy(how = How.XPATH , using ="//textarea[@id='txt_5']")
	    @CacheLookup
	    WebElement Textbox2;
	   
	   //Third Textbox
	    @FindBy(how = How.XPATH , using ="//textarea[@id='txt_6']")
	    @CacheLookup
	    WebElement Textbox3;
	   
	    //Fourth Textbox
	    @FindBy(how = How.XPATH , using ="//textarea[@id='txt_7']")
	    @CacheLookup
	    WebElement Textbox4;
	    
	    
	    //Country Textbox
	    @FindBy(how = How.XPATH , using ="//textarea[@id='txt_9']")
	    @CacheLookup
	    WebElement Textbox6;
	    
	    //Date Dropdown
	   
	   
	   public void FirstTextbox(String Textinput)
	    {
	    	Textbox1.sendKeys(Textinput);
	    }
	   
	   
	   public void SecondTextbox(String Textinput)
	    {
	    	Textbox2.sendKeys(Textinput);
	    }
	   
	   public void ThirdTextbox(String Textinput)
	    {
	    	Textbox3.sendKeys(Textinput);
	    }
	   
	   public void FourthTextbox(String Textinput)
	    {
	    	Textbox4.sendKeys(Textinput);
	    }
	
	   public void SixTextbox(String Textinput)
	    {
	    	Textbox6.sendKeys(Textinput);
	    }
	   
	   public void Searchbutton()
	   {
		   FieldSbutton.click();
	   }
	   
	   public void Clickselectall()
	   {
		   Selectcheckbox.click();
	   }
	
}
