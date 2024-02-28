package TestNg_Frameworks;

import org.testng.annotations.Test;

public class Demo5 {
 
	@Test
	public void Tenth_test() {

		System.out.println("10th TC");
	}
	
	@Test(groups= {"smoke"})
	public void SmokeTC1() {

		System.out.println("TC1 :Group is used for mainly Smoke Testing.");
	}
	

	@Test
	public void Elventh_test() {

		System.out.println("11th TC");
	}
	
	@Test
	public void MobileSignin() {

		System.out.println("MobileSignin");
		
	}
	
	@Test(groups= {"smoke"})
	public void SmokeTC2() {

		System.out.println("TC2 :Group is used for mainly Smoke Testing.");
	}
	
	@Test
	public void MobileSignout() {

		System.out.println("MobileSignout");
	}
	
	@Test
	public void Registration() {

		System.out.println("Registration");
	}
}
