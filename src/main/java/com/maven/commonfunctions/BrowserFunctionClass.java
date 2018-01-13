/**
 * 
 */
/**
 * @author Yogesh
 *
 */
package com.maven.commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;



public class BrowserFunctionClass
{
	public  WebDriver driver = null;
	
	public void openBrowserWithurl(String BrowserName,String url)
	{
		try
		{
		if(BrowserName.equals("Chrome"))
		{
		 System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe" );
		 driver = new ChromeDriver();
		}
		 else if(BrowserName.equals("firefox"))
		  {
			 System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe" );
			driver = new FirefoxDriver();
		  }
	  else  if(BrowserName.equals("ie"))
		  {
			 System.setProperty("webdriver.ie.driver","Resources/IEDriverServer.exe" );
			driver = new InternetExplorerDriver();
		  }
		 driver.get(url);
		}
		
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	
	public WebDriver getWebDriver()
	{
		return this.driver;
	}
	public void closeDriver()
	{
		driver.close();
	}
	public void WaitForElementFinding(int x)
	{
		 try {
				Thread.sleep(x);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public void findElementByXPathAndClick(By locator_String)
	{
		try
		{
			WebElement xPathWebElement = this.driver.findElement(locator_String);
			xPathWebElement.click();
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		
	}
	public void findElementByXPathAndSendKey(By locator, String sendkey)
	{
		try
		{
		WebElement xPathWebElementWithSendKey = this.driver.findElement(locator);
		xPathWebElementWithSendKey.sendKeys(sendkey);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}
	
	public WebElement findElementByXPath(By locator)
	{
		WebElement xPathWebElementWithSendKey=null;
		try
		{
			xPathWebElementWithSendKey = this.driver.findElement(locator);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
		return xPathWebElementWithSendKey;
	}
	
	}