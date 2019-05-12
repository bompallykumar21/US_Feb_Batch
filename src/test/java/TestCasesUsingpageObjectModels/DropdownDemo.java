package TestCasesUsingpageObjectModels;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import facebookPages.rediffmailSignupPage;
import testBase.TestBase;

public class DropdownDemo extends TestBase{
	Logger log;
	String url="https://register.rediff.com/register/register.php?FormName=user_details";
	rediffmailSignupPage rediff;

	@Test
	public void RediffSignUp() throws InterruptedException{
		log = Logger.getLogger("CheckBoxes/radiobuttons");
		enterURL(url);	
		rediff=new rediffmailSignupPage();
		rediff.selectMonth("FEB");
		rediff.selectMonth(5);
		rediff.selectYear("2000");
		rediff.selectDay(8);			
	}
}

//read url from properties file
//navigate to a page where there is a dropdown
//Read locators using page object
//read the dropdown values
//store in arraylist
//print all the values using log file
//write the dropdown values to excelsheet


