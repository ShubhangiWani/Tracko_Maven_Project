/**
 * 
 */
/**
 * @author Yogesh
 *
 */
package com.mavenproject.practice;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class reportCommonClass
{

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	ExtentTest test ;
	public void method()
	{
		htmlReporter= new ExtentHtmlReporter("Resource/Tracko.html");
		//htmlReporter.setAppendExisting(true);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Tracko Results");
		//htmlReporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		test= extent.createTest("My Regression Test");
		test.assignAuthor("Saurab Dey");
		
	//	test.log(Status.PASS, "I am staring Automation");
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		//driver= new ChromeDriver();
		test.pass("I am staring browser");
		
	//	driver.get("https://dev.tracko.co.in/");
		test.pass("I am opeing the site");
		
	/*	try {
			
			//test.pass("details").addScreenCaptureFromPath(screenshot("screenshot1"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}