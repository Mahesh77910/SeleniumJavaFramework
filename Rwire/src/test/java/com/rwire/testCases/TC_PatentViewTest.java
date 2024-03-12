package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.PatentView;

public class TC_PatentViewTest extends BaseClass
{
    @Test(priority=1)
	public void PatentViewTest1() throws InterruptedException, IOException
	{
		
		Login();
		
		FieldSearch s = new FieldSearch(driver);
		
		s.FirstTextbox("device AND signal");
		
		s.Searchbutton();
		Thread.sleep(5000);
		
		PatentView p = new PatentView(driver);
		
		p.ClickPatentNo();
		Thread.sleep(2000);
		p.ClickClaim();
		Thread.sleep(2000);
		p.ClickDesc();
		Thread.sleep(2000);
		p.ClickFamilies();
		Thread.sleep(2000);
		p.ClickClassification();
		Thread.sleep(2000);
		p.ClickCitation();
		Thread.sleep(2000);
		p.ClickLE();
		Thread.sleep(2000);
		p.ClickTop();
		Thread.sleep(2000);
		p.Clickshowall();
		Thread.sleep(3000);
		p.ClickDefault();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 300)");
        Thread.sleep(2000);
		p.ClickSmartReader();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M405 136.7')]")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Top']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='PDF']")).click();
		Thread.sleep(3000);
		
		p.ClickClaim();
		Thread.sleep(1000);
		
	}	
    
    
    
      @Test(priority=2)
      public void PatentVCPCTable2() throws InterruptedException, IOException
      {
    	  
		driver.findElement(By.xpath("//input[@class='me-2 cursor-pointer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='me-2 cursor-pointer']")).click();
		
		PatentView p1 = new PatentView(driver);
		p1.ClickClassification();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='rs-checkbox-wrapper'])[2]")).click();
		Thread.sleep(1000);
		
		
		
		By elementLocator = By.xpath("//th[normalize-space()='CPC Classes']");
		
		WebElement element1 = driver.findElement(elementLocator);
		
		String Expected = "CPC Classes";
		
		String table = element1.getText();
		System.out.println(table);
		
		if(table.equals(Expected))
		{
			
			Assert.assertTrue(true);
	       	System.out.println("CPC Classes Table is Present");
	       	Log.info("PatentVCPCTable2 test passed");
		}
		
		else 
		{
		
			System.out.println("CPC Classes Table is not Present");
	        Log.info("PatentVCPCTable2 test Failed");
	    	CaptureScreen(driver, "PatentVCPCTable2");
	       	Assert.assertTrue(false);
	 
	       
		}
		
		
      }
	
    @Test(priority=3)
      public void PatentVUSTable3() throws InterruptedException, IOException
      {
    	  	
		PatentView p2 = new PatentView(driver);
		p2.ClickClassification();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='rs-checkbox-wrapper'])[3]")).click();
		Thread.sleep(1000);
		
		
		
		By elementLocator = By.xpath("//th[normalize-space()='US Classes']");
		
		WebElement element1 = driver.findElement(elementLocator);
		
		String Expected = "US Classes";
		
		String table1 = element1.getText();
		System.out.println(table1);
		
		if(table1.equals(Expected))
		{
			
			Assert.assertTrue(true);
	       	System.out.println("US Classes Table is Present");
	       	Log.info("PatentVUSTable3 test passed");
		}
		
		else 
		{
		
			System.out.println("US Classes Table is not Present");
	        Log.info("PatentVCPCTable2 test Failed");
	    	CaptureScreen(driver, "PatentVUSTable3");
	       	Assert.assertTrue(false);
	 
	       
		}
	
	
     }
    
    
	
}
