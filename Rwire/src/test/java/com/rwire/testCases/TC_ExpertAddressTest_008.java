package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertAddressTest_008 extends BaseClass
{

	@Test(priority=1)
	public void ApplicantAddTest() throws InterruptedException, IOException
	{
		
		Login();
		Thread.sleep(2000);
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"APA=(San Jose, CA, US)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ApplicantAddTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ApplicantAddTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ApplicantAddTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ApplicantAddTest is Completed");
	}
	
	@Test(priority=2)
	public void AssigneeAddTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AA=(u)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AssigneeAddTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AssigneeAddTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AssigneeAddTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AssigneeAddTest is Completed");
	}
	
	@Test(priority=3)
	public void AssigneeCountryTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"ACC=(US)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AssigneeCountryTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AssigneeCountryTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AssigneeCountryTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AssigneeCountryTest is Completed");
	}
	
	@Test(priority=4)
	public void AttorneyagentAddTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AGA=(Kancelaria Rzecznikow Patentowych, J. Markieta, M. Zielinska-Lazarowicz Sp. p., Bukowinska 2 lok 160, 02-703 Warszawa, 02-703, PL)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AttorneyagentAddTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AttorneyagentAddTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AttorneyagentAddTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AttorneyagentAddTest is Completed");
	}
	
	@Test(priority=5)
	public void CorrespondentAddTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CRA=(1421 PRINCE STREET, SUITE 210, ALEXANDRIA, VA, 22314-2805, US)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CorrespondentAddTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CorrespondentAddTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CorrespondentAddTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CorrespondentAddTest is Completed");
	}
	
	@Test(priority=6)
	public void CurrentAssigneeAddTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CAA=(35, rue Joseph Monier, 92500 Rueil-Malmaison, FR)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CurrentAssigneeAddTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CurrentAssigneeAddTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CurrentAssigneeAddTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CurrentAssigneeAddTest is Completed");
	}
	
	@Test(priority=6)
	public void InventorAddTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"INA=((1116 Bunk Road, Pleasureville, KY 40057, 40057, US) OR (Woubrugge))").build().perform();
		
		Expertbutton();
		
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("InventorAddTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("InventorAddTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "InventorAddTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("InventorAddTest is Completed");
		 Log.info("=======================================");
	}
}
