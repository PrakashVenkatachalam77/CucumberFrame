package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		Actions vc= new Actions(driver);

		vc.doubleClick(element).build().perform();

		Alert alert = driver.switchTo().alert();

		alert.accept();
	}

}
