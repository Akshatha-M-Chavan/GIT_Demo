package TestNg_Frameworks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	
  @Test
  public void first_test() {
	  
	  System.out.println("Hello World");
	  
	  
  }
  
  @Parameters({"URL","Username"})
  @Test
  public void Second_test(String urlname, String username) {
	  
	  System.out.println("I am Akshatha");
	  System.out.println(urlname);
	  System.out.println(username);
	  
  }
  
  @Test(enabled=false)
  public void skiptestcase() {
	  
	  System.out.println("Execution will be skipped for this TC"); 
  }
  
  @Test(timeOut=4000)
  public void waitforfewsec() {
	  
	  System.out.println("This perticular TC will wait for 4 seconds"); 
  }
  
  @Test(dependsOnMethods= {"DEF"})
  public void ABC() {
	  
	  System.out.println("This will execte After DEF. Bcz ABC depends on This Method as per code");
	  
	  
  }
  
  @Test
  public void DEF() {
	  
	  System.out.println("This will execte first before ABC. Bcz ABC depends on This Method as per code");
	  
	  
  }
  
}
