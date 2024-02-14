package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rwire.pageObjects.Forgotpassword;

public class TC_ForgotPasswordTest extends BaseClass
{
    @Test
	public void ForgotPasswordTest() throws InterruptedException, IOException 
	{
	
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]")).click();
	Forgotpassword fp = new Forgotpassword(driver);
	
	fp.Clickforgotpassword();
	
	fp.EnterEmail("mahesh.hadwale@researchwire.in");
	Thread.sleep(2000);
	
	fp.ClickResetButton();
	
	Thread.sleep(2000);
	
	WebElement message = driver.findElement(By.xpath("//p[contains(text(),'If your email id exists, an email will be sent to ')]"));
	
	String ActualMessage = message.getText();
	
	System.out.println("ActualValidationmsg = " + ActualMessage);
	
	String ExpectedMessage = "If your email id exists, an email will be sent to you for resetting the password!";
	
	System.out.println("ExpectedValidationmsg = " + ExpectedMessage);
	
	if(ActualMessage.equals(ExpectedMessage))
	{
		Assert.assertTrue(true);
       	System.out.println("Validation message is verified and Email has been sent");
       	Log.info("Test is Passed");
	}
	
	else
	{
		System.out.println("Validation message is incorrect");
        Log.info("Test is Failed");
    	CaptureScreen(driver, "ForgotPasswordTest");
		Assert.assertTrue(false);
		
	}
	
	Log.info("ForgotpasswordTest is Completed");
	Log.info("=======================================");
	
	}
   
}
