package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword 
{

	WebDriver ldriver;
	
	   public Forgotpassword(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	    //Forgot password hyperlink
	    @FindBy(how = How.XPATH , using ="//a[normalize-space()='Forgot password?']")
	    @CacheLookup
	    WebElement Forgotpasswd; 
	   
	    //Email Textbox
	    @FindBy(how = How.XPATH , using ="//input[@id='floatingInput']")
	    @CacheLookup
	    WebElement enteremail; 
	   
	    //Reset Button
	    @FindBy(how = How.XPATH , using ="//button[normalize-space()='Reset Password']")
	    @CacheLookup
	    WebElement Resetbtn;
	    
	   public void Clickforgotpassword()
	   {
		 
		   Forgotpasswd.click();
	
	   }
	   
	   public void EnterEmail(String email)
	   {
		   enteremail.sendKeys(email);
	   }
	   
	   public void ClickResetButton()
	   {
		 
		   Resetbtn.click();
	
	   }
}

