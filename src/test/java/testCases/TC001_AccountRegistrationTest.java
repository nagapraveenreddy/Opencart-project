package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
	
		logger.info("*** Started TC001_AccountRegistrationTest ***");
		
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link..");
			hp.clickRegister();
			logger.info("Clicked on Register Link");
			
			//Register Page
			AccountRegistrationPage arp = new AccountRegistrationPage(driver);
			logger.info("Providing user details...");
			arp.setFirstName(randomString().toUpperCase());
			arp.setLastName(randomString().toUpperCase());
			arp.setEmail(randomString()+"@gmail.com");
			arp.setTelephone(randomNumber());
			
			String randPass = randomString();
			arp.setPassword(randPass);
			arp.setConfirmPassword(randPass);
			arp.clickSubscribeNo();
			arp.clickPrivacyPolicy();
			arp.clickContinue();
			
			logger.info("Validating expected message...");
			String confmsg = arp.getConfirmationMsg();
			Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		}
		catch(Exception e){
			logger.error("Test Failed...");
			logger.debug("Debug Logs...");
			Assert.fail();
		}
		logger.info("*** Finished TC001_AccountRegistrationTest ***");
		
		
	}
}
