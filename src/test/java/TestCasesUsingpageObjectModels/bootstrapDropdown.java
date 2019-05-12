package TestCasesUsingpageObjectModels;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import facebookPages.rediffmailSignupPage;
import testBase.TestBase;
import w3schools.w3schoolsHomePage;

public class bootstrapDropdown extends TestBase{
	String url="https://www.w3schools.com/";
	w3schoolsHomePage w3schools;

	@Test
	public void RediffSignUp() throws InterruptedException{
		log = Logger.getLogger("CheckBoxes/radiobuttons");
		enterURL(url);	
		w3schools=new w3schoolsHomePage();
		w3schools.getLnkTutorials().click();
		clickLink("learn xpath");
	}
		
		void clickLink(String link) throws InterruptedException {
		List<WebElement> list=driver.findElements(By.xpath("//nav[@id='nav_tutorials']//div//a"));
		log.info(list.size());		
		
		for(int i=0;i<list.size();i++) {
			log.info(list.get(i).getText());
			}		
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase(link)) {
				list.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
	}
}
