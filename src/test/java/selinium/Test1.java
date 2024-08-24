package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = BaseClass.basecss("chrome");
	
	driver.manage().window().maximize();
	
	driver.get("https://www.bestbuy.com/");
	
	driver.findElement(By.cssSelector("img[alt='United States']")).click();	
	driver.findElement(By.cssSelector("span[class='v-p-right-xxs line-clamp']")).click();
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//a[text()='Create Account']"));
	
	element.click();
//	WebDriverWait ab= new WebDriverWait(driver, Duration.ofSeconds(10));
//	
//	ab.until(ExpectedConditions.visibilityOf(element)).click();
//	

	//driver.findElement(By.xpath("//a[text()='Create Account']")).click();
}
}
