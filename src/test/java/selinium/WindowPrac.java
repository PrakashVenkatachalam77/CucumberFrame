package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPrac {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.manage().window().maximize();

	    driver.get("https://testautomationpractice.blogspot.com/");

	    WebElement element = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));

	    element.sendKeys("Selenium");

	    driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//child::a[@target='_blank']"));


	    for(WebElement all:elements) {

	    	all.click();
	    	}
	    }
	    }



