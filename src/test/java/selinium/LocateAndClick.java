package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LocateAndClick {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver open= new ChromeDriver();
		open.get("https://www.amazon.in/");
		open.manage().window().maximize();
		WebElement ab=open.findElement(By.id("twotabsearchtextbox"));
		ab.sendKeys("Mobile Phones");
		WebElement tr=open.findElement(By.id("nav-search-submit-button"));
		tr.click();
		open.manage().window().minimize();
		//		WebElement d= open.findElement(By.className("a-size-medium a-color-base a-text-normal"));
//		d.click();
	}

}
