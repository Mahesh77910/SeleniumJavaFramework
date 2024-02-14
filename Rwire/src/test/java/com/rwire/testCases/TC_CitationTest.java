package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_CitationTest extends BaseClass
{
    @Test
	public void BCNTest() throws InterruptedException, IOException
	{
		
	    Login();
	 
	    ExpertSearch t = new ExpertSearch(driver);
		
		t.ClickExpert();
		
		WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
			
		Actions a = new Actions(driver);
			
		Thread.sleep(2000);
		a.sendKeys(box ,"BCN=(International Search Report)").build().perform();
		Thread.sleep(2000);
		
		Expertbutton();
		Thread.sleep(1000);
	
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("BCNTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("BCNTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "BCNTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("BCNTest is Completed");
			
	}
	
    @Test(priority=2)
	public void BCPTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"BCP=(US20020118109A1 OR US20180295897A1 OR US20160174626A1)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("BCPTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("BCPTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "BCPTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("BCPTest is Completed");
		 	 
	}
	
    @Test(priority=3)
  	public void FCPTest() throws InterruptedException, IOException
  	{   
  		
  		ClickRwireLogo();
  		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
  		
  		Actions a = new Actions(driver);
  		
  		Thread.sleep(2000);
  		a.sendKeys(box ,"FCP=(US11344788B1 OR US20220110231A1 OR US10974914B2 OR US11273944B2)").build().perform();
  		
  		Expertbutton();
  		Thread.sleep(2000);
  		
  		PublicationNo();
  		 if(n>1)
  	      {
  	      	Assert.assertTrue(true);
  	      	
  	      	System.out.println("FCPTest is Passed");
  	      	Log.info("Test is Passed");
  	      	
  	      }
  	      else
  	      {
  	    	  System.out.println("FCPTest is Failed");
  	    	  Log.info("Test is Failed");
  	      	  CaptureScreen(driver, "FCPTest");
  	           Assert.assertTrue(false);
  	      		
  	      }
  		 
  		 Log.info("FCPTest is Completed");
  		 Log.info("=========================================");	 
  	}
	
		
}
