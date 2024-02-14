package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_PatentStatusTest extends BaseClass
{
  
	@Test(priority=1)
	public void StatusFiledTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"LST=(FILED)").build().perform();
				
		Expertbutton();
		Thread.sleep(5000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("StatusFiledTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("StatusFiledTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "StatusFiledTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("StatusFiledTest is Completed");
	}
	
	@Test(priority=2)
	public void StatusGrantedTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"LST=(GRANTED)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("StatusGrantedTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("StatusGrantedTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "StatusGrantedTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("StatusGrantedTest is Completed");
		 
	}
	
	@Test(priority=2)
	public void StatusCeasedTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"LST=(CEASED)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("StatusCeasedTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("StatusCeasedTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "StatusCeasedTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("StatusCeasedTest is Completed");
		 Log.info("=======================================");
		 
	}
}
