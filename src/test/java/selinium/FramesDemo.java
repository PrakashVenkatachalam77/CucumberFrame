package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesDemo {

	public static void main(String[] args) {
    WebDriver driver = BaseClass.basecss("chrome");
    driver.get("https://ui.vision/demo/webtest/frames/");
    driver.manage().window().maximize();

   WebElement element = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
   driver.switchTo().frame(element);                                                          // Handling Frame using Web element.
   driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Good Morning");

    driver.switchTo().frame(1);                                                               // Handling Frame using Index Value.
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Good Afternoon");


	}

}
