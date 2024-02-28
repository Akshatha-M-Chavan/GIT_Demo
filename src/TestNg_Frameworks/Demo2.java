package TestNg_Frameworks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	
	@AfterTest
	  public void LastTestExecution() {
		  
		  System.out.println("will exeute After 1st complete Test Annotation");
		    
	  }
	
	  @AfterSuite
	  public void LastSuite() {
		  
		  System.out.println("LastSuite : Is used basically for Global level and will exeute end of Suite");
		  
		  
		  
	  }
	  @Parameters({"URL"})	  
	 @Test
	  public void Third_test(String urlname) {
		  
		  System.out.println("Welcome to TestNg Framework design");
		  System.out.println(urlname);
		  
	  }
	 
	 @BeforeTest
	  public void BeforeTestExecution() {
		  
		  System.out.println("will exeute Before Test Annotation");
		  
		  
	  }
	 
	 @BeforeSuite
	  public void FirstSuite() {
		  
		  System.out.println("FirstSuite : Used for Global level TC and will exeute 1st before Suite");
		  
		  
	  }
}
