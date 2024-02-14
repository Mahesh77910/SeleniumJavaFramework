package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Smartsearch 
{

	 WebDriver ldriver;
		
	   public Smartsearch(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	 
	 //Smart Search
    @FindBy(how = How.XPATH , using ="//input[@placeholder='Enter keywords or publication number ']")
    @CacheLookup
    WebElement Searchbar;
    
    //Below Search button
    @FindBy(how = How.XPATH , using ="//button[normalize-space()='Search']")
    @CacheLookup
    WebElement Searchbutton;
    
    // Publication results
//    @FindBy(how = How.XPATH , using ="//*[@id=\"root\"]/div[2]/div/div/div/div[2]/div[3]/div[1]/label/span")
//    @CacheLookup
//    WebElement Pubresults;
    
    //BackLogo
    @FindBy(how = How.CSS , using ="#root > div.container-fluid.sticky-top.bg-white.shadow-sm > div > nav > div:nth-child(1) > a")
    @CacheLookup
    WebElement Logo;
    
    
    
    public void SSearch(String smartinput)
    {
    	Searchbar.sendKeys(smartinput);
    }
    
    public void ClickSearch() throws InterruptedException
    {
    	
    	Searchbutton.click();
    	
    	
    }
    
//    public void Publication() throws InterruptedException
//    {  
//    	Thread.sleep(3000);
//    	String records = Pubresults.getText();
//    	
//    	String m = records.replaceAll("[()]", "");
//		 
//		 System.out.println(m);
//		 
//		 int n =Integer.parseInt(m);
//			
//			if(n==0)
//			{
//				System.out.println("Test is Failed");
//				
//			}
//			
//			else
//			{
//				System.out.println("Test is Passed");
//			}
//    }
    
    public void Backlogo() throws InterruptedException
    {
    	Thread.sleep(1000);
    	Logo.click();
    }
    
}
