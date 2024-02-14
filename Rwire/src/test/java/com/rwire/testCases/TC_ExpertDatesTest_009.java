package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertDatesTest_009 extends BaseClass
{
	@Test(priority=1)
	public void ApplicationDateTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ," AD>=(20000601)AND AD<=(20220601)").build().perform();
		
		Expertbutton();
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ApplicationDateTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ApplicationDateTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ApplicationDateTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ApplicationDateTest is Completed");
	}
	
	@Test(priority=2)
	public void ApplicationYearTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ," AY>=(2017) AND AY<=(2018)").build().perform();
		
		Expertbutton();
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ApplicationYearTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ApplicationYearTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ApplicationYearTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ApplicationYearTest is Completed");
	}
	
	@Test(priority=3)
	public void PCTAppDateTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PCTAD>=(20080501) AND PCTAD<=(20150611)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PCTAppDateTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PCTAppDateTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PCTAppDateTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PCTAppDateTest is Completed");
	}
	@Test(priority=4)
	public void PCTPubDateTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PCTAD=(20100506)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PCTPubDateTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PCTPubDateTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PCTPubDateTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PCTPubDateTest is Completed");
	}
	
	@Test(priority=5)
	public void PriorityDateTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PRD>=(20170506)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PriorityDateTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PriorityDateTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PriorityDateTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PriorityDateTest is Completed");
	}
	
	@Test(priority=6)
	public void PriorityYearTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PRY<=(2012506)").build().perform();
		
		Expertbutton();
		Thread.sleep(7000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PriorityYearTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PriorityYearTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PriorityYearTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PriorityYearTest is Completed");
	}
	
	@Test(priority=7)
	public void PublicationDateTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PD>=(20200101) AND PD<=(20201231)").build().perform();
		
		Expertbutton();
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PublicationDateTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PublicationDateTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PublicationDateTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PublicationDateTest is Completed");
	}
	
	@Test(priority=7)
	public void PublicationYearTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PY>=(2020) AND PY<=(2022)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PublicationYearTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PublicationYearTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PublicationYearTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PublicationYearTest is Completed");
	}
	
	@Test(priority=8)
	public void ExpiryDateTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ," ED>=(20150623) AND ED<=(20300623)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ExpiryDateTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ExpiryDateTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ExpiryDateTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ExpiryDateTest is Completed");
		 Log.info("=======================================");
	}
}
