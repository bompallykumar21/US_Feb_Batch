package makeMyTrip;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class makeMyTripHomePage extends TestBase{

	@FindBy(xpath="//input[@id='fromCity']") 
	WebElement txtDepartureCity;
	
	@FindBy(xpath="//input[@id='toCity']") 
	WebElement txtDestinationCity;
	
	 @FindAll({@FindBy(xpath="//li[@role='option']//div//div[1]")})
	 List<WebElement> lblSuggestions;  
	
	
	public List<WebElement> getLblSuggestions() {
		return lblSuggestions;
	}

	public makeMyTripHomePage() {
		PageFactory.initElements(driver, this);
	}		

	public WebElement getTxtDepartureCity() {
		return txtDepartureCity;
	}

	public WebElement getTxtDestinationCity() {
		return txtDestinationCity;
	}	
}
