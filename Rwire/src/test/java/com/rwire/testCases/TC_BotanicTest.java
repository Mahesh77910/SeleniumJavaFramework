package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_BotanicTest extends BaseClass
{

	@Test
	public void BONTest() throws InterruptedException, IOException
	{
		
		Login();
		Thread.sleep(2000);
		
		ExpertSearch e = new ExpertSearch(driver);
		
		e.ClickExpert();
		
		WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
			
		Actions a = new Actions(driver);
			
		Thread.sleep(2000);
		a.sendKeys(box ,"BON=(ROSA HYBRIDA OR CHRYSANTHEMUM X MORIFOLIUM OR FRAGARIA X ANANASSA )").build().perform();
		Thread.sleep(2000);
		
		Expertbutton();
		Thread.sleep(1000);
	
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("BONTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("BONTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "BONTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("BONTest is Completed");
			
	}
	
	@Test(priority=2)
	public void BOVTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"BOV=(CHAMELEON OR 15011 GR OR 15516 GR)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("BOVTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("BOVTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "BOVTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("BOVTest is Completed");
		 Log.info("=========================================");
		 
	}
	
	
	
	
	
}
