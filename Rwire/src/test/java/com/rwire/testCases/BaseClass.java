package com.rwire.testCases;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rwire.pageObjects.LoginPage;
import com.rwire.utilities.ReadConfig;
import com.rwire.utilities.Reporting;



public class BaseClass 
{
	
  ReadConfig readconfig = new ReadConfig();
  public String baseURL=readconfig.getApplicationURL();
  public String username=readconfig.getUsername();
  public String password=readconfig.getPassword();
  public WebDriver driver;
  public static org.apache.logging.log4j.Logger Log;
  public int n;
  
  
  @BeforeClass
  public void setup() throws InterruptedException 
  {

	  
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAHESH HADWALE\\Documents\\Chrome119\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAHESH HADWALE\\Documents\\Chrome 121\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
//	  driver=new EdgeDriver();
	  
//	  driver=new FirefoxDriver();
	     
	  driver.manage().window().maximize();
	  
	  Log= LogManager.getLogger(BaseClass.class);
	  
	  
	  driver.get(baseURL);
	  Thread.sleep(1000);
	 
      Log.info("Url is opened");
      
	  
//      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
 
  
//  @AfterClass()
//  public void teardown()
//  {
//	  driver.quit();
//	 
//  }
  
  public void PublicationNo() throws InterruptedException, IOException
  {
	  // Publication results
	  Thread.sleep(2000);
	   WebElement e = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div[1]/label/span"));
	   String m = e.getText();
	   String t = m.replaceAll("[()]", "");
	   System.out.println(t);
	   
	    n =Integer.parseInt(t);


  }
  
   public void Login() throws InterruptedException, IOException
   {    
	    driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]")).click();
	    
	    LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.setEmail(username);
		Log.info("Email is entered");
		Thread.sleep(2000);
		
		lp.setPassword(password);
		Log.info("Password is entered");
		
		Thread.sleep(2000);
		lp.clickSubmit();
		Log.info("Signin Button is clicked");
		Thread.sleep(2000);
		
       if(driver.getTitle().equals("Researchwire | Search"))
       {
       	Assert.assertTrue(true);
       	System.out.println("Login Successfull");
       	Log.info("Login test passed");
       	
       }
       else
       {
    	System.out.println("Login Failed");
        Log.info("Login test Failed");
    	CaptureScreen(driver, "loginTest");
       	Assert.assertTrue(false);
//       	System.out.println("Login Failed");
//       	Log.info("Login test Failed");
       	
       }
   }
   
   public void CaptureScreen(WebDriver driver,String tname) throws IOException
   {
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	   FileUtils.copyFile(source, target);
	   System.out.println("Screenshot Taken");
	   
	   
   }
   
   //ExpertSearch button
   public void Expertbutton()
   {
	   WebElement button =driver.findElement(By.xpath("//button[normalize-space()='Search']"));
	   button.click();
   }
   
   public void ClickRwireLogo()
   {
	   driver.findElement(By.xpath("//img[@class='rwire-logo']")).click();
	 
   }
  
  public void ClickExportbtn()
  {
	  WebElement Expbutton = driver.findElement(By.xpath("//button[normalize-space()='Export']"));
	  Expbutton.click();
	  
  }
  
  public void ClickDownload()
  {
	  WebElement downloadbutton = driver.findElement(By.xpath("//div[@class='export-download-text']"));
	  downloadbutton.click(); 
  }
  
  
}
