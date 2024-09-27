package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptPrac {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");


		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement element = driver.findElement(By.xpath("//textarea[@id='textarea']"));

		JavascriptExecutor js= (JavascriptExecutor)driver;

		js.executeScript("arguments[0].style.border='3px solid blue';", element);
	}

}
