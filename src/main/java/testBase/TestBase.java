package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase extends commonObjects{

	public static void initializelog4j() {
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		log.info("Welcome to log4j");
		log.error("This is demonstration to log4j");
	}

	public void initializeProperties() throws IOException {
		Properties prpt=new Properties();
		File file1=new File("./config/configuration.properties");  //locating configuration file
		File file2=new File("./config/configuration2.properties");
		log.info("Configuration file is located"+file1);
		FileInputStream ipFile1=new FileInputStream(file1); //reading input file
		FileInputStream ipFile2=new FileInputStream(file2);
		log.info("Reading Input File"+ipFile1.toString());
		prpt.load(ipFile1);  //reading properties from input file
		prpt.load(ipFile2);  //reading properties from input file
		log.info("Reading properties file");
		browserValue=prpt.getProperty("browser");
		log.info("Browser value is: "+browserValue);
		String environmentValue=prpt.getProperty("environment");
		log.info("Environment value is: "+environmentValue);
		urlTest=prpt.getProperty("urlTest");
		urlStage=prpt.getProperty("urlStage");
		env=prpt.getProperty("environment");
		url=prpt.getProperty("url");
	}

	@BeforeSuite
	public void beforeSuite() throws IOException {
		System.out.println("############BeforeSuite##########");
		initializelog4j();
		initializeProperties();
	}

	@AfterSuite
	public void afterSuite() {	
		System.out.println("This is After Suite Method");
	}
	/*
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test Method");
	}
	 */

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class Method");
		openBrowser();
		//		enterURL();
	}

	private void openBrowser() {
		if(browserValue.equalsIgnoreCase("chrome")) {
			String browserPathChrome="./drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", browserPathChrome);
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--start-maximized");
//			options.addArguments("--disable-popup-blocking");
			options.setCapability("pageLoadStrategy", "none");
			driver=new ChromeDriver(options);
		}else
			if(browserValue.equalsIgnoreCase("ie")) {
				String browserPathIE="./drivers/IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", browserPathIE);
				driver=new InternetExplorerDriver();
			}	
		//		driver.manage().window().maximize();  
		log.info("Chrome Browser opened");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //webelement
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  //browser
	}

	public void enterURL() {
		if(env.equalsIgnoreCase("test")) {
			driver.get(urlTest);		
		}else
			if(env.equalsIgnoreCase("stage")) {
				driver.get(urlStage);		
			}	
			else {
				driver.get(url);
			}
		log.info("url entered");
	}

	public void enterURL(String url) {
		driver.get(url);
		log.info("url entered: "+url);
	}

	@AfterClass
	public void afterClass() {
//		driver.quit();  //close the browser
		System.out.println("This is After Class Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		//		System.out.println("This is Before Method"+ getClass().getEnclosingClass());
		//		System.out.println(getClass().getEnclosingClass().getEnclosingMethod().getName());
	}

	@AfterMethod
	public void afterMethod() {
		//		System.out.println("This is After Method"+this.getClass().getEnclosingMethod().getName());

	}

	public boolean isDisplayed(WebElement element) {
		if(element.isDisplayed()){
			log.info("Element is displayed");
			return true;
		}else
		{
			log.error("Element is not displayed");
			return false;
		}		
	}
	public boolean isenabled(WebElement element) {
		if(element.isEnabled()){
			log.info("Element is displayed");
			return true;
		}else
		{
			log.error("Element is not displayed");
			return false;
		}		
	}

	public boolean isSelected(WebElement element) {
		if(element.isSelected()){
			log.info("Element is displayed");
			return true;
		}else
		{
			log.error("Element is not displayed");
			return false;
		}		
	}

	public void selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
		log.info("Value selected from dropdown: "+value);
	}

	public void selectByIndex(WebElement element, int value) {
		Select select=new Select(element);
		select.selectByIndex(value);
		log.info("Index selected from dropdown: "+value);
	}

	public void selectByVisibleText(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
		log.info("Visiv=ble text selected from dropdown: "+value);
	}

}

