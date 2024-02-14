package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertTextTest_004 extends BaseClass
{

	
	@Test(priority=1)
	public void TitleTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"TI=(Signal OR device)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("TitleTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("TitleTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "TitleTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("TitleTest is Completed");
	}
	
	@Test(priority=2)
	public void AbstractTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AB=(Network AND Signal)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AbstractTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AbstractTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AbstractTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AbstractTest is Completed");
	}
	
	@Test(priority=3)
	public void ClaimTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CL=(Agri* AND Soil)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ClaimTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ClaimTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ClaimTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ClaimTest is Completed");
	}
	
	@Test(priority=4)
	public void DescTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"DESC=(Communicate OR Network)").build().perform();
		
		Expertbutton();
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("DescTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("DescTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "DescTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("DescTest is Completed");
	}
	
	@Test(priority=5)
	public void ALLTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"ALL=(trans*)").build().perform();
		
		Expertbutton();
		Thread.sleep(6000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ALLTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ALLTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ALLTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ALLTest is Completed");
		 Log.info("=======================================");
	}
}
