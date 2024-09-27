package testNGDemo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG1 {

	@Test(priority=2,description="This is the Third Case to be Executed",invocationCount=3)
	public void HA() {     // HARD ASSERT
		Assert.assertTrue(false);
		System.out.println("Hard Assert Done");

	}

	@Test(priority=1,description="This is the Second Case to be Executed",invocationCount=3,dependsOnMethods="HA",alwaysRun=true)
	public void SA() {               //SOFT ASSERT
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(true);
		System.out.println("Soft Assert Done");
		sa.assertAll();

	}
	@Test(priority=0,description="This is the First Case to be Executed",invocationCount=5,enabled=false)
	public void method3() {

		System.out.println("Third Method");
	}

	@BeforeMethod
	public void annotMet() {
		System.out.println("Before Method Annotation");

	}


}
