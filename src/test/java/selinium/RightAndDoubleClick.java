package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {
	
	public static void main(String[] args) {
		
		WebDriver webDriver = BaseClass.basecss("chrome");
		
		webDriver.manage().window().maximize();
		
		webDriver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement element = webDriver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac= new Actions(webDriver);
		
		ac.contextClick(element).build().perform();
		
	    webDriver.findElement(By.xpath("//span[text()='Cut']")).click();
	    
	    Alert alert = webDriver.switchTo().alert();
	    
	    alert.accept();
	}

}
