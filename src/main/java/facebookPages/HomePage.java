package facebookPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//input[@name='firstname123']") 
	WebElement txtFirstName;	
	
	@FindBy(name="lastname") 
	WebElement txtSurname;	
	
	@FindBy(xpath="//input[@name='reg_passwd__']") 
	WebElement txtPassword;	
	
	@FindBy(xpath="//input[@name='reg_email__']") 
	WebElement txtEmailMobile;	
	
	@FindBy(xpath="//select[@title='Day']") 
	WebElement drpdwnBirthDay;	
	
	@FindBy(xpath="//select[@title='Month']") 
	WebElement drpdwnBirthMonth;	
	
	@FindBy(xpath="//select[@title='Year']") 
	WebElement drpdwnBirthYear;		
	
	@FindBy(xpath="//label[contains(text(),'Female')]") 
	WebElement radioGenderFemale;		
	
	@FindBy(xpath="//label[contains(text(),'Male')]") 
	WebElement radioGenderMale;	
	
	@FindBy(xpath="//input[@value='Log In']") 
	WebElement btnLogIn;		
	
	@FindBy(xpath="//button[@name='websubmit']") 
	WebElement btnSignUp;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtSurname() {
		return txtSurname;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtEmailMobile() {
		return txtEmailMobile;
	}

	public WebElement getDrpdwnBirthDay() {
		return drpdwnBirthDay;
	}

	public WebElement getDrpdwnBirthMonth() {
		return drpdwnBirthMonth;
	}

	public WebElement getDrpdwnBirthYear() {
		return drpdwnBirthYear;
	}

	public WebElement getRadioGenderFemale() {
		return radioGenderFemale;
	}

	public WebElement getRadioGenderMale() {
		return radioGenderMale;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}	
	
}
