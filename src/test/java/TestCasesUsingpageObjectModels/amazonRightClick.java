package TestCasesUsingpageObjectModels;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import AmazonHomePage.amazonHomePage;
import testBase.TestBase;

public class amazonRightClick extends TestBase{
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
		action.contextClick().perform();
		Thread.sleep(3000);
//		action.contextClick(homePage.getDropcategory()).perform();
//		action.keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).build().perform();
//		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
	}
}
