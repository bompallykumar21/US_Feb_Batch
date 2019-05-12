package testCases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNG.testNGAnnotations;

public class TestCase3 extends testNGAnnotations{


	@BeforeSuite
	public void beforeSuite() {
		System.out.println("#This is Before Suite Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("#This is After Suite Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("#This is Before Test Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("#This is After Test Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("#This is Before Class Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("#This is After Class Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("#This is Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("#This is After Method");
	}

	@Test 
	public void test1() {
		System.out.println("#This is Test");
		
	}
//	--------------------------------------
	@BeforeSuite
	public void beforeSuite2() {
		System.out.println("#This is Before Suite2 Method");
	}
	
	@AfterSuite
	public void afterSuite2() {
		System.out.println("#This is After Suite2 Method");
	}
	
	@BeforeTest
	public void beforeTest2() {
		System.out.println("#This is Before Test2 Method");
	}
	
	@AfterTest
	public void afterTest2() {
		System.out.println("#This is After Test2 Method");
	}
	
	@BeforeClass
	public void beforeClass2() {
		System.out.println("#This is Before Class2 Method");
	}
	
	@AfterClass
	public void afterClass2() {
		System.out.println("#This is After Class2 Method");
	}
	
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("#This is Before2 Method");
	}
	
	@AfterMethod
	public void afterMethod2() {
		System.out.println("#This is After2 Method");
	}

	@Test 
	public void test2() {
		System.out.println("#This is Test2");
		
	}
}