package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.ExpertSearch;

public class TC_ExpertPeopleO_006 extends BaseClass
{

	@Test(priority=1)
	public void CAOriginalTest() throws InterruptedException, IOException
	{
		
		Login();
		
		ExpertSearch es= new ExpertSearch(driver);
		es.ClickExpert();
		
        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CA=(CANON KABUSHIKI KAISHA)").build().perform();
		
		Expertbutton();
		Thread.sleep(4000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CAOriginalTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CAOriginalTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CAOriginalTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CAOriginalTest is Completed");
	}
	
	@Test(priority=2)
	public void CAStandardizedTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(4000);
		a.sendKeys(box ,"CAS=(NISSAN MOTOR OR ROBERT BOSCH)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CAStandardizedTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CAStandardizedTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CAStandardizedTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CAStandardizedTest is Completed");
	}
	
	@Test(priority=3)
	public void CANormalizedTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(4000);
		a.sendKeys(box ,"CAN=(KONICA MINOLTA OR MITSUBISHI)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CANormalizedTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CANormalizedTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CANormalizedTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CANormalizedTest is Completed");
	}
	
	@Test(priority=4)
	public void InventorTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"IN=(NAGATA SATOSHI)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("InventorTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("InventorTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "InventorTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("InventorTest is Completed");
	}
	
	@Test(priority=5)
	public void ExaminerTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"EX=(VINOD EDWARD)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("ExaminerTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("ExaminerTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "ExaminerTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("ExaminerTest is Completed");
	}
	
	@Test(priority=6)
	public void AttorneyAgentTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AG=(BARKER BRETTELL LLP OR REGIMBEAU)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AttorneyAgentTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AttorneyAgentTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AttorneyAgentTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AttorneyAgentTest is Completed");
	}
	
	@Test(priority=7)
	public void AAPOriginalTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AAPO=(MICROSOFT TECHNOLOGY LICENSING)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AAPOriginalTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AAPOriginalTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AAPOriginalTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AAPOriginalTest is Completed");
	}
	
	@Test(priority=8)
	public void AAPStandardizedTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AAPS=(TOPPAN PRINTING OR QUALCOMM)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AAPStandardizedTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AAPStandardizedTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AAPStandardizedTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AAPStandardizedTest is Completed");
	}
	
	@Test(priority=9)
	public void AAPNormalizedTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AAPN=(HEWLETT PACKARD)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AAPNormalizedTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AAPNormalizedTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AAPNormalizedTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AAPNormalizedTest is Completed");
	}
	
	@Test(priority=10)
	public void CorrespondentTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"CR=(191036 ADJ SANKT-PETERBURG ADJ A/YA ADJ 24 ADJ \"NEVINPAT\")").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>=1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("CorrespondentTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("CorrespondentTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "CorrespondentTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("CorrespondentTest is Completed");
	}
	
	@Test(priority=11)
	public void AssigneeAppTest() throws InterruptedException, IOException
	{   
		
		ClickRwireLogo();
		Thread.sleep(2000);

        WebElement box =driver.findElement(By.xpath("//div[@class='cm-scroller']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.sendKeys(box ,"AAP=(SEIKO EPSON CORPORATION)").build().perform();
		
		Expertbutton();
		Thread.sleep(2000);
		
		PublicationNo();
		 if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("AssigneeAppTest is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("AssigneeAppTest is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "AssigneeAppTest");
	           Assert.assertTrue(false);
	      		
	      }
		 
		 Log.info("AssigneeAppTest is Completed");
		 Log.info("=======================================");
	}
}
