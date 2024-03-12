package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.testCases.BaseClass;

public class TC_EditFieldTest extends BaseClass
{

	@Test
	public void EditFieldTest() throws InterruptedException, IOException
	{
	
	  Login();
	  FieldSearch fs2 = new FieldSearch(driver);
	  
	  fs2.FirstTextbox("communicat*");
	  fs2.Searchbutton();
	  Thread.sleep(4000);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Edit Fields']")).click();
	  
	  fs2.SecondTextbox("H04W72/23");
	  fs2.FourthTextbox("NAGATA, SATOSHI");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("(//button[@class='input-button-text-form'])[2]")).click();
	  
	  PublicationNo(); 
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("EditFieldTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("EditFieldTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "EditFieldTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("EditFieldTest is Completed");
	  
	  
	  	
		
	}
	
	
	
}
