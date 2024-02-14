package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertOthersTest_10 extends BaseClass
{
	@Test(priority=1)
	public void AssigneeCountTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"ACN=(1)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AssigneeCountTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AssigneeCountTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AssigneeCountTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AssigneeCountTest is Completed");
	}
	
	@Test(priority=2)
	public void PublicationKCTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PKC=(D2 OR A4 OR B2)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PublicationKCTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PublicationKCTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PublicationKCTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PublicationKCTest is Completed");
	}

	@Test(priority=3)
	public void PublicationLangTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PL=(FRE)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PublicationLangTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PublicationLangTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PublicationLangTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PublicationLangTest is Completed");
	}
	
	@Test(priority=4)
	public void RelationalDocTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"RD=(US60286908)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("RelationalDocTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("RelationalDocTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "RelationalDocTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("RelationalDocTest is Completed");
		 Log.info("=======================================");
	}
}
