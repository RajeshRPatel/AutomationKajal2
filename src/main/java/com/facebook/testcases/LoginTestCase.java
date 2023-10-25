package com.facebook.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.facebook.comman.JavaBase;
import com.facebook.pages.LoginPage;
import com.facebook.util.PropertyReader;
public class LoginTestCase extends JavaBase
{
	
	LoginPage loginPage;
	
	@BeforeClass
	public void pageInit()
	{
		loginPage=new LoginPage(driver);	
	}

	
	@Test
	public void loginTest()
	{
		String uname=PropertyReader.getConfigProperty("uname");
		String upass=PropertyReader.getConfigProperty("upass");
		
		loginPage.enterUserName(uname);
		loginPage.enterUserPass(upass);
		loginPage.submitLoginBtn();
	}
	
	
}
