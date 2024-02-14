package com.rwire.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
    @Test
	public void loginTest() throws InterruptedException, IOException
	{
        
		Login();
//		Thread.sleep(2000);
//		LoginPage lp = new LoginPage(driver);
//		Thread.sleep(2000);
//		lp.setEmail(username);
//		Log.info("Email is entered");
//		Thread.sleep(2000);
//		
//		lp.setPassword(password);
//		Log.info("Password is entered");
//		
//		Thread.sleep(2000);
//		lp.clickSubmit();
//		Log.info("Signin Button is clicked");
//		Thread.sleep(2000);
//		
//        if(driver.getTitle().equals("Researchwire | Search"))
//        {
//        	Assert.assertTrue(true);
//        	System.out.println("Login Successfull");
//        	Log.info("Login test passed");
//        	
//        }
//        else
//        {
//        	Assert.assertTrue(false);
//        	System.out.println("Login Failed");
//        	Log.info("Login test Failed");
//        	
//        }
		Log.info("=======================================");
	}
	
	
}