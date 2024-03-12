package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.ClassesSuggestion;
import com.rwire.testCases.BaseClass;

public class TC_ClassSTest extends BaseClass
{
	@Test(priority=1)
	public void ClassesSuggTest1() throws InterruptedException, IOException
	{
		
		 Login();
		
		 FieldSearch fs = new FieldSearch(driver);
		 fs.FirstTextbox("signal");
		 
		 ClassesSuggestion k = new ClassesSuggestion(driver);
		 k.ClickClassesbtn();
		 
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//input[@placeholder='Search a class']")).sendKeys("H04");
		 
		 k.Clicksearch();
		 Thread.sleep(2000);		 
		 driver.findElement(By.xpath("//input[@value='H04B1/0003']")).click();
		 driver.findElement(By.xpath("//input[@value='H04B1/0014']")).click();
		 
		 k.ClickApplybtn();
		 fs.Searchbutton();
		 Thread.sleep(4000);
		 
		 PublicationNo(); 
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ClassesSuggTest1 is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ClassesSuggTest1 is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ClassesSuggTest1");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ClassesSuggTest1 is Completed");
	}
	  
	
	  @Test(priority=2)
	  public void ClassesSuggTest2() throws InterruptedException, IOException
	  {
		Thread.sleep(2000);
		ClickRwireLogo();

			
	    FieldSearch fs = new FieldSearch(driver);
	    fs.FirstTextbox("mobile");
	    
	    ClassesSuggestion k1 = new ClassesSuggestion(driver);
		k1.ClickClassesbtn();
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search a class']")).sendKeys("B04");
		k1.Clicksearch();
		
		driver.findElement(By.xpath("//button[normalize-space()='IPC']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='table-wrapper normal-scroll-bar']//div[3]//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//input[@value='B04B449580000']")).click();
		
		k1.ClickApplybtn();
		fs.Searchbutton();
		Thread.sleep(4000);
		
		 PublicationNo(); 
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ClassesSuggTest2 is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ClassesSuggTest2 is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ClassesSuggTest2");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ClassesSuggTest2 is Completed");
		    
	  }
	  
	  
	  @Test(priority=3)
	  public void ClassesSuggTest3() throws InterruptedException, IOException
	  {
		
		Thread.sleep(2000);
		ClickRwireLogo();

				
		FieldSearch fs = new FieldSearch(driver);
		fs.FirstTextbox("motor");
		    
		ClassesSuggestion k2 = new ClassesSuggestion(driver);
		k2.ClickClassesbtn();
			 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search a class']")).sendKeys("D05");
		k2.Clicksearch(); 
		
		driver.findElement(By.xpath("//button[normalize-space()='US']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='D05/1']")).click();
		driver.findElement(By.xpath("//input[@value='D05/3']")).click();
		
		  
		k2.ClickApplybtn();
		fs.Searchbutton();
		Thread.sleep(3000);
		
		 PublicationNo(); 
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ClassesSuggTest3 is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ClassesSuggTest3 is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ClassesSuggTest3");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ClassesSuggTest3 is Completed");
		   
	  }
	  
	
      @Test(priority=4)
      public void ClassesSuggTest4() throws InterruptedException, IOException
      {
    	  
    	Thread.sleep(2000);
  		ClickRwireLogo();

  				
  		FieldSearch fs = new FieldSearch(driver);
  		fs.FirstTextbox("computer");
  		
  		ClassesSuggestion k3 = new ClassesSuggestion(driver);
		k3.ClickClassesbtn();
  		
  		driver.findElement(By.xpath("//input[@placeholder='Search a keyword']")).sendKeys("mouse");
    	k3.Clicksearch();
    	Thread.sleep(2000);
    	
    	
    	driver.findElement(By.xpath("//input[@value='A47B2200/009']")).click();
    	k3.ClickApplybtn();
    	fs.Searchbutton();
		Thread.sleep(3000);
		
		 PublicationNo(); 
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ClassesSuggTest4 is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ClassesSuggTest4 is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ClassesSuggTest4");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ClassesSuggTest4 is Completed");
    	
    	  
      }
}
