package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Cognizance 
{

	WebDriver ldriver;
	
	   public Cognizance (WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	
	
}
