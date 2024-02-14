package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertNumbersTest_007 extends BaseClass
{

	@Test(priority=1)
	public void PublicationNoTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PN=(US10668860B2 OR WO2020151188A1)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PublicationNoTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PublicationNoTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PublicationNoTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PublicationNoTest is Completed");
	}
	
	@Test(priority=2)
	public void ApplicationNoTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AN=(US15094904 OR WOCN20079637)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ApplicationNoTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ApplicationNoTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ApplicationNoTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ApplicationNoTest is Completed");
	}
	
	
	
	@Test(priority=3)
	public void PriorityNoTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PRN=(US15593032 OR JP2018139996 OR JP2018141332)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PriorityNoTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PriorityNoTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PriorityNoTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PriorityNoTest is Completed");
	}
	
	
	@Test(priority=4)
	public void PCTAppNoTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PCT=(WOFR16050184 OR WOUS14044726)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PCTAppNoTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PCTAppNoTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PCTAppNoTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PCTAppNoTest is Completed");
	}
	
	@Test(priority=5)
	public void PCTPubNoTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PCTN=(WO2014210554 OR WO2016061754)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PCTPubNoTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PCTPubNoTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PCTPubNoTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PCTPubNoTest is Completed");
	}
	
	
	@Test(priority=6)
	public void ProvisionalAppNoTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PVN=(NA)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ProvisionalAppNoTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ProvisionalAppNoTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ProvisionalAppNoTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ProvisionalAppNoTest is Completed");
		 
	}
	
	@Test(priority=7)
	public void CompleteFamilyTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CF=(US20160267513A1 OR US11362988B2 OR US11362988B2)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CompleteFamilyTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CompleteFamilyTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CompleteFamilyTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CompleteFamilyTest is Completed");
		 
	}
		
	@Test(priority=8)
	public void DomesticFamilyTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"DF=(WO2020229598A1 OR EP3642102A1 OR WO2020239930A1)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("DomesticFamilyTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("DomesticFamilyTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "DomesticFamilyTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("DomesticFamilyTest is Completed");
		 
	}
	
	@Test(priority=9)
	public void ExtendedFamilyTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"EF=(US20200048047A1 OR CN108861916B)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ExtendedFamilyTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ExtendedFamilyTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ExtendedFamilyTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ExtendedFamilyTest is Completed");
		 
	}
	
	@Test(priority=10)
	public void MainFamilyTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"MF=(US20190207443A1 OR US20170264168A1)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("MainFamilyTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("MainFamilyTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "MainFamilyTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("MainFamilyTest is Completed");
		 
	}
	
	@Test(priority=11)
	public void SimpleFamilyTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"SF=(EP3720150A1 OR US20200153401A1 OR WO2020013226A1)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("SimpleFamilyTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("SimpleFamilyTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "SimpleFamilyTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("SimpleFamilyTest is Completed");
		 Log.info("============================================");
		 
	}
}
