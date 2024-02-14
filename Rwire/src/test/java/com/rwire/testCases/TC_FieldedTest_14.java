package com.rwire.testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;

public class TC_FieldedTest_14 extends BaseClass
{
    @Test
	public void FieldedTest2() throws InterruptedException, IOException
	{
		
		Login();
		
		FieldSearch fs = new FieldSearch(driver);
		
		fs.FirstTextbox("trans*");
		fs.SecondTextbox("H04* OR G06*");
		fs.ThirdTextbox("SAMSUNG ELECTRONICS CO. LTD. OR LG ELECTRONICS INC.");
		fs.FourthTextbox("QIAN CHEN OR LU QIANXI OR ZENG QINGHAI ");
		
		Thread.sleep(2000);
		
		//Date dropdown
		WebElement Date=driver.findElement(By.xpath("//div[@title='Date']//div[@class='rs-dropdown rs-dropdown-placement-bottom-start']"));
		Date.click();
		
		
		WebElement dd= driver.findElement(By.xpath("//li[@id='menuitem-:ra:']"));
		
		Thread.sleep(1000);
		Actions action=new Actions(driver);

		action.moveToElement(dd).click().perform();
		Thread.sleep(2000);
		
		//Selecting Date
		WebElement sd=driver.findElement(By.xpath("(//*[@class='date-search'])[1]"));
		sd.click();
		
		driver.findElement(By.xpath("//button[normalize-space()='20']")).click();
		System.out.println("In Date 20 years selected");
		Thread.sleep(2000);
		
		//Country dropdown
		WebElement country =driver.findElement(By.xpath("//div[@title='Country']//div[@class='rs-dropdown rs-dropdown-placement-bottom-start']"));
		country.click();
		
		Thread.sleep(2000);

		
		WebElement cc = driver.findElement(By.xpath("//li[@id='menuitem-:rn:']"));
		
		Thread.sleep(1000);
		Actions action1=new Actions(driver);

		action1.moveToElement(cc).click().perform();
		
		
		
		Thread.sleep(3000);
		
		fs.SixTextbox("WO");
		
		Thread.sleep(3000);
		
		fs.Searchbutton();
		
		Thread.sleep(5000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("FieldedTest2 is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("FieldedTest2 is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "FieldedTest2");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("FieldedTest2 is Completed");
	
		
	}
	
	
}
