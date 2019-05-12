package RediffmailHomePage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class RediffHomePage extends TestBase{

	public RediffHomePage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath="//input[@id='login1']") 
	WebElement txtUserName;	
	
	@FindBy(xpath="//input[@id='password']") 
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='proceed']") 
	WebElement btnGo;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}
	
}
