package TestCasesUsingpageObjectModels;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import makeMyTrip.makeMyTripHomePage;
import testBase.TestBase;

public class ActionsClassDemo extends TestBase{
	String url="https://www.makemytrip.com/";
	makeMyTripHomePage homePage;

	@Test
	public void RediffSignUp() throws InterruptedException{
		log = Logger.getLogger("MakeMyTrip");
		enterURL(url);	
		homePage=new makeMyTripHomePage();
		Thread.sleep(5000);
		homePage.getTxtDepartureCity().click();

		Actions action=new Actions(driver);

		action.moveToElement(homePage.getTxtDepartureCity()).sendKeys("Hyderabad").build().perform();
		Thread.sleep(2000);
		List<WebElement> suggestionListDep=homePage.getLblSuggestions();
		System.out.println(suggestionListDep.size());
		for(int i=0;i<suggestionListDep.size();i++) {
			System.out.println(suggestionListDep.get(i).getText());
		}
		suggestionListDep.get(0).click();
		
		action.moveToElement(homePage.getTxtDestinationCity()).sendKeys("Mum").build().perform();
		Thread.sleep(2000);
		List<WebElement> suggestionListDes=homePage.getLblSuggestions();
		System.out.println(suggestionListDes.size());
		for(int i=0;i<suggestionListDes.size();i++) {
			System.out.println(suggestionListDes.get(i).getText());
		}
		suggestionListDes.get(0).click();
		
	}

}
