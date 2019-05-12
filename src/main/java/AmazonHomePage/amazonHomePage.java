package AmazonHomePage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class amazonHomePage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Category')]") 
	WebElement dropcategory;
	
	 public WebElement getDropcategory() {
		return dropcategory;
	}

	public List<WebElement> getLblCategoryOptions() {
		return lblCategoryOptions;
	}

	@FindAll({@FindBy(xpath="//span[@role='navigation']")})
	 List<WebElement> lblCategoryOptions;  
	
	public amazonHomePage() {
		PageFactory.initElements(driver, this);
	}		
}
