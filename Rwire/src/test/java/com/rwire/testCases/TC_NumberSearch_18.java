package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.NumberSearch;

public class TC_NumberSearch_18 extends BaseClass
{

	@Test(priority=1)
	public void PubnoAllcheckTest() throws InterruptedException, IOException
	{
		
		Login();
		Thread.sleep(3000);
		NumberSearch s = new NumberSearch(driver);
    	s.ClickNumber();
		
		//Click Application Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Application']")).click();
		
    	//Click Priority Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Priority']")).click();
		
    	Thread.sleep(2000);
        WebElement Numbox =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
 		
 		Actions a = new Actions(driver);
 		
 		Thread.sleep(2000);
 		a.sendKeys(Numbox ,"US10524552B2 OR US10524720B2 OR US10524770B2").build().perform();
 		Thread.sleep(2000);
 		
 		NumberSearch s1 = new NumberSearch(driver);
    	s1.ClickChecksyntax();
    	Thread.sleep(2000);
    	s1.ClickExpertSearch();
    	
    	PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PubnoAllcheckTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PubnoAllcheckTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PubnoAllcheckTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PubnoAllcheckTest is Completed");
   	
       	Thread.sleep(2000);
			
	}
	
	@Test(priority=2)
	public void AppnoAllcheckTest() throws InterruptedException, IOException
	{
		
		ClickRwireLogo();
		
		WebElement Numbox =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
	 		
	 	Actions a = new Actions(driver);
	 		
	 	Thread.sleep(2000);
	 	a.sendKeys(Numbox ,"US15710316 OR US15110746").build().perform();
	 	Thread.sleep(2000);
	 		
	 	NumberSearch s1 = new NumberSearch(driver);
	    s1.ClickChecksyntax();
	    Thread.sleep(2000);
	    s1.ClickExpertSearch();
	    
	    PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AppnoAllcheckTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AppnoAllcheckTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AppnoAllcheckTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AppnoAllcheckTest is Completed");
		 Thread.sleep(2000);
				
	}
	
	@Test(priority=3)
	public void PRNnoAllcheckTest() throws InterruptedException, IOException
	{
		
		ClickRwireLogo();
		
		WebElement Numbox =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
	 		
	 	Actions a = new Actions(driver);
	 		
	 	Thread.sleep(2000);
	 	a.sendKeys(Numbox ,"US15110746 OR US14936458").build().perform();
	 	Thread.sleep(2000);
	 		
	 	NumberSearch s1 = new NumberSearch(driver);
	    s1.ClickChecksyntax();
	    Thread.sleep(2000);
	    s1.ClickExpertSearch();
	    
	    PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PRNnoAllcheckTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PRNnoAllcheckTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PRNnoAllcheckTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PRNnoAllcheckTest is Completed");
		 Log.info("=========================================");
		 Thread.sleep(2000);
				
	}
}
