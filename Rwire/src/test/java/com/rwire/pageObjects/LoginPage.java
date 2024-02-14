package com.rwire.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  WebDriver ldriver;
	
   public LoginPage(WebDriver rdriver)
  {
	  ldriver=rdriver;
	  PageFactory.initElements(rdriver, this);
  }
	
	
	@FindBy(xpath="//*[@id=\"floatingInput\"]")
	WebElement textemail;
	
	//Password
	@FindBy(xpath="//*[@id=\"floatingPassword\"]") 
	WebElement textpassword;
	
	//Signin button
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	//Email
	public void setEmail(String email) throws InterruptedException
	{
	  Thread.sleep(3000);
	  textemail.sendKeys(email);
	}
	
	//Password
	public void setPassword(String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		textpassword.sendKeys(pwd);
	}
	
	//Sign in Button
	public void clickSubmit() throws InterruptedException 
	{
		Thread.sleep(1000);
		button.click();
	}
	
	

}
