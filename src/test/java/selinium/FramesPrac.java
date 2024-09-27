package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPrac {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();


		driver.switchTo().frame("frm3");
		driver.switchTo().frame("frm2");

		driver.findElement(By.xpath("//input[@class='bcTextBox']")).sendKeys("Prakash");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Venkat");

		driver.findElement(By.id("malerb")).click();

		List<WebElement> elements = driver.findElements(By.tagName("input"));
        for(WebElement ab:elements) {

        	String attribute = ab.getAttribute("id");

        	if(attribute.equals("englishchbx")|| attribute.equals("latinchbx")) {
				ab.click();
			}

        }

        driver.findElement(By.id("email")).sendKeys("prakash@gmail.com");

        driver.findElement(By.id("password")).sendKeys("Prakash@1998");

        driver.findElement(By.id("registerbtn")).click();

        driver.switchTo().parentFrame();

        driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Parent Frame Text");

        driver.switchTo().defaultContent();

        driver.findElement(By.className("frmTextBox")).sendKeys("Default Content Text");

		}

}
