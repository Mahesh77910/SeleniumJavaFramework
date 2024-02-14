package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.PatentResult;
import com.rwire.pageObjects.PatentView;
import com.rwire.pageObjects.QuickMode;
import com.rwire.testCases.BaseClass;

public class TC_QuickTest extends BaseClass
{
    @Test(priority=1)
	public void QuickMTest() throws InterruptedException, IOException
	{
    	
     Login();
		
	 FieldSearch fs = new FieldSearch(driver);
	 fs.FirstTextbox("signal");
	 
	 fs.Searchbutton();
	 Thread.sleep(7000);
	 
	 PatentResult p = new PatentResult(driver);
	 p.ClickQuick();
	 
	 Thread.sleep(2000); 
	 driver.findElement(By.xpath("//div[@class='text px-2 py-1 cursor-pointer pubno-header']")).click();
     
	Thread.sleep(3000);	
	
	//Back To Search
	driver.findElement(By.xpath("//button[normalize-space()='Back to search']")).click();
	
	Thread.sleep(2000); 
	
	  if(driver.getTitle().equals("Researchwire"))
      {
      	Assert.assertTrue(true);
      	System.out.println("QuickMTest is Passed");
      	Log.info("Test is passed");
      	
      }
      else
      {
   	    System.out.println("QuickMTest is Failed");
        Log.info("Test is Failed");
     	CaptureScreen(driver, "QuickMTest");
      	Assert.assertTrue(false);

      }
	   
	}
	
    @Test(priority=2)
    public void QuickFiltersTest() throws InterruptedException, IOException
    {
    	
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[contains(text(),'Filters')]")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//button[@title='Attorney/Agent']//*[name()='svg']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//label[normalize-space()='ERICSSON (4594)']")).click();
      
      Thread.sleep(2000);
      QuickMode m = new QuickMode(driver);
      m.ClickApply();
      
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@title='Lapse Year']//*[name()='svg']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[contains(@class,'filter-modal p-3 filter-modal-active filter-modal-fixed')]//div[contains(@class,'d-flex justify-content-between')]//span[contains(@class,'rs-checkbox-wrapper')]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@class='ms-5 btn']")).click();
      
      
    	
   	
    }
	
}
