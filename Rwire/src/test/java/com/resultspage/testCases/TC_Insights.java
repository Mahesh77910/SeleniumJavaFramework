package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.testCases.BaseClass;

public class TC_Insights extends BaseClass
{
    @Test(priority=1)
	public void CogniGraphsTest() throws InterruptedException, IOException
	{
		
		Login();
		FieldSearch f1 = new FieldSearch(driver);
		f1.FirstTextbox("transport");
		f1.Searchbutton();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Insights']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[1]")).click();
		Thread.sleep(2000);
		System.out.println("Innovation Trend graph is opened =1");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[2]")).click();
		Thread.sleep(2000);
		System.out.println("Research Centers graph is opened =2");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[3]")).click();
		Thread.sleep(2000);
		System.out.println("Geographical graph is opened =3");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		Actions at = new Actions(driver);
	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(2000);
	    
	    
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[4]")).click();
		Thread.sleep(2000);
		System.out.println("Filing trend graph is opened =4");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[5]")).click();
		Thread.sleep(2000);
		System.out.println("Top Standardized Assignee graph is opened =5");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[6]")).click();
		Thread.sleep(2000);
		System.out.println("Top Inventer Name graph is opened =6");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[7]")).click();
		Thread.sleep(2000);
		System.out.println("Top Assignee and Backward Citation graph is opened =7");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[8]")).click();
		Thread.sleep(2000);
		System.out.println("Top Inventor and Backward Citation graph is opened =8");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[9]")).click();
		Thread.sleep(2000);
		System.out.println("IPC Filing trend graph is opened =9");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[10]")).click();
		Thread.sleep(2000);
		System.out.println("Top IPC Classes graph is opened =10");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[11]")).click();
		Thread.sleep(2000);
		System.out.println("Assignee VS IPC graph is opened =11");
		driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer']")).click();
		Thread.sleep(1000);
		System.out.println("==========================================================");
	}
	
    @Test(priority=2)
	 public void CogGraphTypeTest() throws InterruptedException
	{
		Thread.sleep(1000);
    	JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-1200)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class=\"width-25\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@title='column2D']")).click();
		System.out.println("Column2D graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='bar2D']")).click();
		System.out.println("Bar2D graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='pie2D']")).click();
		System.out.println("Pie2D graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='splinearea']")).click();
		System.out.println("Splinearea graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='doughnut2D']")).click();
		System.out.println("Doughnut2D graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='column3d']")).click();
		System.out.println("Column3d graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='pie3d']")).click();
		System.out.println("Pie3d graph is clicked");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title='doughnut3d']")).click();
		System.out.println("Doughnut3d graph is clicked");
		Thread.sleep(2000);
		

	}
	
    
    @Test(priority=3)
    public void CogComTest() throws InterruptedException
    {
      Thread.sleep(1000);
      driver.findElement(By.xpath("//img[@title='column2D']")).click();
      driver.findElement(By.xpath("//button[normalize-space()='Combine Fields']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
      driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//button[normalize-space()='Merge']")).click();
      System.out.println("Merge button is clicked");
      driver.findElement(By.xpath("//img[@class='width-25 cursor-pointer position-absolute merge-close-icon']")).click();
      Thread.sleep(2000);
//      driver.findElement(By.xpath("(//button[@class='input-button-text-form normal-button medium-width'])[2]")).click();
//	  System.out.println("Apply button is Clicked");
    	
    	
    	
    }
    
    
    
    @Test(priority=4)
    public void CogTopYTest() throws InterruptedException
    {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']")).click();
    	System.out.println("Top 10 is Select by default");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("(//div[contains(text(),'Top 20')]")).click();
    	System.out.println("Top 20 is Selected");
    	Thread.sleep(1000);
    	
    	
    	
    	
    	
    	
    }
}
