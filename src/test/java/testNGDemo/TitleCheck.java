package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleCheck extends BaseClassDemo {
	@Test
	public void title() {
		
		String title = driver.getTitle();
		String exptitle="Automation Testing Practice";
		System.out.println(title);
		Assert.assertEquals(title,exptitle);   //hardassertion
		
		
	}
	

}
