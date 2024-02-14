package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.NumberSearch;

public class TC_NoFileUploadTest extends BaseClass
{
    @Test(priority=1)
	public void Pub50FileUpTest() throws InterruptedException, IOException
	{
		
		Login();
		
		NumberSearch s = new NumberSearch(driver);
    	s.ClickNumber();
		
    	Thread.sleep(2000);
    	WebElement Fileinput = driver.findElement(By.xpath("//input[@type='file']"));
    	
    	String filepath = "C:\\Users\\MAHESH HADWALE\\eclipse-workspace\\Rwire\\src\\test\\java\\com\\rwire\\testData\\Pub50.csv";
    	
//    	String filepath = "(user.dir+)+/com/rwire/testData/Pub50.csv";
    	Thread.sleep(2000);
    	Fileinput.sendKeys(filepath);
    	
    	s.ClickChecksyntax();
    	Thread.sleep(2000);
    	s.ClickExpertSearch();
    	
    	Thread.sleep(12000);
    	PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("Pub50FileUpTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	 System.out.println("Pub50FileUpTest is Failed");
	    	 Log.info("Test is Failed");
	      	 CaptureScreen(driver, "Pub50FileUpTest");
	         Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("Pub50FileUpTest is Completed");
   	
   	    Thread.sleep(2000);
    		
	}
	
    @Test(priority=2)
  	public void App50FileUpTest() throws InterruptedException, IOException
  	{
  		
    	ClickRwireLogo();
    	Thread.sleep(2000);
    	//Click Application Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Application']")).click();
    	
    	//Uncheck Publication Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Publication']")).click();
    	
      	Thread.sleep(2000);
      	WebElement Fileinput = driver.findElement(By.xpath("//input[@type='file']"));
      	
      	String filepath = "C:\\Users\\MAHESH HADWALE\\eclipse-workspace\\Rwire\\src\\test\\java\\com\\rwire\\testData\\App50.csv";
      	Thread.sleep(2000);
      	Fileinput.sendKeys(filepath);
      	
      	NumberSearch s = new NumberSearch(driver);
      	s.ClickChecksyntax();
      	Thread.sleep(2000);
      	s.ClickExpertSearch();
      	
      	Thread.sleep(15000);
      	PublicationNo();
  		 if(n>1)
  	      {
  	      	Assert.assertTrue(true);
  	      	
  	      	System.out.println("App50FileUpTest is Passed");
  	      	Log.info("Test is Passed");
  	      	
  	      }
  	      else
  	      {
  	    	 System.out.println("App50FileUpTest is Failed");
  	    	 Log.info("Test is Failed");
  	      	 CaptureScreen(driver, "App50FileUpTest");
  	         Assert.assertTrue(false);
  	      		
  	      }
  		 
  		 Log.info("App50FileUpTest is Completed");
     	
     	    Thread.sleep(2000);
      		
  	}
	
    @Test(priority=3)
  	public void Prn50FileUpTest() throws InterruptedException, IOException
  	{
  		
    	ClickRwireLogo();
    	Thread.sleep(2000);
    	//Click Priority Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Priority']")).click();
    	
    	//Uncheck Application Checkbox
    	driver.findElement(By.xpath("//label[normalize-space()='Application']")).click();
    	
      	Thread.sleep(2000);
      	WebElement Fileinput = driver.findElement(By.xpath("//input[@type='file']"));
      	
      	String filepath = "C:\\Users\\MAHESH HADWALE\\eclipse-workspace\\Rwire\\src\\test\\java\\com\\rwire\\testData\\PRN50.csv";
      	Thread.sleep(2000);
      	Fileinput.sendKeys(filepath);
      	
      	NumberSearch s = new NumberSearch(driver);
      	s.ClickChecksyntax();
      	Thread.sleep(2000);
      	s.ClickExpertSearch();
      	
      	Thread.sleep(15000);
      	PublicationNo();
  		 if(n>1)
  	      {
  	      	Assert.assertTrue(true);
  	      	
  	      	System.out.println("Prn50FileUpTest is Passed");
  	      	Log.info("Test is Passed");
  	      	
  	      }
  	      else
  	      {
  	    	 System.out.println("Prn50FileUpTest is Failed");
  	    	 Log.info("Test is Failed");
  	      	 CaptureScreen(driver, "Prn50FileUpTest");
  	         Assert.assertTrue(false);
  	      		
  	      }
  		 
  		 Log.info("Prn50FileUpTest is Completed");
  		Log.info("==============================================");
     	
     	    Thread.sleep(2000);
      		
  	}
	
}
