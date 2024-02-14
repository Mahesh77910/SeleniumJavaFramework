package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rwire.utilities.XLUtility;

public class TC_DataDrivenTest_003 extends BaseClass
{

	@Test(dataProvider="ExpT")
	public void ExpertTest(String query,String pwd) throws InterruptedException, IOException
	{
		Login();
		Thread.sleep(2000);
//		WebElement ExpertTab=driver.findElement(By.xpath("//button[normalize-space()='Expert']"));
//		ExpertTab.sendKeys(query);
		
		driver.findElement(By.xpath("//*[@id=\"floatingInput\"]")).sendKeys(query);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"floatingPassword\"]")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/form/div[4]/button")).click();
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//a[@id='nav-dropdown-dark-example']")).click();
	        
	     driver.findElement(By.xpath("//*[@id=\"navbar-dark-example\"]/div/div/div/a[2]/span")).click();
		
		
	}
	
	@DataProvider(name="ExpT")
	public String [][] getData() throws IOException, InterruptedException
	{
		
	 // get the data from the Excel
		Thread.sleep(2000);
		String path="C://Users//MAHESH HADWALE//eclipse-workspace//Rwire//src//test//java//com//rwire//testData//ExcelTesting.xlsx";
		XLUtility xlutil= new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1 );
		
		String loginData [][]= new String [totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			
		   for(int j=0;j<totalcols;j++)
		   {
			   loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
		   }
			
			
		}
		
	
		return loginData;
	}
}
