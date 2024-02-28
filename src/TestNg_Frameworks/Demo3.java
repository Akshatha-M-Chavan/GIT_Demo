package TestNg_Frameworks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void Fourth_test() {

		System.out.println("4th TC");
	}
	
	@BeforeClass
	public void BeforeClass() {

		System.out.println("It will Executes Before the Class");
	}
	@Test(groups= {"smoke"})
	public void SmokeTC3() {

		System.out.println("TC3 :Group is used for mainly Smoke Testing.");
	}

	@BeforeMethod
	public void BeforeMethod1() {

		System.out.println(
				"Before Method:This belongs to only Demo3 class: Will execute each time when the method executes in this Class");
	}
	
	@AfterClass
	public void AfterClass() {

		System.out.println("It will Executes After the Class");
	}

	@Test
	public void Fifth_test() {

		System.out.println("5th TC");
	}

	@Test
	public void Sixth_test() {

		System.out.println("6th TC");

	}

	@AfterMethod
	public void AfterMethod1() {

		System.out.println(
				"After Method :This belongs to only Demo3 class :  Will execute each time when the method executes in this Class");
	}

}