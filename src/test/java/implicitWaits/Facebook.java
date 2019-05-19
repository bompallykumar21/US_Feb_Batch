package implicitWaits;

import java.time.LocalTime;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import facebookPages.HomePage;
import testBase.TestBase;

public class Facebook extends TestBase {
	Logger log;
	String url="https://www.facebook.com";

	@Test
	public void SignUpFaceBook(){
		try {
			log = Logger.getLogger("Facebook SignUp");
			enterURL(url);
			String pageTitle = driver.getTitle();
			//comparing expected with actual
			Assert.assertEquals("Facebook – log in or sign up", pageTitle, "Expected and Actual are not same");
			Assert.assertTrue(pageTitle.contains("Facebook"), "Page title does not contain Facebook text");
			log.info("Expected Title and Actual Title are same");
			HomePage homePage = new HomePage();
			System.out.println(LocalTime.now());
			homePage.getTxtFirstName().sendKeys("First Name");
			log.info("First Name field value is entered");
			System.out.println(LocalTime.now());
			homePage.getTxtSurname().sendKeys("SurName");
			log.info("Sur Name field value is entered");
		}catch(Exception e) {
			log.info("Locators not identified");
			System.out.println(LocalTime.now());
		}
	}
}
