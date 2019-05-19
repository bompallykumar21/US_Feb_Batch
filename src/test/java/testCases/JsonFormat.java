package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import testBase.TestBase;

public class JsonFormat extends TestBase{

	@Test
public void jsonFormat() {
		String json="{'name':'John', 'age':31, 'city':'New York'}";
		extentTest=extentReports.createTest("jsonFormat");
		
		extentTest.pass(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
		
		extentTest.pass(MarkupHelper.createLabel(json, ExtentColor.RED));
	}

}
