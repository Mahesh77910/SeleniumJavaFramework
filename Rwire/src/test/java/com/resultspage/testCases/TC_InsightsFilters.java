package com.resultspage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.testCases.BaseClass;

public class TC_InsightsFilters extends BaseClass

{

	@Test
	public void CogFiltersTest() throws InterruptedException, IOException
	{
		
	  Login();
	  
	  FieldSearch s1 = new FieldSearch(driver);
	  s1.FirstTextbox("networking");
	  s1.Searchbutton();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Insights']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("(//img[@class=\"width-25\"])[1]")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//img[@class='img-fluid plus-icon filter-popup-plus mx-2']")).click();
	  
		
		
		
	}
	
}
