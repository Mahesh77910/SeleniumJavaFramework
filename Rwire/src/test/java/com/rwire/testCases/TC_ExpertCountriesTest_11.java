package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertCountriesTest_11 extends BaseClass
{
	@Test(priority=1)
	public void PubCountryTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PNC=(EP OR JP)").build().perform();
		
		Expertbutton();
		Thread.sleep(7000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PubCountryTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PubCountryTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PubCountryTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PubCountryTest is Completed");
	}
	
	@Test(priority=2)
	public void AppCountryTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AC=(US)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AppCountryTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AppCountryTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AppCountryTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AppCountryTest is Completed");
	}
	
	@Test(priority=3)
	public void PriorityCountryTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PRC=(WO)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PriorityCountryTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PriorityCountryTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PriorityCountryTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PriorityCountryTest is Completed");
	}
	
	@Test(priority=4)
	public void PCTPubCountryTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PCTPC=(WO)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PCTPubCountryTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PCTPubCountryTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PCTPubCountryTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PCTPubCountryTest is Completed");
		 Log.info("=======================================");
	}
}
