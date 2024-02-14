package com.rwire.testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;



public class TC_NormalExportTest extends BaseClass

{
	
	@Test
	public void ExportTest() throws InterruptedException, IOException
	{
		
		Login();
		
		FieldSearch fs= new FieldSearch(driver);
		fs.FirstTextbox("Network OR Signal");
		
		fs.Searchbutton();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"patent-details-table\"]/thead/tr/th[1]/input")).click();
		
		Thread.sleep(3000);
		
		ClickExportbtn();
		
		fs.Clickselectall();
		
		driver.findElement(By.xpath("//*[@class='export-search file-name-export rs-input']")).sendKeys("50 Records");
		
		ClickDownload();
		
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
