/**
 * 
 */
/**
 * @author Yogesh
 *
 */
package com.mavenproject.testCases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.commonfunctions.BrowserFunctionClass;
import com.maven.commonfunctions.PageConstantVariables;

public class tracko_TestCase
{
	
	public BrowserFunctionClass commonFunction=new BrowserFunctionClass();
	WebDriver driver=null;
	int Phone_no_random=1234567890; 
	String Username ="Shubhangi", Email;
	int RandomNumber = 1;
	
@Test
public void Sign_upTestCaases()
{
	try
	{
	Random r= new Random();
	RandomNumber = r.nextInt(40) + 1;
	//Open Chrome broswer and start test cases for testing Sign_up functionality of tracko.co.in page
	commonFunction.openBrowserWithurl("Chrome","https://dev.tracko.co.in/index.html");	

	commonFunction.WaitForElementFinding(3000);
	//Find and click Sign_up button web element
	commonFunction.findElementByXPathAndClick(PageConstantVariables.locatorfor_SignUpFree);
	//Find and send value of your name textBox web element
	Username = Username.concat(String.valueOf(RandomNumber) );	
	commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_SignUpYourName, Username);
	//Find and send value of Email textBox web element
	 Email = Username.concat("@gmail.com");
	commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_SignUpYourEmail, Email);
	//Find and send value of mobile number textBox web element
	 Phone_no_random = Phone_no_random +RandomNumber;
	 commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_SignUpMobile,String.valueOf(Phone_no_random));
	 //Find and click sign up button to submit the entered record.
	commonFunction.findElementByXPathAndClick(PageConstantVariables.locatorfor_SignUp_button);
	//Wait to submit the record and switch to OTP page.
	 commonFunction.WaitForElementFinding(6000);
	 //Find and send value of OTP web element
	 commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_SignUp_OTP, "123456");
	 //Find and click verify OTP button
	 commonFunction.findElementByXPathAndClick(PageConstantVariables.locatorfor_SignUpVerifyOTP);
	 //Wait to verify the OTP send to mobile number
	 commonFunction.WaitForElementFinding(6000);
	//Find the confirm window ---To verify the test case is pass or fail
	 WebElement SuccessWinButton = commonFunction.findElementByXPath(PageConstantVariables.locatorfor_SignUp_ConfirmButton);
	 System.out.println("SuccessWinButton.getText()  :" + SuccessWinButton.getText());
	 String buttonText= SuccessWinButton.getText();
	if(buttonText.compareTo("OK") ==0 )
		SuccessWinButton.click();
	else
	System.out.println("Exception in Verifing mobile number");
	commonFunction.WaitForElementFinding(6000);
	
	String Password_value;
	Password_value = Username.concat(String.valueOf(Phone_no_random));
	//Find and send the value for set password field of page
	commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_SignUp_SetPassword, Password_value);
	//Find and send the value for Re_set password field of page
		commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_SignUp_ReTypesetPass, Password_value);
		commonFunction.WaitForElementFinding(6000);
    //Find and click sunbmit button for sign_up page to set the password
	
	commonFunction.findElementByXPathAndClick(PageConstantVariables.locatorfor_SignUp_SubmitButton);
	//Find and send the keys to login with Email as USername
	commonFunction.findElementByXPathAndSendKey(PageConstantVariables.locatorfor_LoginUSerNameEmail, Email);
	 System.out.println("Password_value        :"+ Password_value);
	 commonFunction.WaitForElementFinding(5000);
	 
	 commonFunction.closeDriver();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}