package com.rwire.utilities;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Reporting extends TestListenerAdapter implements ITestListener
{

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestContext testContext)
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/ExtentReport/Report.html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/src/main/resources/Extent_Report_config.xml");
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo(" OS Environment", "Windows 11");
		extent.setSystemInfo("Tester", "Mahesh Hadwale");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Browser Version", "113.0.5672.127");
		
		
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		
		String screenshotPath= System.getProperty("user.dir")+"\\Screenshots\\"+ tr.getName()+".png";
		
		File f = new File(screenshotPath);
		
		if(f.exists())
		{
			try {
				logger.fail("Screenshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
			}
			
			catch(Throwable t) 
			{
				t.printStackTrace();
			}
			
		}
		
		
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	public void onFinish(ITestContext testContext)
	{
		
		extent.flush();
		
	}
}
