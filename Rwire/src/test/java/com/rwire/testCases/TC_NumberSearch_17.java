package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.NumberSearch;

public class TC_NumberSearch_17 extends BaseClass
{
    @Test(priority=1)
	public void PubNumberSTest() throws InterruptedException, IOException 
	{
		
    	Login();
    	
    	NumberSearch s = new NumberSearch(driver);
    	s.ClickNumber();
    	
    	Thread.sleep(2000);
    	
    	WebElement Numbox =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
 		
 		Actions a = new Actions(driver);
 		
 		Thread.sleep(2000);
 		a.sendKeys(Numbox ,"US10778802B2 OR WO2020216003A1").build().perform();
 		Thread.sleep(2000);
 		
    	s.ClickChecksyntax();
    	Thread.sleep(2000);
    	s.ClickExpertSearch();
    	
    	PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PubNumberSTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PubNumberSTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PubNumberSTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PubNumberSTest is Completed");
    	
    	Thread.sleep(2000);
    	
    	
	}
    
    @Test(priority=2)
    public void AppNumberSTest() throws InterruptedException, IOException 
	{
		
    	ClickRwireLogo();
    	Thread.sleep(2000);
    	//Click Application Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Application']")).click();
    	
    	//Uncheck Publication Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Publication']")).click();
    	
    	WebElement Numbox =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
 		
 		Actions a = new Actions(driver);
 		
 		Thread.sleep(2000);
 		a.sendKeys(Numbox ,"EP18731820 OR US16117145").build().perform();
 		Thread.sleep(2000);
 		
 		NumberSearch s1 = new NumberSearch(driver);
    	s1.ClickChecksyntax();
    	Thread.sleep(2000);
    	s1.ClickExpertSearch();
    	
    	PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AppNumberSTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AppNumberSTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AppNumberSTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AppNumberSTest is Completed");
    	
    	Thread.sleep(2000);
    	
    	
	}
    @Test(priority=3)
    public void PRNNumberSTest() throws InterruptedException, IOException 
	{
		
    	ClickRwireLogo();
    	Thread.sleep(2000);
    	//Click Priority Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Priority']")).click();
    	
    	//Uncheck Application Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Application']")).click();
    	
    	WebElement Numbox =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
 		
 		Actions a = new Actions(driver);
 		
 		Thread.sleep(2000);
 		a.sendKeys(Numbox ,"CN201910334752 OR US15245736 OR JP2018231033").build().perform();
 		Thread.sleep(2000);
 		
 		NumberSearch s1 = new NumberSearch(driver);
    	s1.ClickChecksyntax();
    	Thread.sleep(2000);
    	s1.ClickExpertSearch();
    	
    	PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("PRNNumberSTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("PRNNumberSTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "PRNNumberSTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("PRNNumberSTest is Completed");
		 Log.info("=========================================");
    	
    	
    	
    	
	}
}
