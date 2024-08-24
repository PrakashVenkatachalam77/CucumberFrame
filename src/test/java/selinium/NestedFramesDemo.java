package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesDemo {

	public static void main(String[] args) {
		 WebDriver driver = BaseClass.basecss("chrome");
		    driver.get("https://ui.vision/demo/webtest/frames/"); 
		    driver.manage().window().maximize();
		    
		    WebElement element = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		    driver.switchTo().frame(element);      // Handling Outer Frame
		    
		    WebElement element2 = driver.findElement(By.xpath("//iframe[@width='650']"));
		    driver.switchTo().frame(element2);     // Handling Inner Frame
		    
//	    driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("Hello");
//		    driver.findElement(By.xpath("//span[text()='Clear selection']")).click();
		    
		    driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']/following::span[text()='Hi, I am the UI.Vision IDE']")).click();
		   List<WebElement> elements = driver.findElements(By.xpath("//div[@class='uHMk6b fsHoPb']"));
		   for (WebElement a:elements) {
			   a.click();
		   }
			  driver.findElement(By.xpath("//span[contains(text(),'Choose')]")).click();
			   
//		   driver.findElement(By.xpath("//span[text()='Next']")).click();
//		   WebElement element3 = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
//		   WebDriverWait jh= new WebDriverWait(driver, Duration.ofSeconds(10));
//		  jh.until(ExpectedConditions.visibilityOf(element3)).sendKeys("Short Message");
//		  
//		  driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']")).sendKeys("It is a Long Answer");
//		  
//		  driver.findElement(By.xpath("//span[text()='Submit']")).click();
		   
		   }
	}

