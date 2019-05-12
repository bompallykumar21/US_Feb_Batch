package irctcPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class IrctcHomePage extends TestBase{

	@FindBy(xpath="//input[@placeholder='From*']") 
	WebElement txtFromStation;	
	
	@FindBy(xpath="//input[@placeholder='To*']") 
	WebElement txtToStation;	
	
	@FindBy(xpath="//button[contains(text(),'Find trains')]") 
	WebElement btnSearch;
	
	public WebElement getLblTrainsFound() {
		return lblTrainsFound;
	}


	@FindBy(xpath="//div[@class='col-md-12 hidden-xs']//b[contains(text(),'trains found')]") 
	WebElement lblTrainsFound;
	
	
	public WebElement getTxtFromStation() {
		return txtFromStation;
	}


	public WebElement getTxtToStation() {
		return txtToStation;
	}


	public WebElement getBtnSearch() {
		return btnSearch;
	}


	public IrctcHomePage() {
		PageFactory.initElements(driver, this);
	}
	
}
