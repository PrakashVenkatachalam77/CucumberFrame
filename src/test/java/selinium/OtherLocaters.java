package selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OtherLocaters {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver file= new ChromeDriver();
		file.get("https://www.google.com/");
		file.manage().window().maximize();
		WebElement ed = file.findElement(By.className("gLFyf"));
		ed.sendKeys("MS Dhoni");
		file.getPageSource();
		WebElement qa = file.findElement(By.name("btnK"));
		qa.click();
		WebElement ty = file.findElement(By.linkText("News"));
		ty.click();
		//file.getPageSource();
		file.getPageSource();
		WebElement ui = file.findElement(By.tagName("div"));
		ui.click();
//		WebElement oi = file.findElement(By.linkText("Hairstyle"));
//		oi.click();
		//WebElement s = file.findElement(By.tagName("div"));	
//	    file.getPageSource();
//		WebElement ut = file.findElement(By.className("YmvwI"));
//		ut.click();		
	}
	
	
}
