package TestCasesUsingpageObjectModels;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import AmazonHomePage.amazonHomePage;
import makeMyTrip.makeMyTripHomePage;
import testBase.TestBase;

public class amazonTest extends TestBase{
	String url="https://www.amazon.in/";
	amazonHomePage homePage;
	String expectedOption="Amazon Prime Music";
	

	@Test
	public void amazon() throws InterruptedException{
		log = Logger.getLogger("Amazon");
		enterURL(url);	
		homePage=new amazonHomePage();
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(homePage.getDropcategory()).perform();
		Thread.sleep(2000);
		System.out.println(homePage.getLblCategoryOptions().size());
		for(int i=0;i<homePage.getLblCategoryOptions().size();i++) {
			System.out.println(homePage.getLblCategoryOptions().get(i).getText());
			if(homePage.getLblCategoryOptions().get(i).getText().contains(expectedOption)) {
				homePage.getLblCategoryOptions().get(i).click();
				break;
			}
		}
	}
}
