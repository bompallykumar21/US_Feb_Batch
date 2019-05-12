package ExplicitWait;

import java.time.LocalTime;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import facebookPages.HomePage;
import irctcPages.IrctcHomePage;
import testBase.TestBase;

public class irctc extends TestBase {
	Logger log;
	String url="https://www.irctc.co.in/nget/train-search";
	WebDriverWait wait;

	@Test
	public void irctcSearch() throws InterruptedException{
		log = Logger.getLogger("irctc");
		enterURL(url);


		IrctcHomePage homePage = new IrctcHomePage();
		System.out.println(LocalTime.now());

		wait= new WebDriverWait(driver, 40);  //time is in seconds
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getTxtFromStation()));

		System.out.println(LocalTime.now());
		homePage.getTxtFromStation().sendKeys("HYDERABAD DECAN - HYB");
		homePage.getTxtToStation().sendKeys("MUMBAI CENTRAL - BCT");
		homePage.getBtnSearch().click();	
		System.out.println(LocalTime.now());
		wait = new WebDriverWait(driver, 40);  //time is in seconds
		wait.until(ExpectedConditions.visibilityOf(homePage.getLblTrainsFound()));
		System.out.println(LocalTime.now());

	}
}
