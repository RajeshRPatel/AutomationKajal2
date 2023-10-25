package com.facebook.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.facebook.comman.JavaBase;
import com.facebook.pages.LoginPage;
import com.facebook.util.PropertyReader;
public class DashboardTestCase extends JavaBase
{
	
	LoginPage loginPage;
	
	@BeforeClass
	public void pageInit()
	{
		loginPage=new LoginPage(this.driver);	
	}
	
	
	@Test
	public void loginTest()
	{
		loginPage.enterUserName(PropertyReader.getConfigProperty("uname"));
		loginPage.enterUserPass(PropertyReader.getConfigProperty("upass"));
		loginPage.submitLoginBtn();
	}
	
	
}
