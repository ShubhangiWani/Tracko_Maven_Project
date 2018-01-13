package com.mavenproject.MavenProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	public static void main(String[] args) {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);	
	
WebDriver driver=null;
try {
	driver = new RemoteWebDriver (new URL("http://localhost:4444/wd/hub"), cap);
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		  
		  driver.get("https://dev.tracko.co.in/index.html");
		  WebElement down= driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
			 down.click();
			 driver.close();

	}

}
