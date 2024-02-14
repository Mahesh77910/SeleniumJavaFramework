package com.rwire.testCases;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;

public class TC_FieldedTest_15 extends BaseClass
{
    @Test
	public void FieldedTest3() throws InterruptedException, IOException
	{
		
		Login();
		Thread.sleep(1000);
		//First Textbox
		driver.findElement(By.xpath("//div[@title='Text']//div[@class='rs-dropdown rs-dropdown-placement-bottom-start']")).click();
		
		Thread.sleep(2000);
		
		WebElement Text=driver.findElement(By.xpath("(//span[contains(text(),'Text')])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(Text).click().perform();
		
		Thread.sleep(2000);
		WebElement Claim = driver.findElement(By.xpath("//ul[@class='rs-dropdown-inner-menu']//li[@title='Claims']"));
		
		Actions b = new Actions(driver);
		b.moveToElement(Claim).click().perform();
		
		FieldSearch s= new FieldSearch(driver);
		s.FirstTextbox("trans*");
		
		//Second Textbox
		driver.findElement(By.xpath("//div[@title='Classes']//div[@class='rs-dropdown rs-dropdown-placement-bottom-start']")).click();
		
		Thread.sleep(2000);
		
		WebElement Classification= driver.findElement(By.xpath("//ul[@id='menu-:r3:']//li[@title='Classification']"));
		
		Actions c = new Actions(driver);
		c.moveToElement(Classification).click().perform();
		
		Thread.sleep(2000);
		
		WebElement IPC = driver.findElement(By.xpath("//ul[@class='rs-dropdown-inner-menu']//li[@title='IPC']"));
		
		Actions d = new Actions(driver);
		d.moveToElement(IPC).click().perform();
		
		s.SecondTextbox("G06N2000 OR H04W7204");
		
		//Third Textbox
		driver.findElement(By.xpath("(//*[@class='rs-dropdown rs-dropdown-placement-bottom-start'])[3]")).click();
		
		Thread.sleep(2000);
		
        WebElement PeopleO= driver.findElement(By.xpath("//*[@id=\"menu-:r5:\"]/li[1]"));
		
		Actions e = new Actions(driver);
		e.moveToElement(PeopleO).click().perform();
		Thread.sleep(2000);
		
		WebElement Examiner=driver.findElement(By.xpath("//ul[@class='rs-dropdown-inner-menu']//li[@title='Examiner']"));
		
		Actions f = new Actions(driver);
		f.moveToElement(Examiner).click().perform();
		
		s.ThirdTextbox("GREGORY B SEFCHECK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"all-field-main\"]/div/div[4]/div/button[2]")).click();
		
		Thread.sleep(2000);
        s.Searchbutton();
		
		Thread.sleep(3000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("FieldedTest3 is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("FieldedTest3 is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "FieldedTest3");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("FieldedTest3 is Completed");
		 Log.info("=========================================");
	}
	
	
}
