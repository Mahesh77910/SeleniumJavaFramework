package com.rwire.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.LoginPage;
import com.rwire.pageObjects.Smartsearch;

public class TC_SmartsearchTest_002 extends BaseClass
{
	
  @Test
  public void SearchbarTest1() throws InterruptedException, IOException
  {
   
	   Login();
	   Thread.sleep(2000);
	   
	   Smartsearch s = new Smartsearch(driver);
	   s.SSearch("Motor OR vehicle");
	   Thread.sleep(1000);
	   s.ClickSearch();
	   Thread.sleep(3000);
	   
	   PublicationNo();
	   if(n>1)
	      {
	      	Assert.assertTrue(true);
	      	
	      	System.out.println("Test is Passed");
	      	Log.info("Test is Passed");
	      	
	      }
	      else
	      {
	    	  System.out.println("Test is Failed");
	    	  Log.info("Test is Failed");
	      	  CaptureScreen(driver, "SearchbarTest1");
	           Assert.assertTrue(false);
	      		
	      }
	   
//	     Thread.sleep(2000);
	     Log.info("Smart Test1 is Completed");
  }
  
  @Test
  public void SearchbarTest2() throws InterruptedException, IOException
  {
	  ClickRwireLogo();
	  Thread.sleep(2000);
	   
	  Smartsearch s = new Smartsearch(driver);
	  s.SSearch("Motor AND engine");
	  Thread.sleep(1000);
	  s.ClickSearch();
	  Thread.sleep(3000);
	  

	  PublicationNo();
	  if(n>1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("Test is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("Test is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "SearchbarTest2");
           Assert.assertTrue(false);
      		
      }
	  Log.info("Smart Test2 is Completed");
	  
	   
		
  }
  
  @Test
  public void SearchbarTest3() throws InterruptedException, IOException
  {
	  ClickRwireLogo();
	   Thread.sleep(2000);
	   
	  Smartsearch s = new Smartsearch(driver);
	  s.SSearch("Motor NOT Vehicle");
	  Thread.sleep(1000);
	  s.ClickSearch();
	  Thread.sleep(3000);
	  
	  PublicationNo();
	  if(n>1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("Test is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("Test is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "SearchbarTest3");
           Assert.assertTrue(false);
      		
      }
	  
	  
	  Log.info("Smart Test3 is Completed");
	     
		
  }
  
  @Test
  public void SearchbarTest4() throws InterruptedException, IOException
  {
	  ClickRwireLogo();
	   Thread.sleep(2000);
	   
	  Smartsearch s = new Smartsearch(driver);
	  s.SSearch("EP3614361A1 OR US10778802B2");
	  Thread.sleep(1000);
	  s.ClickSearch();
	  Thread.sleep(3000);
	  

	  PublicationNo();
	  if(n>1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("Test is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("Test is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "SearchbarTest4");
           Assert.assertTrue(false);
      		
      }
	  
	  Log.info("Smart Test4 is Completed");
	     
		
  }
  
  @Test
  public void SearchbarTest5() throws InterruptedException, IOException
  {
	  ClickRwireLogo();
	   Thread.sleep(2000);
	   
	  Smartsearch s = new Smartsearch(driver);
	  s.SSearch("WO2020237853A1");
	  Thread.sleep(1000);
	  s.ClickSearch();
	  Thread.sleep(3000);
	  
	  PublicationNo();
	  if(n>=1)
      {
      	Assert.assertTrue(true);
      	
      	System.out.println("Test is Passed");
      	Log.info("Test is Passed");
      	
      }
      else
      {
    	  System.out.println("Test is Failed");
    	  Log.info("Test is Failed");
      	  CaptureScreen(driver, "SearchbarTest5");
           Assert.assertTrue(false);
      		
      }
	  
	  Log.info("Smart Test5 is Completed");
	  Log.info("=======================================");
	  
	  
	  
}
}
