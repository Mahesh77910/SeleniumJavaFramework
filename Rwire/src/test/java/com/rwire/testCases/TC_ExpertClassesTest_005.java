package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertClassesTest_005 extends BaseClass
{
	

	@Test(priority=1)
	public void CPCTest() throws InterruptedException, IOException
	{
		
		Login();
		Thread.sleep(2000);
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CPC=(A61K2039505 OR H04W7204 OR H04W720406)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CPCTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CPCTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CPCTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CPCTest is Completed");
	}
	
	@Test(priority=2)
	public void CPCPTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CPCP=(C12N50609)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CPCPTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CPCPTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CPCPTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CPCPTest is Completed");
	}
	
	@Test(priority=3)
	public void ECLTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"ECL=(A61K3170 OR M07D40104 )").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ECLTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ECLTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ECLTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ECLTest is Completed");
	}
	
	@Test(priority=4)
	public void IPCTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"IPC=(H04L2906 OR G06K900 OR H01M10052 OR G06F30488)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("IPCTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("IPCTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "IPCTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("IPCTest is Completed");
	}
	
	@Test(priority=5)
	public void JCLTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"JCL=(2B043/BA02 OR 2B043/EB17 OR 2B043/EC14)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("JCLTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("JCLTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "JCLTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("JCLTest is Completed");
	}
	
	@Test(priority=6)
	public void USCTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"USC=(37411 OR 514/531)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("USCTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("USCTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "USCTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("USCTest is Completed");
	}
	
	@Test(priority=7)
	public void PCLTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"PCL=(H01M1004 OR C08L2205025)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PCLTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PCLTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PCLTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PCLTest is Completed");
		 
	}
	
	@Test(priority=8)
	public void LCTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"LC=(1404 OR 1216 OR 2402)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("LCTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("LCTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "LCTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("LCTest is Completed");
		 Log.info("============================================");
	}
}
