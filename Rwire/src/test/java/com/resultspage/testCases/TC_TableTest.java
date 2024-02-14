package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.PatentResult;
import com.rwire.testCases.BaseClass;

public class TC_TableTest extends BaseClass
{
    @Test(priority=1)
	public void AddColumnsTest1() throws InterruptedException, IOException
	{
		
	  Login();
	  
	  FieldSearch fs = new FieldSearch(driver);
	  fs.FirstTextbox("signal AND device");
	  fs.Searchbutton();
	  
	  Thread.sleep(5000);
		
	  PatentResult p = new PatentResult(driver);
	  p.Clicktable();
	  
	  driver.findElement(By.xpath("//input[@data-value='normalized_assignee']")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@data-value='standardized_assignee']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='assignee_original']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='application_number']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='priority_number']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='Kind Code']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='Expiry Date']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='Priority Country']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='patent_type']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='Assignee/Applicant_Original']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='Assignee/Applicant_Standardized']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@data-value='Assignee/Applicant_Normalized']")).click();
	  
	  WebElement Aan = driver.findElement(By.xpath("//*[@id=\"patent-details-table\"]/tbody/tr[1]/td[3]/div/div[19]/div[1]"));
	  String m = Aan.getText();
	  
	  System.out.println(m);
	  if(m.equals("Assignee/Applicant-Normalized:"))
	  {
		  Assert.assertTrue(true);
		  System.out.println("AddColumnsTest1 is Passed");
	      Log.info("Test is Passed");
	  }
	  else 
	  {
		  System.out.println("AddColumnsTest1 is Failed");
	      Log.info("Test is Failed");
	      CaptureScreen(driver, "AddColumnsTest1");
	      Assert.assertTrue(false);
	  }
	  
	   System.out.println("==============================================");
	   
	   }
    
    @Test(priority=2)
    public void AddColumnsTest2() throws InterruptedException, IOException
    {
    	
      Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[@data-value='Claims']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='Images']")).click();
  	  Thread.sleep(4000);
  	  driver.findElement(By.xpath("//input[@data-value='ipc']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='cpc']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='US Class']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='ECLA']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='JP-FI/F-Terms']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='Legal Status']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@data-value='Relevancy Score']")).click();
  	  Thread.sleep(2000);
  	  
  	 PatentResult p1 = new PatentResult(driver);
	 p1.Clicktable();
	 
	 Thread.sleep(3000);
	 
	 Actions actions = new Actions(driver);

     WebElement elementToScroll = driver.findElement(By.xpath("//div[@id='scrollbar']")); 
     int xOffset = 500;
     
     actions.moveToElement(elementToScroll).clickAndHold().moveByOffset(xOffset,0).build().perform();
     
     Thread.sleep(2000);
     
     WebElement RelCol = driver.findElement(By.xpath("//div[@class='header-wrapper'][normalize-space()='Relevancy Score']"));
     String n = RelCol.getText();
     System.out.println(n);
     
     if(n.equals("Relevancy Score"))
	  {
		  Assert.assertTrue(true);
		  System.out.println("AddColumnsTest2 is Passed");
	      Log.info("Test is Passed");
	  }
	  else 
	  {
		  System.out.println("AddColumnsTest2 is Failed");
	      Log.info("Test is Failed");
	      CaptureScreen(driver, "AddColumnsTest2");
	      Assert.assertTrue(false);
	  }
     
     System.out.println("==============================================");
    
    }
    
    @Test(priority=3)
    public void RemColumnsTest1() throws InterruptedException, IOException
    {
    
      Thread.sleep(2000);
      Actions actions = new Actions(driver);

      WebElement elementToScroll = driver.findElement(By.xpath("//div[@id='scrollbar']")); 
      int xOffset = -500;
         
      actions.moveToElement(elementToScroll).clickAndHold().moveByOffset(xOffset,0).build().perform();
      Thread.sleep(2000);
     
      PatentResult p2 = new PatentResult(driver);
 	  p2.Clicktable();
    	
      driver.findElement(By.xpath("//input[@data-value='normalized_assignee']")).click();
   	  Thread.sleep(1000);
   	  
   	  driver.findElement(By.xpath("//input[@data-value='standardized_assignee']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='assignee_original']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='application_number']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='priority_number']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='Kind Code']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='Expiry Date']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='Priority Country']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='patent_type']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='Assignee/Applicant_Original']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='Assignee/Applicant_Standardized']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.xpath("//input[@data-value='Assignee/Applicant_Normalized']")).click();
   	  
   	 WebElement checkboxElement = driver.findElement(By.xpath("//input[@data-value='normalized_assignee']")); 

     
     boolean isChecked = checkboxElement.isSelected();

     if (isChecked)
     {
         System.out.println("Normalized Assignee Checkbox is checked.");
         System.out.println("RemColumnsTest1 is Failed");
	     Log.info("Test is Failed");
	     CaptureScreen(driver, "RemColumnsTest1");
	     Assert.assertTrue(false);
         
         
     } else
     {
         System.out.println("Normalized Assignee Checkbox is not checked.");
         Assert.assertTrue(true);
		 System.out.println("RemColumnsTest1 is Passed");
	     Log.info("Test is Passed");
     }
   	
     System.out.println("==============================================");	 	
    }
    
    @Test(priority=4)
    public void RemColumnsTest2() throws InterruptedException, IOException
    { 
    	
    	  Thread.sleep(2000);
      	  driver.findElement(By.xpath("//input[@data-value='Claims']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='Images']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='ipc']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='cpc']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='US Class']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='ECLA']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='JP-FI/F-Terms']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='Legal Status']")).click();
      	  Thread.sleep(3000);
      	  driver.findElement(By.xpath("//input[@data-value='Relevancy Score']")).click();
      	  Thread.sleep(2000);
    	
      	WebElement checkboxElement1 = driver.findElement(By.xpath("//input[@data-value='Claims']")); 

        
        boolean isChecked = checkboxElement1.isSelected();

        if (isChecked)
        {
            System.out.println("Claims Checkbox is checked.");
            System.out.println("RemColumnsTest2 is Failed");
   	        Log.info("Test is Failed");
   	        CaptureScreen(driver, "RemColumnsTest2");
   	        Assert.assertTrue(false);
            
            
        } else
        {
            System.out.println("Claims Checkbox is not checked.");
            Assert.assertTrue(true);
   		    System.out.println("RemColumnsTest2 is Passed");
   	        Log.info("Test is Passed");
        }
      	
        System.out.println("==============================================");	
    	
    	
    }
	
	
}
