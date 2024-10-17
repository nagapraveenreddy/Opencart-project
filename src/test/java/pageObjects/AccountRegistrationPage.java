package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	// 1. Calling super class constructor
		public AccountRegistrationPage(WebDriver driver) {
			super(driver);
		}
	// 2. Locators
		@FindBy(xpath="//input[@id='input-firstname']")WebElement textFirstName;
		@FindBy(xpath="//input[@id='input-lastname']") WebElement textLastName;
		@FindBy(xpath="//input[@id='input-email']") WebElement textEmail;
		@FindBy(xpath="//input[@id='input-telephone']") WebElement textTelephone;
		@FindBy(xpath="//input[@id='input-password']") WebElement textPassword;
		@FindBy(xpath="//input[@id='input-confirm']") WebElement textConfirmPassword;
		@FindBy(xpath="//label[normalize-space()='Yes']") WebElement radioSubscribeYes;
		@FindBy(xpath="//input[@value='0']") WebElement radioSubscribeNo;
		@FindBy(xpath="//input[@name='agree']") WebElement checkboxPrivacyPolicy;
		@FindBy(xpath="//input[@value='Continue']") WebElement buttonContinue;
		@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement messageConfirmation;
	// 3. Action Methods
		public void setFirstName(String fname) {
			textFirstName.sendKeys(fname);
		}
		public void setLastName(String lname) {
			textLastName.sendKeys(lname);
		}
		public void setEmail(String email) {
			textEmail.sendKeys(email);
		}
		public void setTelephone(String telephone) {
			textTelephone.sendKeys(telephone);
		}
		public void setPassword(String password) {
			textPassword.sendKeys(password);
		}
		public void setConfirmPassword(String confirmpassword) {
			textConfirmPassword.sendKeys(confirmpassword);
		}
		public void clickSubscribeYes() {
			radioSubscribeYes.click();
		}
		public void clickSubscribeNo() {
			radioSubscribeNo.click();
		}
		public void clickPrivacyPolicy() {
			checkboxPrivacyPolicy.click();
		}
		public void clickContinue() {
			buttonContinue.click();
		}
		public String getConfirmationMsg() {
			try {
				return messageConfirmation.getText();
			}
			catch(Exception e){
				return e.getMessage();
			}
		}
}
