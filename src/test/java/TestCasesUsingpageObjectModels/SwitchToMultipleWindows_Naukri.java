package TestCasesUsingpageObjectModels;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import hdfcBankPage.hdfcBankPage;
import testBase.TestBase;

public class SwitchToMultipleWindows_Naukri extends TestBase {
	String url="https://www.naukri.com/";

	@Test
	public void rediff() throws InterruptedException{
		log = Logger.getLogger("Naukri");
		enterURL(url);	
		Thread.sleep(6000);
	
		String MainWindow=driver.getWindowHandle();  //for main window name
		log.info("Main Window Name: "+MainWindow);

		Set<String> allWindows=driver.getWindowHandles();  //it stores all the windows
		for(String windows:allWindows) {
			log.info("All Windows names: "+windows);
		}
	}
}
