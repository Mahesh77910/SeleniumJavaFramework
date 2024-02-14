package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;

public class TC_EmailExportTest extends BaseClass
{
    @Test
	public void Emailexport() throws InterruptedException, IOException
	{
		
		Login();
		
		FieldSearch fs= new FieldSearch(driver);
		fs.FirstTextbox("Communicat* OR device");
		
		fs.Searchbutton();
		
		Thread.sleep(5000);
		
        ClickExportbtn();
		
		fs.Clickselectall();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='export-search file-name-export rs-input']")).sendKeys("Email Export(1124276)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='export-search export-email-input rs-input']")).sendKeys("mahesh.hadwale@researchwire.in");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Send on mail']")).click();
		
		Thread.sleep(8000);
		
		 if(driver.getTitle().equals("Researchwire | Download Center"))
	        {
	        	Assert.assertTrue(true);
	        	System.out.println("ExportTest is Passed");
	        	Log.info("Test is Passed");
	        	
	        }
	        else
	        {
	        	
	        	System.out.println("ExportTest is Failed");
	        	CaptureScreen(driver, "ExportTest");
	        	Log.info("Test is Fail");
	        	Assert.assertTrue(false);
	        	
	        }
		 
         Thread.sleep(120000);
		 
		 driver.findElement(By.xpath("(//div[@class='row-icons download-icon'][1])")).click();
		 
		 System.out.println("File Is Exported Successfully");
		
		
		
	}
	
}
