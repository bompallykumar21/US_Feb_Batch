package TestCasesUsingpageObjectModels;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import AmazonHomePage.amazonHomePage;
import testBase.TestBase;

public class amazonRightClickRobotClass extends TestBase{
	String url="https://www.amazon.in/";
	amazonHomePage homePage;
	String expectedOption="Amazon Prime Music";
	

	@Test
	public void amazon() throws InterruptedException, AWTException{
		log = Logger.getLogger("Amazon");
		enterURL(url);	
		homePage=new amazonHomePage();
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.contextClick().perform();  //right click
		Thread.sleep(3000);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
