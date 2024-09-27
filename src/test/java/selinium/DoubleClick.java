package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));

		Actions gf= new Actions(driver);

		gf.doubleClick(element).perform();





	}

}
