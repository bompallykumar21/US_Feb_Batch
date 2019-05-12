package testCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class testGroups {
	
	@Test(priority=4, groups="group1")
	public void testa() {
		System.out.println("Testa");
	}
	
	@Test(priority=1, groups="group1")  //this test is not executed
	public void testb() {
		System.out.println("Testb");
	}

	@Test(priority=2, groups="group2")
	public void testd() {
		System.out.println("Testd");
		ArrayList list=new ArrayList();
//		System.out.println(list.get(2));		
	}

	@Test(priority=3,dependsOnGroups="group2")
	public void testc() {
		System.out.println("Testc");
	}

}
