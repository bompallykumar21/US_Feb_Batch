package seleniumTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testBase.TestBase;

public class Facebook {
	static String browserPath;
	static String url;

	public static void main(String[] args) {
		Logger log = Logger.getLogger("Facebook Login");		
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		browserPath="./drivers/chromedriver.exe";
		url="http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", browserPath);
		WebDriver driver=new ChromeDriver();
		log.info("Launched browser");
		driver.manage().window().maximize();
		log.info("Browser opened in maximize mode");
		driver.get(url);
		log.info("URL is entered");
		WebElement txtUserID=driver.findElement(By.id("email"));
		txtUserID.sendKeys("entering user id");
		log.info("Entered text in emaail ID");
	}
}
