package TestNg_Frameworks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	public void Seventh_test() {

		System.out.println("7th TC");
		Assert.assertTrue(false);
	}

	@Test(dataProvider="getdata")
	public void Eighth_test(String usernametest , String Passwordtest) {

		System.out.println("8th TC");
		System.out.println(usernametest);
		System.out.println(Passwordtest);

	}

	@Test
	public void Ninghth_test() {

		System.out.println("9th TC");
	}

	@DataProvider
	public Object[][] getdata() {
		// 1st combination : Username , PWD : Username is in 0th colm , PWD is in 1st : Good Credit History
		// 2nd combination : Username , PWD : No Credit History
		// 3rd combination : Username , PWD : Fraud Credit History

		// 3 stands for for how many times user wants to run and 2 is columns i.e username and pwd
		Object[][] data = new Object[3][2];
		
		//1st set
		//columns in the row are nothing but value for that particular combination (row)
		data[0][0]="Username1";
		data[0][1]="Password1";
		
		
		//2nd set
		data[1][0]="Username2";
		data[1][1]="Password2";
		
		//3rd set
		data[2][0]="Username3";
		data[2][1]="Password3";
		
		return data;
	}

}
