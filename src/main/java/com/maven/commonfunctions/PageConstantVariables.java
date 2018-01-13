package com.maven.commonfunctions;

import org.openqa.selenium.By;

public class PageConstantVariables {
public static By locatorfor_SignUpFree =By.xpath( "//a[text()='Sign Up Free']");
public static By locatorfor_SignUpYourName = By.xpath("//input[@id='name']");
public static By locatorfor_SignUpYourEmail = By.xpath("//input[@id='email']");
public static By locatorfor_SignUpMobile =By.xpath("//input[@id='mobile']");
public static By locatorfor_SignUp_button=By.xpath("//button[@id='sub_btn_signup']");
public static By locatorfor_SignUp_OTP=By.xpath("//input[@id='otp']");
public static By locatorfor_SignUpVerifyOTP = By.xpath("//button[@id='sub_btn_verify']");
public static By locatorfor_SignUp_ConfirmButton=By.xpath("//button[@class='confirm']");
public static By locatorfor_SignUp_SetPassword=By.xpath("//input[@id='password']");
public static By locatorfor_SignUp_ReTypesetPass=By.xpath("//input[@id='repassword']");
public static By locatorfor_SignUp_SubmitButton=By.xpath("//button[@id='sub_btn_setpass']");
public static By locatorfor_LoginUSerNameEmail = By.xpath("//input[@id='login-mobile']");
}
