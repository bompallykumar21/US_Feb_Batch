package TestCasesUsingpageObjectModels;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class test {

	public static void main(String[] args) throws AWTException, UnsupportedFlavorException, IOException {
		String result = "google.com";
		for(int i=0;i<result.length();i++)
		{
		System.out.println(result.charAt(i));
		}
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String copy = Keys.chord(Keys.CONTROL,Keys.chord("c"));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(copy);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clipboard.getContents(null);
		String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
		System.out.println("test###"+x);
		int a= result.length();
		int b = x.length();
		System.out.println(a);
		System.out.println(b);
		if(a<=b) 
		{
			System.out.println("Matched Character length");
		}else 
		{
			System.out.println("Issue In Character length");
		}
	}

}