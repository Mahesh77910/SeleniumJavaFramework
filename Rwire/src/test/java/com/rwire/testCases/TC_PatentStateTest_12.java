package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_PatentStateTest_12 extends BaseClass
{
  
	@Test(priority=1)
	public void StateAliveTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"ALD=(Alive)").build().perform();
				
		Expertbutton();
		Thread.sleep(5000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("StateAliveTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("StateAliveTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "StateAliveTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("StateAliveTest is Completed");
	}
	
	@Test(priority=2)
	public void StateDeadTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"ALD=(DEAD)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("StateDeadTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("StateDeadTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "StateDeadTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("StateDeadTest is Completed");
		 Log.info("=======================================");
	}
	
}
