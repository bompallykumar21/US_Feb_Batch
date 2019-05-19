package cloudTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class sauceLabs {


	@Test
	public void sauceLabs() throws MalformedURLException {
		String userName="vijayrao21";
		String accessKey="621335a0-ab95-455d-b750-920760ee6534";
		String platform="macOS 10.13";
		String browserName="Safari";
		String version="11.1";
		

		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("username", userName);
		caps.setCapability("accessKey", accessKey);
		caps.setCapability("platform", platform);
		caps.setCapability("browserName", browserName);
		caps.setCapability("version", version);

		WebDriver driver=new RemoteWebDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), caps);
		driver.get("https://www.saucedemo.com");
		System.out.println(driver.getTitle());




	}

}
