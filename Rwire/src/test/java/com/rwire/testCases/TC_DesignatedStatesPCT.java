package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_DesignatedStatesPCT extends BaseClass
{
    @Test
	public void DesAllStatesPCT() throws InterruptedException, IOException
	{
		
	 Login();
	 
	 ExpertSearch es= new ExpertSearch(driver);
	 es.ClickExpert();
		
     WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
	 Actions a = new Actions(driver);
		
	 Thread.sleep(2000);
	 a.sendKeys(box ,"DSPCT=(EP)").build().perform();
		
	 Expertbutton();
	 Thread.sleep(2000);
		
	 PublicationNo();
	 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("DesAllStatesPCT is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("DesAllStatesPCT is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "DesAllStatesPCT");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("DesAllStatesPCT is Completed");
			
		
	}
	
    @Test(priority=2)
	public void RegionalCountryPCT() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"DSPCT_RGCN=(AM OR BW OR GM)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("RegionalCountryPCT is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("RegionalCountryPCT is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "RegionalCountryPCT");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("RegionalCountryPCT is Completed");
	}
	
    @Test(priority=3)
   	public void RegionalAnyOtherSPCT() throws InterruptedException, IOException
   	{   
   		
   		ClickRwireLogo();
   		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
   		
   		Actions a = new Actions(driver);
   		
   		Thread.sleep(2000);
   		a.sendKeys(box ,"DSPCT_AOST=(NA)").build().perform();
   		
   		Expertbutton();
   		
   		Thread.sleep(3000);
   		
   		PublicationNo();
   		 if(n>1)
   	      {
   	      	Assert.assertTrue(true);
   	      	
   	      	System.out.println("RegionalAnyOtherSPCT is Passed");
   	      	Log.info("Test is Passed");
   	      	
   	      }
   	      else
   	      {
   	    	  System.out.println("RegionalAnyOtherSPCT is Failed");
   	    	  Log.info("Test is Failed");
   	      	  CaptureScreen(driver, "RegionalAnyOtherSPCT");
   	           Assert.assertTrue(false);
   	      		
   	      }
   		 
   		 Log.info("RegionalAnyOtherSPCT is Completed");
   	}
    
    @Test(priority=4)
   	public void RegionalRCountryPCT() throws InterruptedException, IOException
   	{   
   		
   		ClickRwireLogo();
   		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
   		
   		Actions a = new Actions(driver);
   		
   		Thread.sleep(2000);
   		a.sendKeys(box ,"DSPCT_RGNCN=(AP OR EA)").build().perform();
   		
   		Expertbutton();
   		
   		Thread.sleep(3000);
   		
   		PublicationNo();
   		 if(n>1)
   	      {
   	      	Assert.assertTrue(true);
   	      	
   	      	System.out.println("RegionalRCountryPCT is Passed");
   	      	Log.info("Test is Passed");
   	      	
   	      }
   	      else
   	      {
   	    	  System.out.println("RegionalRCountryPCT is Failed");
   	    	  Log.info("Test is Failed");
   	      	  CaptureScreen(driver, "RegionalRCountryPCT");
   	           Assert.assertTrue(false);
   	      		
   	      }
   		 
   		 Log.info("RegionalRCountryPCT is Completed");
   	}
    
    @Test(priority=5)
   	public void PCTNational() throws InterruptedException, IOException
   	{   
   		
   		ClickRwireLogo();
   		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
   		
   		Actions a = new Actions(driver);
   		
   		Thread.sleep(2000);
   		a.sendKeys(box ,"DSPCT_NT=(BZ OR CA)").build().perform();
   		
   		Expertbutton();
   		
   		Thread.sleep(3000);
   		
   		PublicationNo();
   		 if(n>1)
   	      {
   	      	Assert.assertTrue(true);
   	      	
   	      	System.out.println("PCTNational is Passed");
   	      	Log.info("Test is Passed");
   	      	
   	      }
   	      else
   	      {
   	    	  System.out.println("PCTNational is Failed");
   	    	  Log.info("Test is Failed");
   	      	  CaptureScreen(driver, "PCTNational");
   	           Assert.assertTrue(false);
   	      		
   	      }
   		 
   		 Log.info("PCTNational is Completed");
   	}
    
    @Test(priority=6)
   	public void NewDesCountryPCT() throws InterruptedException, IOException
   	{   
   		
   		ClickRwireLogo();
   		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
   		
   		Actions a = new Actions(driver);
   		
   		Thread.sleep(2000);
   		a.sendKeys(box ,"DSPCT_NDSCN=(NA)").build().perform();
   		
   		Expertbutton();
   		
   		Thread.sleep(3000);
   		
   		PublicationNo();
   		 if(n>1)
   	      {
   	      	Assert.assertTrue(true);
   	      	
   	      	System.out.println("NewDesCountryPCT is Passed");
   	      	Log.info("Test is Passed");
   	      	
   	      }
   	      else
   	      {
   	    	  System.out.println("NewDesCountryPCT is Failed");
   	    	  Log.info("Test is Failed");
   	      	  CaptureScreen(driver, "NewDesCountryPCT");
   	           Assert.assertTrue(false);
   	      		
   	      }
   		 
   		 Log.info("NewDesCountryPCT is Completed");
   	}
}
