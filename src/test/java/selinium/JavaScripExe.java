package selinium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class JavaScripExe {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement element = driver.findElement(By.id("name"));

    	Actions ac= new Actions(driver);

		Robot rc= new Robot();

		JavascriptExecutor js= (JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='Prakash';", element);         // Using JavaScript Executor to send values

		WebElement element2 = driver.findElement(By.xpath("//label[@for='country']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element2);    // Using JavaScript Executor to scroll to a particular element

		WebElement element3 = driver.findElement(By.id("country"));

		ac.moveToElement(element3).click().build().perform();                 //using Actions Class to select an option from the DropDown

		for(int i=1;i<=5;i++) {
		rc.keyPress(KeyEvent.VK_DOWN);                                        // using Robot Class to move options through keyboard keys.

		rc.keyRelease(KeyEvent.VK_DOWN);

		}
		rc.keyPress(KeyEvent.VK_ENTER);

		WebElement element4 = driver.findElement(By.id("datepicker"));

		js.executeScript("arguments[0].value='22/08/1998';", element4);

		WebElement element5 = driver.findElement(By.xpath("//h1[@class='title']"));

		Timeouts wait = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Using JavaScript Executor to scroll from one element to another element.
		js.executeScript("arguments[0].scrollIntoView(true);arguments[1].scrollIntoView(true);", element4,element5);

		WebElement mail = driver.findElement(By.id("email"));

		js.executeScript("arguments[0].value='Prakash@gmail.com';", mail);

		WebElement phone = driver.findElement(By.id("phone"));

		js.executeScript("arguments[0].value='8610368086';", phone);

	}

}
