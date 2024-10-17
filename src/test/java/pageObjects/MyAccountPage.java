package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	// 1) Constructor
		public MyAccountPage(WebDriver driver) {
			super(driver);
		}
		
		// 2) Locators
		@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement msgHeading;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement linkLogout;
		
		// 3) Action Methods
		public boolean isMyAccountPageExists() {
			try {
				return msgHeading.isDisplayed();
			}
			catch(Exception e) {
				return false;
			}
		}
		public void clickLogout() {
			linkLogout.click();
		}
}
