package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.KeywordSuggestion;
import com.rwire.testCases.BaseClass;

public class TC_KeywordSTest extends BaseClass
{
    @Test(priority=1)
	public void KeywordSuggTest1() throws InterruptedException, IOException
	{
		
	 Login();
	 
	 FieldSearch s = new FieldSearch(driver);
	 s.FirstTextbox("tranverse");
	 Thread.sleep(1000);
	 
	 KeywordSuggestion k = new KeywordSuggestion(driver);
	 k.ClickKeywordbtn();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@placeholder='Search a keyword']")).sendKeys("computer");
	 k.ClickSearch();
	 
	 driver.findElement(By.xpath("//input[@value='computing-machine']")).click();
	 driver.findElement(By.xpath("//input[@value='data-processor']")).click();
	 k.ClickApply();
     s.Searchbutton();
	 Thread.sleep(3000);
	 
	 PublicationNo(); 
	 if(n>1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("KeywordSuggTest1 is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("KeywordSuggTest1 is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "KeywordSuggTest1");
           Assert.assertTrue(false);
      		
      }
	 
	 Log.info("KeywordSuggTest1 is Completed");
	 
	}
	
	@Test(priority=2)
	public void KeywordSuggTest2() throws InterruptedException, IOException
	{
		
	 Thread.sleep(2000);
	 ClickRwireLogo();
	 
	 KeywordSuggestion k1 = new KeywordSuggestion(driver);
	 k1.ClickKeywordbtn();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@placeholder='Search a keyword']")).sendKeys("car");
	 k1.ClickSearch();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("keyword-dropdown")).click();
	 driver.findElement(By.xpath("//*[@class=\"scrollable-dropdown-menu\"]/li[3]")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@value='machine']")).click();
	 driver.findElement(By.xpath("//input[@value='auto']")).click();
	 k1.ClickApply();
	 FieldSearch fs = new FieldSearch(driver);
	 fs.Searchbutton();
	 Thread.sleep(2000);
	 
	 PublicationNo(); 
	 if(n>1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("KeywordSuggTest2 is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("KeywordSuggTest2 is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "KeywordSuggTest2");
           Assert.assertTrue(false);
      		
      }
	 
	 Log.info("KeywordSuggTest2 is Completed");
	 
	}
	
	
}
