package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_FieldedTest_13 extends BaseClass
{

	@Test
	public void FieldedTest1() throws InterruptedException, IOException
	{
		
		Login();
		
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.xpath("//*[@class='select-dropdown__indicator select-dropdown__dropdown-indicator css-tlfecz-indicatorContainer']"));
		state.click();
		
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='select-dropdown__single-value css-qc6sy-singleValue'])[1]"));
		
		Actions action = new Actions(driver); 
		

		Thread.sleep(1000);
		action.moveToElement(element).click().perform();
		
		Thread.sleep(7000);
			
	}
}
