package w3schools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class w3schoolsHomePage extends TestBase {

	public w3schoolsHomePage() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[@id='navbtn_tutorials']") 
	WebElement lnkTutorials;

	public WebElement getLnkTutorials() {
		return lnkTutorials;
	}	
	
	
}
