package com.facebook.comman;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeSuite;

import com.facebook.util.PropertyReader;

public class JavaBase 
{
	
	static public WebDriver driver;

	@BeforeSuite
	public void browserSetUp()
	{
		String browser=PropertyReader.getConfigProperty("browser");
		switch (browser) 
		{
		case "chrome":
		driver= new ChromeDriver();
		break;
		
		case "firefox":
			driver= new FirefoxDriver();
			break;
		default:
			break;
		}
		 
	   String url=PropertyReader.getConfigProperty("server_url");
	   driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	
	
	static public By ByLocator(String locator)
	{
              By result = null;
              
              if (locator.startsWith(".//")) {
                  result = By.xpath(locator);
              }
              else if (locator.startsWith("//")) {
                  result = By.xpath(locator);
              } else if (locator.startsWith("css=")) {
                  result = By.cssSelector(locator.replace("css=", ""));
              } else if (locator.startsWith("name=")) {
                  result = By.name(locator.replace("name=", ""));
              } else if (locator.startsWith("link=")) {
                  result = By.linkText(locator.replace("link=", ""));
              } else if (locator.startsWith("id="))  {
                  result = By.id(locator.replace("id=", ""));
              }
              else {
                  result = By.id(locator);
              }
              return result;
          }

	 
	
	public static WebElement findElementBy(By by)
	{
		WebElement element=driver.findElement(by);
		return element;
	}
	
	static public void sendKeysByUser(String locator,String value)
	{ 
		 By by=ByLocator(locator);
		 WebElement element=findElementBy(by);
		element.sendKeys(value); 		
	}
	
	
	
	static public void onClick(String locator)
	{
		 By by=ByLocator(locator);
		 WebElement element=findElementBy(by);
		 element.click();
	}
	
	

}
