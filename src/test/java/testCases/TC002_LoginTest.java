package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
	
		logger.info("*** Started TC002_LoginTest ***");
		
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link..");
			hp.clickLogin();
			logger.info("Clicked on Login Link");
			
			//Login Page
			LoginPage lp = new LoginPage(driver);
			logger.info("Providing credentials");
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			//My Account Page
			logger.info("Validating the existence of My Account Page");
			MyAccountPage map = new MyAccountPage(driver);
			boolean targetPage = map.isMyAccountPageExists();
			
			Assert.assertEquals(targetPage, true,"Login Failed");	
		}
		catch(Exception e) {
			logger.error("Test Failed...");
			logger.debug("Debug Logs...");
			Assert.fail();
		}
		logger.info("*** Finished TC002_LoginTest ***");
	
	
	}
}
