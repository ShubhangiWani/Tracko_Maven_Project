package com.mavenproject.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Selenium {
	WebDriver driver = null;
  @Test (priority =1)
  public void SignUp() {
	 
	  {
	Signup s = new Signup(driver);
	s.FindElement_Signup();
	  }
  }
  @Test (priority =2)
  public void Login()
  {
	  
  }
  @Parameters ("browser")
  @BeforeTest
  public void beforeTest(String val) 
  {
	 
	 if(val.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe" );
	  driver = new ChromeDriver();
	  
	  driver.get("https://dev.tracko.co.in/index.html");
	  }
	/* else if(val.equals("firefox"))
	  {
		 System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe" );
		driver = new FirefoxDriver();
		 driver.get("https://dev.tracko.co.in/index.html");
	  }
  else  if(val.equals("ie"))
	  {
		 System.setProperty("webdriver.ie.driver","Resources/IEDriverServer.exe" );
		driver = new InternetExplorerDriver();
		 driver.get("https://dev.tracko.co.in/index.html");
	  }*/
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
