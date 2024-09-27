package selinium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkDemo {

	public static void main(String[] args) {

		ChromeOptions mn= new ChromeOptions();

		mn.addArguments("--Headless");

		WebDriver basecss = new ChromeDriver(mn);

	  basecss.manage().window().maximize();

	  basecss.get("https://webdriveruniversity.com/index.html");

	  List<WebElement> elements = basecss.findElements(By.tagName("a"));

	  for(WebElement links:elements) {

		  String attribute = links.getAttribute("href");
		  BaseBroken.linkbase(attribute);
	  }

	}
}
