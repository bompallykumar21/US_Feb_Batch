package testCases;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;
import testNG.testNGAnnotations;

public class TestCase2 extends TestBase{

	@Test 
	public void test1() throws IOException {
		log.info("#This is Test1");		
		beforeSuite();
	}

	@Test 
	public void test2() {
		log.info("#This is Test2");		
	}
	
	@Test 
	public void test3() {
		log.info("#This is Test3");		
	}
}