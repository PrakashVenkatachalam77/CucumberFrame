package selinium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsPrac {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver win=new ChromeDriver();
		win.get("https://total-qa.com/checkbox-example/");
		win.manage().window().maximize();

		List<WebElement> element = win.findElements(By.xpath("//input[@type='checkbox']"));

		for(int i=0;i<element.size();i++){
			if(i==1|| i==3) {
				element.get(i).click();
			}


		}

		Thread.sleep(2000);
		win.close();

	}

}


