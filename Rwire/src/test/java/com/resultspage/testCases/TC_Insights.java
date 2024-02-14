package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
		Thread.sleep(3000);
		
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
	}
	
	
	
}
