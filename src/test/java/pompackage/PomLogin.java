package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRM;

public class PomLogin extends BaseHRM {
	
	@FindBy(css="div.oxd-form-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
	WebElement Username;
	@FindBy (css="div.oxd-form-row:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)") WebElement Password;
	@FindBy(css=".oxd-button") WebElement Loginbtn;
	
	// initiate page element
	public PomLogin() {
		
		PageFactory.initElements(driver, this);
	}
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword(String pass) {
		Password.sendKeys(pass);
	}
	public void clickbtn() {
	 Loginbtn.clear();
	}
	public String verify() {
		return driver.getTitle();
		
	}
}
