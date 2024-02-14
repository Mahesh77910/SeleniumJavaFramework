package com.rwire.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.rwire.pageObjects.FieldSearch;
import com.rwire.pageObjects.PatentView;

public class TC_PatentViewTest extends BaseClass
{
    @Test
	public void PatentViewTest() throws InterruptedException, IOException
	{
		
		Login();
		
		FieldSearch s = new FieldSearch(driver);
		
		s.FirstTextbox("device AND signal");
		
		s.Searchbutton();
		Thread.sleep(4000);
		
		PatentView p = new PatentView(driver);
		
		p.ClickPatentNo();
		Thread.sleep(2000);
		p.ClickClassification();
		Thread.sleep(2000);
		p.ClickClaim();
		Thread.sleep(2000);
		p.ClickDesc();
		Thread.sleep(2000);
		p.ClickFamilies();
		Thread.sleep(2000);
		p.ClickCitation();
		Thread.sleep(2000);
		p.ClickLE();
		Thread.sleep(2000);
		p.ClickTop();
		Thread.sleep(2000);
		p.Clickshowall();
		Thread.sleep(3000);
		p.ClickDefault();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 300)");
        Thread.sleep(2000);
		p.ClickSmartReader();
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
}
