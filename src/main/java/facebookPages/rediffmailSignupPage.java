package facebookPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.TestBase;

public class rediffmailSignupPage extends TestBase{

	public rediffmailSignupPage() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(xpath="//input[starts-with(@name,'chk_altemail')]") 
	WebElement chkboxAlternateEmails;

	@FindBy(xpath="//input[@value='m']") 
	WebElement radioButtonMale;

	@FindBy(xpath="//input[@value='f']") 
	WebElement radioButtonFemale;

	@FindBy(xpath="//select[starts-with(@name,'DOB_Day')]") 
	WebElement drpDwnDay;

	@FindBy(xpath="//select[starts-with(@name,'DOB_Month')]") 
	WebElement drpDwnMonth;

	@FindBy(xpath="//select[starts-with(@name,'DOB_Year')]") 
	WebElement drpDwnYear;

	public WebElement getRadioButtonMale() {
		return radioButtonMale;
	}

	public WebElement getDrpDwnDay() {
		return drpDwnDay;
	}

	public WebElement getDrpDwnMonth() {
		return drpDwnMonth;
	}

	public WebElement getDrpDwnYear() {
		return drpDwnYear;
	}

	public WebElement getRadioButtonFemale() {
		return radioButtonFemale;
	}

	public WebElement getChkboxAlternateEmails() {
		return chkboxAlternateEmails;
	}

	public void SelectCheckBox(){
		if(!getChkboxAlternateEmails().isSelected()) {
			getChkboxAlternateEmails().click();
			log.info("Checkbox is selected now");
		}
		else {
			log.info("Checkbox is already slected and no changes made");
		}
	}

	public void DeselectCheckBox(){
		if(getChkboxAlternateEmails().isSelected()) {
			getChkboxAlternateEmails().click();
			log.info("Checkbox is not selected");
		}
		else {
			log.info("Checkbox is not slected and no changes made");
		}
	}

	public void selectMonth(String month) {
		selectByVisibleText(getDrpDwnMonth(), month);
//		Select select=new Select(getDrpDwnMonth());
//		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
//		select.selectByVisibleText(month);
//		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
	}
		
	public void selectMonth(int month) {
		Select select=new Select(getDrpDwnMonth());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByIndex(month);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
		}

	public void selectMonthValue(String month) {
		Select select=new Select(getDrpDwnMonth());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByValue(month);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
		}
	
	public void selectDay(String day) {
		Select select=new Select(getDrpDwnDay());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByVisibleText(day);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
	}
		
	public void selectDay(int day) {
		Select select=new Select(getDrpDwnDay());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByIndex(day);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
		}

	public void selectDayValue(String day) {
		Select select=new Select(getDrpDwnDay());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByValue(day);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
		}
	
	public void selectYear(String year) {
		Select select=new Select(getDrpDwnYear());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByVisibleText(year);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
	}
		
	public void selectYear(int year) {
		Select select=new Select(getDrpDwnYear());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByIndex(year);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
		}

	public void selectYearValue(String year) {
		Select select=new Select(getDrpDwnYear());
		log.info("Dropdown value selected "+select.getFirstSelectedOption().getText());
		select.selectByValue(year);
		log.info("Dropdown value updated "+select.getFirstSelectedOption().getText());
		}
	
}
