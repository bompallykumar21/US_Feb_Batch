package hdfcBankPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class naukri extends TestBase{

	public naukri() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath="//a[@id='loginsubmit']") 
	WebElement btnLogin;

	@FindBy(xpath="//a[contains(.,'Continue to NetBanking')]") 
	WebElement btnContinue;

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
	
}
