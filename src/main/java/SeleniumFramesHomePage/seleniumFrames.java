package SeleniumFramesHomePage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class seleniumFrames extends TestBase{

	public seleniumFrames() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(linkText="com.thoughtworks.selenium") 
	WebElement lnkthoughtworks;

	public WebElement getLnkthoughtworks() {
		return lnkthoughtworks;
	}		
}
