//package com.facebook.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import com.facebook.comman.JavaBase;
//
// 
//public class DashBoardPage  
//{
//	WebDriver driver;
//
//	public static final String UNAME="//input[@name='username']";
//	public static final String UPASS="//input[@name='password']";
//	public static final String LOGIN_BTN="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
//	
//	
//	
//	public DashBoardPage(WebDriver driver) {
//	 this.driver=driver;
//	}
//
//
//	public void enterUserName(String name) 
//	{
//		JavaBase.sendKeys(UNAME,name); 
//		
//		
//	 	//driver.findElement(By.xpath(UNAME)).sendKeys(name);
//	 	
//	 	
//	}
//
//	
//	public void enterUserPass(String pass) 
//	{
//
//	 	driver.findElement(By.xpath(UPASS)).sendKeys(pass);
//	}
//
//
//	public void submitLoginBtn() 
//	{
//		driver.findElement(By.xpath(LOGIN_BTN)).submit();
//		 
//	}
//
//}
