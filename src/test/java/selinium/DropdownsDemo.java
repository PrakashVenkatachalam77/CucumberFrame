package selinium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownsDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.basecss("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[@id='female']")).click();   // Gender Selection
			
		List<WebElement> elements = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		
		for (WebElement week:elements) {
			
		     String attribute = week.getAttribute("id");
		     
		     if(attribute.equals("tuesday") || attribute.equals("friday"))                                       // Days Selection
		     
		     week.click();
		}
		
		WebElement element = driver.findElement(By.xpath("//select[@id='country']"));                           // Country Drop Down
		
		Select uy= new Select(element);
		
		uy.selectByVisibleText("Germany");
		
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='colors']"));                           // Color Drop Down
		
		Select lk= new Select(element2);
		
		lk.selectByValue("yellow");
		
		
		//driver.findElement(By.id("datepicker")).sendKeys("22/08/1998");                                        
		
		driver.findElement(By.id("datepicker")).click();
		
		
    	 driver.findElement(By.xpath("//td[@data-month='7' and @data-year='2024']/a[text()='22']")).click();     // Picking Date

	}

}
