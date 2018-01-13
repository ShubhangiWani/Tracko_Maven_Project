package com.mavenproject.MavenProject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class Signup 
{
	String Username ="Shubhangi";
	int RandomNumber = 1;
	WebDriver driver = null;
	String Email ;
	int Phone_no_random = 1234567890;
	public Signup(WebDriver driver2) {
		driver=driver2;
	}
	public void FindElement_Signup()
	{
		Random r= new Random();
		RandomNumber = r.nextInt(40) + 1;
		
	 WebElement down= driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
	 down.click();
	 WebElement yourname = driver.findElement(By.xpath("//input[@id='name']"));
	 Username = Username.concat(String.valueOf(RandomNumber) );
	 //System.out.println("Username	:" + Username);
	yourname.sendKeys(Username); 
	 Email = Username.concat("@gmail.com");
	 //System.out.println("Email	:"+Email);
	WebElement youremail = driver.findElement(By.xpath("//input[@id='email']"));
	youremail.sendKeys(Email);
	 
	 WebElement mobile= driver.findElement(By.xpath("//input[@id='mobile']"));
	 Phone_no_random = Phone_no_random +RandomNumber;
	 //System.out.println("Phone_no_random     :"+ Phone_no_random);
	 mobile.sendKeys(String.valueOf(Phone_no_random));
	 
	WebElement signup = driver.findElement(By.xpath("//button[@id='sub_btn_signup']"));
	signup.click();
	 try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 WebElement OTP = driver.findElement(By.xpath("//input[@id='otp']"));
	 OTP.sendKeys("123456");
	 WebElement VerifyMobile = driver.findElement(By.xpath("//button[@id='sub_btn_verify']"));
	 VerifyMobile.click();
	 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement SuccessWinButton = driver.findElement(By.xpath("//button[@class='confirm']"));
	 System.out.println("SuccessWinButton.getText()  :" + SuccessWinButton.getText());
	 String buttonText= SuccessWinButton.getText();
	if(buttonText.compareTo("OK") ==0 )
		SuccessWinButton.click();
	else
	System.out.println("Exception in Verifing mobile number");
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String Password_value;
	Password_value = Username.concat(String.valueOf(Phone_no_random));
	
	 WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	 Password.sendKeys(Password_value);
	 WebElement rePassword = driver.findElement(By.xpath("//input[@id='repassword']"));
	 rePassword.sendKeys(Password_value);
	 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    
	
	 WebElement SetandProcessedToLogin = driver.findElement(By.xpath("//button[@id='sub_btn_setpass']"));
	 SetandProcessedToLogin.click();
	 System.out.println("Password_value        :"+ Password_value);
	 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement LoginID = driver.findElement(By.xpath("//input[@id='login-mobile']"));
	 LoginID.sendKeys(Email);
	 WebElement LoginPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
	 LoginPassword.sendKeys(Password_value);
	 WebElement Login = driver.findElement(By.xpath("//button[@id='sub_btn']"));
	 Login.click();
	 
}

}

