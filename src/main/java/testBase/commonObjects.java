package testBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class commonObjects {
	public static Logger log = Logger.getLogger(TestBase.class.getName());
	public static WebDriver driver;
	public static String urlTest;
	public static String urlStage;
	public static String browserValue;
	public static String env;
	static String url;
}
