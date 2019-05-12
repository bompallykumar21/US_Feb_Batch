package TestCasesUsingpageObjectModels;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import hdfcBankPage.hdfcBankPage;
import testBase.TestBase;

public class SwitchToMultipleWindows extends TestBase {
	String url="https://www.hdfcbank.com/";

	@Test
	public void rediff() throws InterruptedException{
		log = Logger.getLogger("Rediff");
		enterURL(url);	

		Thread.sleep(3000);
		driver.switchTo().frame("destination_publishing_iframe_hdfcbank_0_name");
		Thread.sleep(2000);
		
		driver.findElement(By.className("popupCloseButton")).click();
		hdfcBankPage bank=new hdfcBankPage();
		bank.getBtnLogin().click();
		Thread.sleep(4000);

		String MainWindow=driver.getWindowHandle();  //for main window name
		log.info("Main Window Name: "+MainWindow);

		Set<String> allWindows=driver.getWindowHandles();  //it stores all the windows
		for(String windows:allWindows) {
			log.info("All Windows names: "+windows);
		}
	}
}
