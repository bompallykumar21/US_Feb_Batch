package TestCasesUsingpageObjectModels;

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
		log = Logger.getLogger("Facebook SignUp");
		enterURL(url);
		String pageTitle = driver.getTitle();
		//comparing expected with actual
		Assert.assertEquals("Facebook – log in or sign up ", pageTitle, "Expected and Actual are not same");
		Assert.assertTrue(pageTitle.contains("Facebook"), "Page title does not contain Facebook text");
		log.info("Expected Title and Actual Title are same");
		HomePage homePage = new HomePage();
		homePage.getTxtFirstName().sendKeys("First Name");
		log.info("First Name field value is entered");
		homePage.getTxtSurname().sendKeys("SurName");
		log.info("Sur Name field value is entered");

	}
}
