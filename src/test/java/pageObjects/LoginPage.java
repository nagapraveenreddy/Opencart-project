package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	// 1) Constructor
		public LoginPage(WebDriver driver) {
			super(driver);
		}
		
		// 2) Locators
		@FindBy(xpath="//input[@id='input-email']") WebElement textEmail;
		@FindBy(xpath="//input[@id='input-password']") WebElement textPassword;
		@FindBy(xpath="//input[@value='Login']") WebElement buttonLogin;
		
		// 3) Action Methods
		public void setEmail(String email) {
			textEmail.sendKeys(email);
		}
		public void setPassword(String password) {
			textPassword.sendKeys(password);
		}
		public void clickLogin() {
			buttonLogin.click();
		}
}
