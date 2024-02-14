package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_PatentPubTest extends BaseClass
{

	@Test(priority=1)
	public void PubApplicationTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PT=(APPLICATION)").build().perform();
				
		Expertbutton();
		Thread.sleep(5000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PubApplicationTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PubApplicationTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PubApplicationTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PubApplicationTest is Completed");
	}
	
	@Test(priority=2)
	public void PubGrantTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PT=(GRANT)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PubGrantTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PubGrantTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PubGrantTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PubGrantTest is Completed");
		 Log.info("=======================================");
		 
	}
	
}
