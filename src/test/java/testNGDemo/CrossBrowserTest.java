package testNGDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CrossBrowserTest extends BaseClass {
	@Test
	public void first() {

		drive.get("https://testautomationpractice.blogspot.com/");

		drive.findElement(By.id("name")).sendKeys("V.PRAKASH");

		drive.findElement(By.id("email")).sendKeys("prakash@gmail.com");

		drive.findElement(By.id("phone")).sendKeys("8610368086");
	}

}
