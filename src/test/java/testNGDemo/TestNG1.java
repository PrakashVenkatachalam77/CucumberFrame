package testNGDemo;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG1 {
	
	@Test
	public void HA() {     // HARD ASSERT
		
		Assert.assertTrue(false);	
		
		System.out.println("Hard Assert Done");
		
	}

	@Test
	public void SA() {               //SOFT ASSERT
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(true);
		System.out.println("Soft Assert Done");
		sa.assertAll();
		
	}
}
