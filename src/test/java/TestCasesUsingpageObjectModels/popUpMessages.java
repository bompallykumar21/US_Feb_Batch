package TestCasesUsingpageObjectModels;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import AmazonHomePage.amazonHomePage;
import RediffmailHomePage.RediffHomePage;
import facebookPages.rediffmailSignupPage;
import testBase.TestBase;

public class popUpMessages extends TestBase{
	String url="https://mail.rediff.com/cgi-bin/login.cgi";

	@Test
	public void rediff() throws InterruptedException, IOException{
		log = Logger.getLogger("Rediff");
		enterURL(url);	
		RediffHomePage homePage=new RediffHomePage();
		homePage.getBtnGo().click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		String popUpMessage=alert.getText();
		log.info(popUpMessage);
//		alert.accept();
		alert.dismiss();
	
		
		
	}
}
