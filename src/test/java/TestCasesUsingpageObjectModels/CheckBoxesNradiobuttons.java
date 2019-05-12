package TestCasesUsingpageObjectModels;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import facebookPages.rediffmailSignupPage;
import testBase.TestBase;

public class CheckBoxesNradiobuttons extends TestBase{
	Logger log;
	String url="https://register.rediff.com/register/register.php?FormName=user_details";
	rediffmailSignupPage rediff;

	@Test
	public void RediffSignUp() throws InterruptedException{
		log = Logger.getLogger("CheckBoxes/radiobuttons");
		enterURL(url);	
		rediff=new rediffmailSignupPage();

//		log.info("Is checkbox Displayed: "+ rediff.getChkboxAlternateEmails().isDisplayed());
		isDisplayed(rediff.getChkboxAlternateEmails());
		log.info("Is checkbox selected: "+ rediff.getChkboxAlternateEmails().isSelected());
		log.info("Is checkbox Enabled: "+ rediff.getChkboxAlternateEmails().isEnabled());

		log.info("Is Male radiobutton Displayed: "+ rediff.getRadioButtonMale().isDisplayed());
		log.info("Is Male radiobutton selected: "+ rediff.getRadioButtonMale().isSelected());
		log.info("Is Male radiobutton Enabled: "+ rediff.getRadioButtonMale().isEnabled());

		log.info("Is FeMale radiobutton Displayed: "+ rediff.getRadioButtonFemale().isDisplayed());
		log.info("Is FeMale radiobutton selected: "+ rediff.getRadioButtonFemale().isSelected());
		log.info("Is FeMale radiobutton Enabled: "+ rediff.getRadioButtonFemale().isEnabled());
		rediff.SelectCheckBox(); //initially not selected
		Thread.sleep(4000);
		log.info("Is checkbox selected after changes: "+ rediff.getChkboxAlternateEmails().isSelected());
		rediff.SelectCheckBox();  //initially selected
		log.info("Is checkbox selected after changes: "+ rediff.getChkboxAlternateEmails().isSelected());
		rediff.DeselectCheckBox(); //initially selected
		log.info("Is checkbox selected after changes: "+ rediff.getChkboxAlternateEmails().isSelected());
		rediff.DeselectCheckBox(); //initially deselected
		log.info("Is checkbox selected after changes: "+ rediff.getChkboxAlternateEmails().isSelected());
	}
}

