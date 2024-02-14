package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.PatentResult;
import com.rwire.testCases.BaseClass;

public class TC_Sort extends BaseClass
{

	  @Test(priority=1)
	  public void RelevancyS() throws InterruptedException, IOException
	  {
		  
		Login();
		
		FieldSearch fs = new FieldSearch(driver);
		fs.FirstTextbox("transport AND vehicle");
		fs.Searchbutton();
		Thread.sleep(4000);
			
		PatentResult p1= new PatentResult(driver);
		p1.ClickSort();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@id='score__ASC']")).click();
		Thread.sleep(4000);
		
		Thread.sleep(1000);
	    PatentResult p2= new PatentResult(driver);
	    p2.ClickSort();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='score__DESC']")).click();
		Thread.sleep(2000);
		
		  
	  }
	  
	   
	    @Test(priority=2)
	    public void PublicationCtryS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PNC__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PNC__DESC']")).click();
		 Thread.sleep(2000);
	    	
	    	
	    }
	    
	    @Test(priority=3)
	    public void ApplicationCtryS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='AC__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='AC__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	  
	    @Test(priority=4)
	    public void ApplicationDateS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='AD__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='AD__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	
	    @Test(priority=5)
	    public void AssigneeCtryS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='ACC__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='ACC__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=6)
	    public void AssigneeCountS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='ACN__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='ACN__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=7)
	    public void ApplicantCountS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='APCN__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='APCN__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=8)
	    public void InventorCountS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='INCN__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='INCN__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=9)
	    public void PriorityCtryS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PRC__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PRC__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=10)
	    public void PriorityDateS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PRD__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PRD__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=11)
	    public void EPriorityDateS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='EPRD__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='EPRD__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
	    @Test(priority=12)
	    public void PublicationDateS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PD__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PD__DESC']")).click();
		 Thread.sleep(3000);	
	    }
	    
	    @Test(priority=13)
	    public void PublicationKindCodeS() throws InterruptedException
	    {
	     
	     PatentResult p1= new PatentResult(driver);
		 p1.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PKC__ASC']")).click();
		 Thread.sleep(2000);
		 
		 PatentResult p2= new PatentResult(driver);
		 p2.ClickSort();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@id='PKC__DESC']")).click();
		 Thread.sleep(2000);	
	    }
	    
//	    @Test(priority=13)
//	    public void ExpiryDateS() throws InterruptedException
//	    {
//	     
//	     PatentResult p1= new PatentResult(driver);
//		 p1.ClickSort();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//img[@id='ED__ASC']")).click();
//		 Thread.sleep(2000);
//		 
//		 PatentResult p2= new PatentResult(driver);
//		 p2.ClickSort();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//img[@id='ED__DESC']")).click();
//		 Thread.sleep(2000);	
//	    }
	    
	    
	    
}
