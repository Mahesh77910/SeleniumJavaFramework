package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_PatentTypeTest extends BaseClass
{

	@Test(priority=1)
	public void TypeUtilityTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PTS=(UTILITY)").build().perform();
				
		Expertbutton();
		Thread.sleep(5000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("TypeUtilityTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("TypeUtilityTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "TypeUtilityTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("TypeUtilityTest is Completed");
	}
	
	@Test(priority=2)
	public void TypeDesignTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PTS=(DESIGN)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("TypeDesignTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("TypeDesignTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "TypeDesignTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("TypeDesignTest is Completed");
		 
	}
	
	@Test(priority=2)
	public void TypePlantTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PTS=(PLANT)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("TypePlantTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("TypePlantTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "TypePlantTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("TypePlantTest is Completed");
		 Log.info("=======================================");
		 
	}
}
