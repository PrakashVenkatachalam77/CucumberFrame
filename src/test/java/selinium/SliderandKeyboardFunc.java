package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class SliderandKeyboardFunc {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.basecss("chrome");
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Slider.html");
	
		WebElement element = driver.findElement(By.xpath("//*[@id=\"slider\"]/a"));
		
		Point location = element.getLocation();
		
		System.out.println(location);
		
		Actions ac= new Actions(driver);
		
		ac.dragAndDropBy(element, 200, 0).build().perform();
	}

}
