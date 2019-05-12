package TestCasesUsingpageObjectModels;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import SeleniumFramesHomePage.seleniumFrames;
import testBase.TestBase;

public class Frames extends TestBase{

	String url="https://seleniumhq.github.io/selenium/docs/api/java/index.html?overview-summary.html";

	@Test
	public void rediff() throws InterruptedException{
		log = Logger.getLogger("Rediff");
		enterURL(url);	
		Thread.sleep(2000);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();;
		seleniumFrames frame=new seleniumFrames();
		frame.getLnkthoughtworks().click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();  //switch to default frame
//		driver.switchTo().frame("classFrame"); //switch tpo frame using name
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='classFrame']"))); //switch to frame using xpath
		
		Thread.sleep(2000);
		frame.getLnkthoughtworks().click();		
		driver.switchTo().frame("packageFrame");
	}

}
