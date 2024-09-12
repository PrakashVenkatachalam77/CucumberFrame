package testNGDemo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo {
  @Test
  public void first() {
	  
	  System.out.println("Main First Test Case");
  }
  
  @Test
  public void second() {   
	  
	  System.out.println("Main Second Test Case");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Will Execute Before Method ");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Will Execute After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Will Execute Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Will Execute After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Will Execute Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Will Execute After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Will Execute Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Will Execute After Suite");
  }

}
