package com.facebook.pages;
import org.openqa.selenium.WebDriver;

import com.facebook.comman.JavaBase;

 
public class LoginPage  
{
	WebDriver driver;

	public static final String UNAME="name=username";
	public static final String UPASS="//input[@name='password']";
	public static final String LOGIN_BTN="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
	
	
	public LoginPage(WebDriver driver) {
	 this.driver=driver;
	}


	public void enterUserName(String name) 
	{		 
		JavaBase.sendKeysByUser(UNAME, name);
	}

	
	public void enterUserPass(String pass) 
	{
		JavaBase.sendKeysByUser(UPASS, pass);
 	}


	public void submitLoginBtn() 
	{
	  JavaBase.onClick(LOGIN_BTN);	
 		 
	}

}
