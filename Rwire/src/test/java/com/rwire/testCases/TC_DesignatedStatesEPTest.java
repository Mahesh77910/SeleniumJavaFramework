package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_DesignatedStatesEPTest extends BaseClass
{
    @Test
	public void DesignatedAllStatesEP() throws InterruptedException, IOException
	{
		
     Login();
     
     ExpertSearch e = new ExpertSearch(driver);
     e.ClickExpert();
     
     WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
	 Actions a = new Actions(driver);
		
	 Thread.sleep(2000);
	 a.sendKeys(box ,"DSEP=(GR OR PT)").build().perform();
		
	 Expertbutton();
	 Thread.sleep(2000);
	 PublicationNo();
	 if(n>1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("DesignatedAllStatesEP is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("DesignatedAllStatesEP is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "DesignatedAllStatesEP");
           Assert.assertTrue(false);
      		
      }
	 
	 Log.info("DesignatedAllStatesEP is Completed");
			
	}
    
    @Test(priority=2)
	public void ContractingStatesEP() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"DSEP_CST=(CY OR TR OR FY)").build().perform();
		
		Expertbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ContractingStatesEP is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ContractingStatesEP is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ContractingStatesEP");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ContractingStatesEP is Completed");
	}
    
    @Test(priority=3)
  	public void ExtensionStatesEP() throws InterruptedException, IOException
  	{   
  		
  		ClickRwireLogo();
  		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
  		
  		Actions a = new Actions(driver);
  		
  		Thread.sleep(2000);
  		a.sendKeys(box ,"DSEP_EST=(RS OR ME)").build().perform();
  		
  		Expertbutton();
  		
  		Thread.sleep(3000);
  		
  		PublicationNo();
  		 if(n>1)
  	      {
  	      	Assert.assertTrue(true);
  	      	
  	      	System.out.println("ExtensionStatesEP is Passed");
  	      	Log.info("Test is Passed");
  	      	
  	      }
  	      else
  	      {
  	    	  System.out.println("ExtensionStatesEP is Failed");
  	    	  Log.info("Test is Failed");
  	      	  CaptureScreen(driver, "ExtensionStatesEP");
  	           Assert.assertTrue(false);
  	      		
  	      }
  		 
  		 Log.info("ExtensionStatesEP is Completed");
  	}
    
    @Test(priority=4)
  	public void ValidationStatesEP() throws InterruptedException, IOException
  	{   
  		
  		ClickRwireLogo();
  		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
  		
  		Actions a = new Actions(driver);
  		
  		Thread.sleep(2000);
  		a.sendKeys(box ,"DSEP_VST=(MA)").build().perform();
  		
  		Expertbutton();
  		
  		Thread.sleep(3000);
  		
  		PublicationNo();
  		 if(n>1)
  	      {
  	      	Assert.assertTrue(true);
  	      	
  	      	System.out.println("ValidationStatesEP is Passed");
  	      	Log.info("Test is Passed");
  	      	
  	      }
  	      else
  	      {
  	    	  System.out.println("ValidationStatesEP is Failed");
  	    	  Log.info("Test is Failed");
  	      	  CaptureScreen(driver, "ValidationStatesEP");
  	           Assert.assertTrue(false);
  	      		
  	      }
  		 
  		 Log.info("ValidationStatesEP is Completed");
  	}
    
    @Test(priority=5)
  	public void UPparticipatingStatesEP() throws InterruptedException, IOException
  	{   
  		
  		ClickRwireLogo();
  		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
  		
  		Actions a = new Actions(driver);
  		
  		Thread.sleep(2000);
  		a.sendKeys(box ,"DSEP_PST=(NA)").build().perform();
  		
  		Expertbutton();
  		
  		Thread.sleep(3000);
  		
  		PublicationNo();
  		 if(n>1)
  	      {
  	      	Assert.assertTrue(true);
  	      	
  	      	System.out.println("UPparticipatingStatesEP is Passed");
  	      	Log.info("Test is Passed");
  	      	
  	      }
  	      else
  	      {
  	    	  System.out.println("UPparticipatingStatesEP is Failed");
  	    	  Log.info("Test is Failed");
  	      	  CaptureScreen(driver, "UPparticipatingStatesEP");
  	           Assert.assertTrue(false);
  	      		
  	      }
  		 
  		 Log.info("UPparticipatingStatesEP is Completed");
  	}
	
}
