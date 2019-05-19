package TestCasesUsingpageObjectModels;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import facebookPages.rediffmailSignupPage;
import testBase.TestBase;
import w3schools.w3schoolsHomePage;

public class bootstrapDropdown extends TestBase{
	String url="https://www.w3schools.com/";
	w3schoolsHomePage w3schools;

	@Test
	public void w3schoolsBootstrap() throws InterruptedException, IOException{
		extentTest=extentReports.createTest("bootstrapDropdown");
		log = Logger.getLogger("CheckBoxes/radiobuttons");
		enterURL(url);	
		w3schools=new w3schoolsHomePage();
		w3schools.getLnkTutorials().click();
		clickLink("learn xpath");
		extentTest.pass("w3schools Bootstrap demo test case is passe3d");
		extentTest.pass("w3schools", MediaEntityBuilder.createScreenCaptureFromPath(
				takeScreenshot(driver,"w3schools")).build());
		extentTest.fail("w3schools", MediaEntityBuilder.createScreenCaptureFromPath(
				takeScreenshot(driver,"w3schools")).build());
	}
		
		void clickLink(String link) throws InterruptedException {
		List<WebElement> list=driver.findElements(By.xpath("//nav[@id='nav_tutorials']//div//a"));
		log.info(list.size());		
		
		for(int i=0;i<list.size();i++) {
			log.info(list.get(i).getText());
			extentTest.info(list.get(i).getText());
			}		
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase(link)) {
				list.get(i).click();
				Thread.sleep(5000);
				extentTest.fail("The test is failed check");
				break;
			}
		}
	}
}
