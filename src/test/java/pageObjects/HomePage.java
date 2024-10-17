package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	// 1. Calling super class constructor
		public HomePage(WebDriver driver) {
			super(driver);
		}
	
	// 2. Locators
		@FindBy(xpath="//a[@title='My Account']") WebElement linkMyAccount;
		@FindBy(xpath="//a[normalize-space()='Register']") WebElement linkRegister;
		@FindBy(xpath="//a[normalize-space()='Login']") WebElement linkLogin;
		
		
	// 3. Action Methods
		public void clickMyAccount() {
			linkMyAccount.click();
		}
		public void clickRegister() {
			linkRegister.click();
		}
		public void clickLogin() {
			linkLogin.click();
		}
	
}
